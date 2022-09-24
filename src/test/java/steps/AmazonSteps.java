package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AmazonPage;

public class AmazonSteps {

    AmazonPage amazon = new AmazonPage();

    @Given("I navigate to the Amazon page")
    public void navigateToAmazon() {
        amazon.navigateToAmazon();
    }

    @And("Select a value from the dropdown")
    public void selectValueFromDropdown() {
        // amazon.SelectOption("URUGUAY");
        amazon.SelectOption(2);
    }

    @Then("I have the value select")
    public void validateResults() {

    }
}
