package StepDefinition;

import Gumtree.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {

    LoginPage lp = new LoginPage();

    @Given("user is on the home page")
    public void userIsOnTheHomePage(){
       Assert.assertTrue(lp.isUserOnHomePage());
    }


    @And("user clicks on login register")
    public void userClicksOnLoginRegister() {
        lp.clickOnLoginRegisterButton();
    }

    @Then("user get navigated to the login and register page")
    public void userGetNavigatedToTheLoginRegisterPage() {
        Assert.assertTrue(lp.isUserOnLoginPage());
    }

    @When("user provides username as {string} and password as {string}")
    public void userProvidesUsernameAsAndPasswordAs(String email, String password) {
        lp.enterEmail(email);
        lp.enterPassword(password);
    }

    @And("user click on login button")
    public void userClickOnLoginButton() {
        lp.clickLoginButton();
    }

    @Then("user should be logged in and see welcome message as {string}")
    public void userShouldBeLoggedInAndSeeWelcomeMessageAs(String expected) {
        Assert.assertEquals(expected,lp.welcomeMessage());
    }

    @When("user provides {string} and {string}")
    public void userProvidesAnd(String username, String password) {
        lp.enterEmail(username);
        lp.enterPassword(password);
    }

    @Then("user should see respective {string}")
    public void userShouldSeeRespective(String errorMessage) {
        Assert.assertEquals(errorMessage,lp.errorMessage());
    }


}
