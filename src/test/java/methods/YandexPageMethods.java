package methods;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.YandexPage;

public class YandexPageMethods {

    WebDriver driver;

    public YandexPageMethods(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Вход на почту яндекса с главной страницы")
    public void clickToMail() {
        YandexPage yandexPage = new YandexPage(driver);
        WebElement enterField = yandexPage.getEnterField();
        enterField.click();
    }
}
