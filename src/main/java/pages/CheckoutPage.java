package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static driver.DriverFactory.getDriver;

public class CheckoutPage {

    private WebDriver driver;
    WebDriverWait wait = new WebDriverWait(getDriver(), 10);

    public CheckoutPage() {
        driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "first-name")
    private WebElement firstNameField;

    @FindBy(id = "last-name")
    private WebElement lastNameField;

    @FindBy(id = "postal-code")
    private WebElement postalCodeField;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "finish")
    private WebElement finishButton;

    @FindBy(css = ".complete-header")
    private WebElement confirmationMessage;


    public CheckoutPage enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
        return this;
    }

    public CheckoutPage enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
        return this;
    }

    public CheckoutPage enterPostalCode(String postalCode) {
        postalCodeField.sendKeys(postalCode);
        return this;
    }

    public CheckoutPage clickContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
        return this;
    }

    public void enterPersonalDetailsStepsOne(String firstName, String lastName, String postalCode){
        enterFirstName(firstName).
                enterLastName(lastName).
                enterPostalCode(postalCode).
                clickContinueButton();
    }

    public CheckoutPage clickFinishButton(){
        wait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
        return this;
    }

    public String getMessageText(){
        String message = confirmationMessage.getText();
        return message;
    }

}
