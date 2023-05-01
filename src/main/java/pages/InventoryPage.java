package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static driver.DriverFactory.getDriver;

public class InventoryPage {

    public InventoryPage() {
        driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    private WebDriver driver;
     WebDriverWait wait = new WebDriverWait(getDriver(), 10);

     @FindBy(id = "add-to-cart-sauce-labs-bike-light")
     private WebElement addBikeLightToCartButton;

    @FindBy(css = "a[href='https://twitter.com/saucelabs']")
    private WebElement twitterIcon;

    @FindBy(css = ".shopping_cart_link")
    private WebElement shoppingCartLink;


    public void clickAddBikeLightToCartButton(){
        wait.until(ExpectedConditions.elementToBeClickable(addBikeLightToCartButton)).click();
    }

    public void clickShoppingCartLink(){
        Actions builder = new Actions(getDriver());
        builder.moveToElement(shoppingCartLink).click(shoppingCartLink).perform();
    }

    public void scrollToBottom() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void clickOnTwitterIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(twitterIcon)).click();
    }

    public void verifyTwitterIsOpenedInNewTab() {
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        String expectedUrl = "https://twitter.com/saucelabs";
        String currentUrl = driver.getCurrentUrl();
        wait.until(ExpectedConditions.titleContains("Sauce Labs (@saucelabs) / Twitter"));
        Assert.assertEquals(expectedUrl, currentUrl);
    }
}
