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

import java.util.List;


public class placeOrderSteps {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("the www.saucedemo.com page is open")
    public void theWwwSaucedemoComPageIsOpen() {
        loginPage.navigateToURL();
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
        List<String> personalDetails = dataTable.asList();
        String firstName = personalDetails.get(0);
        String lastName = personalDetails.get(1);
        String postalCode = personalDetails.get(2);
        checkoutPage.enterPersonalDetailsStepsOne(firstName, lastName, postalCode);
    }

    @And("user finishes the order")
    public void userFinishesTheOrder() {
        checkoutPage.clickFinishButton();
    }

    @Then("the product is ordered successfully")
    public void the_product_is_ordered_successfully() {
        String expectedSMessage = "Thank you for your order!";
        String actualMessage = checkoutPage.getMessageText();
        Assert.assertEquals(expectedSMessage, actualMessage);
    }

}
