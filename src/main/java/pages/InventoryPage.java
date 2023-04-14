package pages;

import driver.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class InventoryPage {

    private WebDriver driver;

    public InventoryPage() {
        driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='https://twitter.com/saucelabs']")
    WebElement twitterIcon;


    public void scrollToBottom() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void clickOnTwitterIcon() {
        twitterIcon.click();
    }

    public void verifyTwitterIsOpenedInNewTab() {
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        String expectedUrl = "https://twitter.com/saucelabs";
        String currentUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, currentUrl);
    }
}
