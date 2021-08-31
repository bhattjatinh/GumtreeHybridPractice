package StepDefinition;

import Gumtree.Pages.LoginPage;
import Gumtree.Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterPageSteps {

    LoginPage lp = new LoginPage();
    RegisterPage rp = new RegisterPage();

    @And("user clicks on register tab")
    public void clickOnRegisterTab(){
        rp.clickRegisterTab();
    }


    /*@Given("user is on the register tab")
    public void userIsOnTheRegisterTab() {
        rp.verifyUserIsOnRegisterForm();
    }*/

    @When("user enters first name as {string} last name as {string} email as {string} password as {string}")
    public void userEntersFirstNameAsLastNameAsEmailAsPasswordAs(String fName, String lName, String email, String password) {
        rp.enterFName(fName);
        rp.enterLName(lName);
        rp.enterEmail(email);
        rp.enterPassword(password);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        rp.clickRegisterButton();
    }

    @Then("user should see error message as {string}")

    public void userShouldSeeErrorMessageAs(String expected) {
        Assert.assertEquals(expected,rp.verifyErrorMessage());
    }


}
