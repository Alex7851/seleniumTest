package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendPage {

    public  WebElement recepientField;
    public  WebElement mainTextField;
    public  WebElement mainTextFieldForIE;
    public  WebElement themeField;
    public  WebElement themeFieldForFirefox;
    public  WebElement buttonSubmit;

    WebDriver driver;
    public SendPage(WebDriver driver) {
        this.driver = driver;
    }

    public  WebElement getRecepientField() {
        recepientField = By.xpath("//div[@class='js-compose-field mail-Bubbles']").findElement(driver);
        return recepientField;
    }
    public  WebElement getMainTextField() {
        mainTextField = By.xpath("//div[@id='cke_1_contents']/div").findElement(driver);
        return mainTextField;
    }
    public  WebElement getMainTextFieldForIE() {
        mainTextFieldForIE = By.xpath("//span[@id='cke_1_contents']/div").findElement(driver);
        return mainTextFieldForIE;
    }
    public  WebElement getThemeField() {
        themeField = By.xpath("//label[@data-key='view=compose-field-subject']").findElement(driver);
        return themeField;
    }
    public  WebElement getThemeFieldForFirefox() {
        themeFieldForFirefox = By.xpath("//label[@data-key='view=compose-field-subject']/div[@class='mail-Compose-Field-Input']/input").findElement(driver);
        return themeFieldForFirefox;
    }
    public  WebElement getButtonSubmit() {
        buttonSubmit = By.xpath("//button[@type='submit']").findElement(driver);
        return buttonSubmit;
    }
}