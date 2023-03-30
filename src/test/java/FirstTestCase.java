import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");

        //initialize Chrome driver
        WebDriver driver = new ChromeDriver();

        //opening the page
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        //get and print the page's title
        String title = driver.getTitle();
        System.out.println("The title of the page is: " + title);

        //enter username
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        //enter password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        //click the Login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        //quit the driver session
        driver.quit();






    }
}
