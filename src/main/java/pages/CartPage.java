package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static driver.DriverFactory.getDriver;

public class CartPage {

    public CartPage() {
        driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    private WebDriver driver;
    WebDriverWait wait = new WebDriverWait(getDriver(), 10);

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    public void clickCheckoutButton(){
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButton)).click();
    }
}
