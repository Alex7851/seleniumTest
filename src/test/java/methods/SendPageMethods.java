package methods;
import io.qameta.allure.Step;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.SendPage;
import static methods.RegistrationPageMethods.mailAddr;

public class SendPageMethods {

    public SendPageMethods(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;

    @Step("Отправка письма с данными")
    public void sendMail() {

        Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = caps.getBrowserName();
        int countMails = methods.InboxPageMethods.cntMails;
        String strTheme = "Количество писем (данные от тестировщика)";
        String strText = "Количество писем полученных с адреса alex7851@yandex.ru составляет: " + countMails;
        SendPage sendPage = new SendPage (driver);


        WebElement recepientField = sendPage.getRecepientField();
        recepientField.sendKeys(mailAddr);

        WebElement themeField = sendPage.getThemeField();
        themeField.click();

        WebElement themeFieldForFirefox = sendPage.getThemeFieldForFirefox();
        themeFieldForFirefox.sendKeys(strTheme);

        if (browserName.contains("internet")) {
            WebElement mainTextFieldForIE = sendPage.getMainTextFieldForIE();
            mainTextFieldForIE.click();
            mainTextFieldForIE.sendKeys(strText);
        } else {
            WebElement mainTextField = sendPage.getMainTextField();
            mainTextField.click();
            mainTextField.sendKeys(strText);
        }

       WebElement buttonSubmit = sendPage.getButtonSubmit();
       buttonSubmit.click();

    }

}
