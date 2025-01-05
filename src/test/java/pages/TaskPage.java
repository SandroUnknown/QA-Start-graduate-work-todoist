package pages;

import com.codeborne.selenide.SelenideElement;
import enums.Color;
import enums.ViewStyle;
import io.qameta.allure.Step;
import models.projects.ProjectRequestModel;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TaskPage {

    private final String basePath = "app/project/%s";

    private SelenideElement getAddTaskButtonElement(String sectionId) {
        String str = String.format("footer[aria-labelledby='section-%s'] button.plus_add_button", sectionId);
        return $(str);
    }  

    private SelenideElement getTaskPriorityDropdownElement(String priority) {
        String str = String.format(".priority_picker_item data-value='$s'", priority);
        return $(str);
    }  

    private final SelenideElement
            taskContentInputElement = $("div.task_editor__content_field div.tiptap"),
            taskPriorityButtonElement = $("div[data-priority]"),


    div[data-priority]

    /*
    private final SelenideElement
            addSectionButtonElement = $("button.board_add_section_button"),
            sectionNameInputElement = $("div.board_view__add_section input"),
            createSectionButtonElement = $("div.board_view__add_section button[type='submit']"),
            deleteSectionButtonElement = $$("div.reactist_menulist div").last(),
            confirmDeleteSectionButtonElement = $$("div[data-testid='modal-overlay'] footer button").last(),
            separatorBetweenSectionsElement = $$("div.board_add_section_trigger__container");   // он не СелинидЭлемент !

    private final SelenideElement
            sectionCheckElement = $$("[data-testid='board-section']"),    // он не СелинидЭлемент !
            addProjectButtonElement = $("[aria-label='Добавить проект']"),
            projectNameInputElement = $("input[name='name']");
    */

    @Step("Открыть страницу.")
    public TaskPage openPage(String projectId) {
        String path = String.format(basePath, projectId);
        open(path);
        return this;
    }

    @Step("Ввести логин и пароль.")
    public TaskPage login() {
        new AuthPage().login();
        return this;
    }
    
    @Step("Нажать на кнопку 'Добавить задачу'.")
    public TaskPage clickOnAddTask(String sectionId) {
        getAddTaskButtonElement(sectionId).click();
        return this;
    }

    @Step("Ввести текст задачи.")
    public TaskPage inputTaskContent(String taskContent) {
        //taskContentInputElement.click(); // TODO : вероятно не нужно предварительно кликать, но это не точно
        taskContentInputElement.setValue(taskContent);
        return this;
    }
    
    @Step("Выбрать приоритет задачи.")
    public TaskPage selectTaskPriority(String taskPriority) {
        taskPriorityButtonElement.click();
        getTaskPriorityDropdownElement(taskPriority).click();
        return this;
    }











    
   /*
    @Step("Нажать на кнопку 'Добавить раздел'.")
    public TaskPage clickOnAddSection() {
        addSectionButtonElement.click();
        return this;
    }


    @Step("Навести мышку на разделительную линию между разделами и нажать на неё.")
    public SectionPage clickOnSeparatorBetweenSections(int separatorIndex) {
        //separatorBetweenSectionsElement.get(separatorIndex).hover(); // TODO : надо ли на него наводиться мышкой?
        separatorBetweenSectionsElement.get(separatorIndex).click();
        return this;
    }
    
    @Step("Ввести имя раздела.")
    public SectionPage inputSectionName(String sectionName) {
        sectionNameInputElement.setValue(sectionName);
        return this;
    }

    @Step("Нажать кнопку 'Добавить раздел'.")
    public SectionPage addSection() {
        createSectionButtonElement.click();
        return this;
    }

    @Step("Нажать на кнопку 'Другие действия' (три точки справа от названия раздела).")
    public SectionPage clickOtherActions(String sectionId) {
        getOtherActionsElement(sectionId).click();
        return this;
    }

    @Step("Нажать на кнопку 'Удалить'.")
    public SectionPage clickDeleteSectionButton() {
        deleteSectionButtonElement.click();
        return this;
    }

    @Step("Подвердить удаление раздела.")
    public SectionPage clickConfirmDeleteSectionButtonElement() {
        confirmDeleteSectionButtonElement.click();
        return this;
    }

    @Step("Проверить, что раздел был успешно создан в указанном месте.")
    public SectionPage checkSuccsessfulCreatedSection(int sectionIndex, String sectionName) {
        sectionCheckElement.get(sectionIndex).shouldHave(text(sectionName));
        return this;
    }

    @Step("Проверить, что раздел был успешно удалён (отсутствует в списке разделов).")
    public SectionPage checkSuccsessfulDeleteSection(String sectionName) {
        sectionCheckElement.forEach(element -> element.shouldNotHave(text(sectionName)));
        return this;
    }
  */
}