package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YandexPage {

    public WebElement enterField;

    WebDriver driver;
    public YandexPage(WebDriver driver) {
        this.driver = driver;
    }

    public  WebElement getEnterField(){
        enterField = By.xpath("//a[@class='home-link home-link_black_yes']").findElement(driver);
        return enterField;
    }

}
