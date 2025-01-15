package helpers.browserstack;

import config.CredentialsConfig;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import models.apps.UploadAppResponseModel;
import models.apps.UploadedAppsListResponseModel;
import org.aeonbits.owner.ConfigFactory;

import java.io.File;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Browserstack {

    private static final CredentialsConfig credentialsConfig =
            ConfigFactory.create(CredentialsConfig.class, System.getProperties());

    public static String videoUrl(String sessionId) {

        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic(credentialsConfig.getBrowserstackUser(), credentialsConfig.getBrowserstackKey())
                .get(url)
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }

    public String getAppUrl(String appName) {

        // TODO : удалить на релизе
        //deleteApp("9f36839290dfdc9f4f8110c1a2b748e80d786887");

        String appUrl = checkUploadedApp(appName);

        if (appUrl.isEmpty()) {
            return uploadApp(appName);
        } else {
            return appUrl;
        }
    }

    private String checkUploadedApp(String appName) {

        String response = given()
                .auth().preemptive().basic(credentialsConfig.getBrowserstackUser(), credentialsConfig.getBrowserstackKey())
                .when()
                .get("https://api-cloud.browserstack.com/app-automate/recent_apps")
                .then()
                .statusCode(200)
                .log().all()
                .extract()
                .asString();

        if (!response.contains("No results found")) {
            List<UploadedAppsListResponseModel> appList =
                    new JsonPath(response).getList(".", UploadedAppsListResponseModel.class);

            for (UploadedAppsListResponseModel app : appList) {
                if (app.getAppName().equals(appName)) {
                    return app.getAppUrl();
                }
            }
        }

        return "";
    }

    private String uploadApp(String appName) {

        String path = String.format("src/test/resources/apps/%s", appName);
        File file = new File(path);

        return given()
                .auth().preemptive().basic(credentialsConfig.getBrowserstackUser(), credentialsConfig.getBrowserstackKey())
                .contentType(ContentType.MULTIPART)
                .multiPart("file", file)
                .when()
                .post("https://api-cloud.browserstack.com/app-automate/upload")
                .then()
                .statusCode(200)
                .log().all()
                .extract().as(UploadAppResponseModel.class)
                .getAppUrl();
    }

    // TODO : удалить на релизе
    private void deleteApp(String appId) {

        given()
                .auth().preemptive().basic(credentialsConfig.getBrowserstackUser(), credentialsConfig.getBrowserstackKey())
                .when()
                .delete("https://api-cloud.browserstack.com/app-automate/app/delete/" + appId)
                .then()
                .statusCode(200)
                .log().all()
                .extract()
                .asString();
    }
}