package tests.web;

import api.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import data.DataStorage;
import drivers.ApiConfigDriver;
import drivers.WebConfigDriver;
import helpers.attachments.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import models.data.TestDataModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.ProjectPage;
import pages.SectionPage;
import pages.TaskPage;

import java.util.List;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class WebTestBase {

    static final List<TestDataModel> TEMPLATES = new DataStorage("data/Templates.json").getTemplates();

    final ProjectsApi projectsApi = new ProjectsApi();
    final SectionsApi sectionsApi = new SectionsApi();
    final TasksApi tasksApi = new TasksApi();

    final ProjectPage projectPage = new ProjectPage();
    final SectionPage sectionPage = new SectionPage();
    final TaskPage taskPage = new TaskPage();

    @BeforeAll
    public static void setUp() {

        new ApiConfigDriver();
        new WebConfigDriver();
    }

    @BeforeEach
    void preTest() {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {

        Attach.screenshotAs("Last screenshot");
        if (!Configuration.browser.equals("firefox")) {
            Attach.pageSource();
            Attach.browserConsoleLogs();
        }
        Attach.addVideo();
        closeWebDriver();
    }
}