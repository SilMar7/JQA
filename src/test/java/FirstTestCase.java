import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class FirstTestCase extends Hooks {

    @Test
    public void successfulLoginTest() {

        //open the page
        driver.navigate().to("https://www.saucedemo.com/");

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
        assertEquals(expectedUrl, currentUrl);

    }
}