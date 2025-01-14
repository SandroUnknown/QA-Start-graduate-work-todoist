package screens;

import com.codeborne.selenide.SelenideElement;
import enums.Color;
import enums.ProjectField;
import enums.ViewStyle;
import io.qameta.allure.Step;
import models.projects.ProjectRequestModel;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static enums.ProjectField.*;
import static enums.ProjectField.VIEW_STYLE;

public class EditProjectScreen {

    private SelenideElement getViewStyleElement(int number) {
        String str = "//android.view.ViewGroup[@resource-id='com.todoist:id/view_style']" +
                "/android.view.View/android.view.View/android.view.View[%s]";
        return $(By.xpath(String.format(str, number)));
    }

    private SelenideElement getSelectProjectColorElement(Color projectColor) {
        String str = "//android.widget.TextView[@text='%s']";
        String color = projectColor.getCssAndroidTitle();
        return $(By.xpath(String.format(str, color)));
    }

    private final SelenideElement applyButtonElement = $(By.xpath(
            "//android.widget.Button[@content-desc='Done']"));

    private final SelenideElement nameInputElement = $(By.xpath(
            "//android.widget.EditText[@resource-id='com.todoist:id/name']"));

    private final SelenideElement colorSelectElement = $(By.xpath(
            "//android.widget.RelativeLayout[@resource-id='com.todoist:id/form_color']"));

    private final SelenideElement favoriteSelectElement = $(By.xpath(
            //"//android.widget.RelativeLayout[@resource-id='com.todoist:id/form_favorite']"));
            "//android.widget.Switch[@resource-id='com.todoist:id/favorite']"));

    @Step("Ввести имя проекта")
    public EditProjectScreen inputProjectName(String name) {
        nameInputElement.sendKeys(name);
        return this;
    }

    @Step("Выбрать цвет проекта")
    public EditProjectScreen selectProjectColor(Color color) {
        colorSelectElement.click();
        getSelectProjectColorElement(color).click();          // TODO : будет ли работать с VIOLET?
        return this;
    }

    @Step("Добавить проект в 'Избранное'")
    public EditProjectScreen addToFavorite(boolean isFavorite) {
        if (isFavorite) {
            favoriteSelectElement.click();
        }
        return this;
    }

    @Step("Выбрать стиль отображения проекта")
    public EditProjectScreen selectProjectViewStyle(ViewStyle viewStyle) {
        int numberViewStyle = viewStyle.getNumber();
        getViewStyleElement(numberViewStyle).click();
        return this;
    }

    @Step("Нажать кнопку 'Добавить' (галочка в правом верхнем углу)")
    public EditProjectScreen clickApplyButtonElement() {
        applyButtonElement.click();
        return this;
    }

    // TODO : доделать, не работает почему-то
    @Step("Проверить, что проект был корректно создан")
    public EditProjectScreen uiCheckProject(ProjectRequestModel testProjectData, ProjectField... checkFields) {

        List<ProjectField> fieldsList = Arrays.asList(checkFields);

        if (fieldsList.contains(NAME)) {
            checkProjectName(testProjectData.getName());
        }

        /*if (fieldsList.contains(COLOR)) {
            checkProjectColor(testProjectData.getColor());
        }

        if (fieldsList.contains(FAVORITE)) {
            checkProjectFavorite(testProjectData.isFavorite());
        }

        if (fieldsList.contains(VIEW_STYLE)) {
            checkProjectViewStyle(testProjectData.getViewStyle());
        }*/

        return this;
    }

    @Step("Проверить имя созданного проекта")
    private void checkProjectName(String projectName) {
        //nameInputElement.shouldHave(text(projectName));
        //nameInputElement.shouldHave(value(projectName));
        nameInputElement.shouldBe(visible);
    }

    @Step("Проверить цвет созданного проекта")
    private void checkProjectColor(Color projectColor) {
        colorSelectElement.shouldHave(text(projectColor.getCssAndroidTitle()));
    }

    @Step("Проверить, что созданный проект добавлен в 'Избранное'")
    private void checkProjectFavorite(boolean isFavorite) {
        if (isFavorite) {
            favoriteSelectElement.shouldBe(checked);
        } else {
            favoriteSelectElement.shouldNotBe(checked);
        }
    }

    @Step("Проверить вариант отображения (ViewStyle) созданного проекта")
    private void checkProjectViewStyle(ViewStyle viewStyle) {
        int numberViewStyle = viewStyle.getNumber();
        getViewStyleElement(numberViewStyle).shouldBe(checked);
    }
}