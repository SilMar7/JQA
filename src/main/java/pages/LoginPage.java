package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import driver.DriverFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;

import static driver.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;


public class LoginPage {

    protected WebDriver driver;
    WebDriverWait wait = new WebDriverWait(getDriver(), 10);

    public LoginPage() {
        driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public void navigateToURL() {
        driver.get(Constants.URL);
    }

    public void setUsername(String username){
        wait.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(username);
    }

    public void setPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
    }

    public void clickLoginButton(){
            wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public void validateSuccessfulLogin(){
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String currentUrl = driver.getCurrentUrl();
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        assertEquals(expectedUrl, currentUrl);
    }

    public void fillAllFieldsAndlogin(String username, String password){
        navigateToURL();
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }

}
