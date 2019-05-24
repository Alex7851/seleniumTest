package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class InboxPage {

    public  WebElement inboxIndicator;
    public  WebElement searchField;
    public  WebElement enterIco;
    public  WebElement countMails;

    WebDriver driver;
    public InboxPage(WebDriver driver) {
        this.driver = driver;
    }

    public  WebElement getInboxIndicator() {
        inboxIndicator = By.xpath("//*[@class='mail-ComposeButton-Text']").findElement(driver);
        return inboxIndicator;
    }
    public  WebElement getSearchField() {
        searchField = By.xpath("//*[@class='textinput__control']").findElement(driver);
        return searchField;
    }

    public  WebElement getEnterIco() {
        enterIco = By.xpath("//div[@class='mail-SearchContainer has-left-gap']/button").findElement(driver);
        return enterIco;
    }
    public  List getCountMails() {
        List<WebElement> countMails = By.xpath("//div[@class='mail-MessageSnippet-Content']").findElements(driver);
        return  countMails;
    }

}