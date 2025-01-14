package tests.mobile;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import data.DataStorage;
import drivers.ApiConfigDriver;
import drivers.BrowserstackDriver;
//import drivers.EmulationDriver;
import io.qameta.allure.selenide.AllureSelenide;
import models.data.TestDataModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import screens.*;
import screens.components.BottomMenu;

import java.util.List;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class MobileTestBase {

    static List<TestDataModel> TEMPLATES;

    AuthScreen authScreen = new AuthScreen();
    BottomMenu bottomMenu = new BottomMenu();
    BrowseScreen browseScreen = new BrowseScreen();
    ProjectScreen projectScreen = new ProjectScreen();
    ProjectEditScreen projectEditScreen = new ProjectEditScreen();
    SectionEditScreen sectionEditScreen = new SectionEditScreen();
    TaskCreateScreen taskCreateScreen = new TaskCreateScreen();


    @BeforeAll
    static void beforeAll() {

        // TODO : хардкодить адрес с данными? === "data/Templates.json"
        TEMPLATES = new DataStorage("data/Templates.json").getTemplates();

        new ApiConfigDriver();
        Configuration.browser = BrowserstackDriver.class.getName();

        Configuration.browserSize = null;
        Configuration.timeout = 30000;
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void addAttachments() {
        //Attach attach = new Attach();
       /* if (System.getProperty("deviceHost").equals("browserstack")) {
            String sessionId = Selenide.sessionId().toString();
            attach.addVideo(sessionId);
        }
        if (System.getProperty("deviceHost").equals("emulation")) {
            attach.screenshotAs("Last screenshot");
        }*/
        //Attach.pageSource();
        closeWebDriver();
    }

    /*@AfterEach
    void cleanData() {
        projectsApi.deleteProjects();
        labelsApi.deleteLabels();

    }*/
}