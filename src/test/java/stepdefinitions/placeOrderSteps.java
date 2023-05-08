package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CartPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;
import utils.Constants;

import java.util.List;
import java.util.Map;


public class placeOrderSteps {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("the page is open")
    public void thePageIsOpen() {
        loginPage.navigateToURL(Constants.URL);
    }

    @And("user is logged in")
    public void userIsLoggedIn() {
        loginPage.fillAllFieldsAndlogin("standard_user", "secret_sauce");
    }

    @When("the user adds one quantity of a product to the shopping cart")
    public void theUserAddsQuantityOfAProductToTheShoppingCart() {
        inventoryPage.clickAddBikeLightToCartButton();
        inventoryPage.clickShoppingCartLink();
    }

    @And("user goes to the Checkout page")
    public void userGoesToTheCheckoutPage() {
        cartPage.clickCheckoutButton();
    }

    @And("user enters personal details")
    public void userEntersPersonalDetails(io.cucumber.datatable.DataTable dataTable) {

        List<Map<String, String>> data = dataTable.asMaps();
        String firstName = data.get(0).get("firstname");
        String lastName = data.get(0).get("lastname");
        String postalCode = data.get(0).get("postalcode");

        checkoutPage.enterPersonalDetailsStepsOne(firstName, lastName, postalCode);
    }

    @And("user finishes the order")
    public void userFinishesTheOrder() {
        checkoutPage.clickFinishButton();
    }

    @Then("the product is ordered successfully")
    public void theProductIsOrderedSuccessfully() {
        String expectedSMessage = "Thank you for your order!";
        String actualMessage = checkoutPage.getMessageText();
        Assert.assertEquals(expectedSMessage, actualMessage);
    }

}
