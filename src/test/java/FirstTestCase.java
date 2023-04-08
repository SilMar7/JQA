import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @Test
    public void successfulLoginTest() {

        //enter username
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        //enter password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        //click the Login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        //verify that the user is logged in successfully
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, currentUrl);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}