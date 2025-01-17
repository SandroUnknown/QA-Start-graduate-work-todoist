package tests.mobile;

import api.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import data.DataStorage;
import drivers.ApiConfigDriver;
import drivers.BrowserstackConfigDriver;
import drivers.EmulationConfigDriver;
import io.qameta.allure.selenide.AllureSelenide;
import helpers.attachments.Attach;
import models.data.TestDataModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import screens.*;
import screens.components.BottomMenu;
import screens.components.CreateSectionModalWindow;
import screens.components.CreateTaskModalWindow;

import java.util.List;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class MobileTestBase {

    private static final String env = System.getProperty("env", "local");

    static final List<TestDataModel> TEMPLATES = new DataStorage("data/Templates.json").getTemplates();

    final ProjectsApi projectsApi = new ProjectsApi();
    final SectionsApi sectionsApi = new SectionsApi();
    final TasksApi tasksApi = new TasksApi();

    final AuthScreen authScreen = new AuthScreen();
    final BottomMenu bottomMenu = new BottomMenu();
    final BrowseScreen browseScreen = new BrowseScreen();
    final ProjectScreen projectScreen = new ProjectScreen();
    final ProjectEditScreen projectEditScreen = new ProjectEditScreen();
    final CreateSectionModalWindow createSectionModalWindow = new CreateSectionModalWindow();
    final CreateTaskModalWindow createTaskModalWindow = new CreateTaskModalWindow();
    final TaskEditScreen taskEditScreen = new TaskEditScreen();

    @BeforeAll
    static void beforeAll() {

        new ApiConfigDriver();

        if (env.equals("remote")) {
            Configuration.browser = BrowserstackConfigDriver.class.getName();
        } else {
            Configuration.browser = EmulationConfigDriver.class.getName();
        }

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
        
        Attach attach = new Attach();
        String sessionId = Selenide.sessionId().toString();
        
        if (env.equals("local")) {
            attach.screenshotAs("Last screenshot");
        }
        
        Attach.pageSource();
        closeWebDriver();
        
        if (env.equals("remote")) {
            attach.addVideo(sessionId);
        }   
    }
}
