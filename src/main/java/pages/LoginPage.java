package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import driver.DriverFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;


public class LoginPage {

    private WebDriver driver;

    public LoginPage() {
        driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    public @FindBy(id = "user-name")
    WebElement usernameField;

    private @FindBy(id = "password")
    WebElement passwordField;

    private @FindBy(id = "login-button")
    WebElement loginButton;

    public void navigateToURL() {
        driver.get("https://www.saucedemo.com/");
    }

    public void setUsername(String username){
        usernameField.sendKeys(username);
    }

    public void setPassword(String password){
        passwordField.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void validateSuccessfulLogin(){
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String currentUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, currentUrl);
    }

    public void fillAllFieldsAndlogin(String username, String password){
        navigateToURL();
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }

}
