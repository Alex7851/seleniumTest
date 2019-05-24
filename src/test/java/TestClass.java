import methods.InboxPageMethods;
import methods.RegistrationPageMethods;
import methods.SendPageMethods;
import methods.YandexPageMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.io.IOException;
import java.net.MalformedURLException;

public class TestClass {

    WebDriver driver;
    @BeforeClass(alwaysRun = true)
    @Parameters({"os", "browser", "url", "node"})
    public void setUp(String os, String browser, String url, String node) throws MalformedURLException {
        SetupTestDriver setupTestDriver = new SetupTestDriver(os, browser, url, node);
        driver = setupTestDriver.getDriver();
    }

    YandexPageMethods yandexPageMethods;
    RegistrationPageMethods regPageMethods;
    InboxPageMethods inboxPageMethods;
    SendPageMethods sendPageMethods;

    @Test
    public void CheckSomething() throws IOException {

        yandexPageMethods = new YandexPageMethods(driver);
        regPageMethods = new RegistrationPageMethods(driver);
        inboxPageMethods = new InboxPageMethods(driver);
        sendPageMethods = new SendPageMethods(driver);

        yandexPageMethods.clickToMail();
        regPageMethods.registerUser();
        inboxPageMethods.countMails();
        sendPageMethods.sendMail();

    }

    @AfterClass(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }

}
