import utils.Constants;
import utils.Hooks;
import org.junit.Test;
import pages.InventoryPage;
import pages.LoginPage;


public class LoginAndOpenTwitterPageTests extends Hooks {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();

    @Test
    public void successfulLoginTest() {

        //Open the page
        loginPage.navigateToURL(Constants.URL);

        //Enter username
        loginPage.setUsername("standard_user");

        //Enter password
        loginPage.setPassword("secret_sauce");

        //Click the Login button
        loginPage.clickLoginButton();

        //Verify that the user is logged in successfully
        loginPage.validateSuccessfulLogin();

    }


    @Test
    public void twitterOpenedPageTest() {

        //Log in to reach the inventory page
        loginPage.fillAllFieldsAndlogin("standard_user", "secret_sauce");

        //Scroll down to the bottom of the page
        inventoryPage.scrollToBottom();

        //Click on the Twitter icon
        inventoryPage.clickOnTwitterIcon();

        //Verify that Twitter page is opened in a new tab
        inventoryPage.verifyTwitterIsOpenedInNewTab();

    }
}