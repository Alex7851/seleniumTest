package methods;
import com.opencsv.CSVReader;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.RegistrationPage;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class RegistrationPageMethods {
    public static String mailAddr;
    WebDriver driver;

    public RegistrationPageMethods(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Прохождение пунктов авторизации")
    public void registerUser() throws IOException {

        CSVReader reader = new CSVReader(new FileReader("externalData.csv"), ',', '"', 1);
        List<String[]> allRows = reader.readAll();

        String psswrd = null;
        String login = null;

        int i = 0;

        for (String[] row : allRows) {
            if (i == 0) login = row[0];
            if (i == 1) psswrd = row[0];
            if (i == 2) mailAddr = row[0];

            i++;
        }
        RegistrationPage registrationPage = new RegistrationPage (driver);

        WebElement loginField = registrationPage.getLoginField();
        WebElement buttonSubmit = registrationPage.getButtonSubmit();

        loginField.sendKeys(login);
        buttonSubmit.click();

        WebElement passwordField = registrationPage.getPasswordField();
        passwordField.sendKeys(psswrd);

        buttonSubmit = registrationPage.getButtonSubmit();
        buttonSubmit.click();
    }
}
