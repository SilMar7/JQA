import helpers.Hooks;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pages.InventoryPage;
import pages.LoginPage;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginAndOpenTwitterPageTests extends Hooks {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();

    @Test
    public void successfulLoginTest() {

        //Open the page
        loginPage.navigateToURL();

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