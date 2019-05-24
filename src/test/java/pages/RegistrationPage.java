package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

    public  WebElement loginField;
    public  WebElement passwordField;
    public  WebElement buttonSubmit;

    WebDriver driver;
    public  RegistrationPage(WebDriver driver)  { this.driver = driver;
    }

    public  WebElement getLoginField() {
        loginField = By.xpath("//input[@id='passp-field-login']").findElement(driver);
        return loginField;
    }
    public  WebElement getPasswordField() {
        passwordField = By.xpath("//input[@id='passp-field-passwd']").findElement(driver);
        return passwordField;
    }
    public  WebElement getButtonSubmit() {
        buttonSubmit = By.xpath("//button[@type='submit']").findElement(driver);
        return buttonSubmit;
    }

}