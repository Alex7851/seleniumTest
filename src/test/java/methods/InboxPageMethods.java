package methods;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.InboxPage;
import java.util.List;
import static methods.RegistrationPageMethods.mailAddr;

public class InboxPageMethods {
    public static int cntMails;

    WebDriver driver;
    public InboxPageMethods(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Определение количества писем с адреса alex7851@yandex.ru")
    public void countMails() {
       InboxPage inboxPage = new InboxPage (driver);

       WebElement searchField = inboxPage.getSearchField();
       searchField.sendKeys(mailAddr);

       WebElement enterIco = inboxPage.getEnterIco();
       enterIco.click();

        String url = driver.getCurrentUrl();
        url = url + "&fid=1";
        driver.get(url);
        driver.navigate().refresh();

        List countMails = inboxPage.getCountMails();
        cntMails= countMails.size();

        WebElement inboxIndicator = inboxPage.getInboxIndicator();
        inboxIndicator.click();
    }

}
