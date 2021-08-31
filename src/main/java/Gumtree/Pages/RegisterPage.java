package Gumtree.Pages;

import Gumtree.Utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage{

public RegisterPage(){
    PageFactory.initElements(driver,this);
}

    @FindBy (xpath = "//a[@data-q='create-account-tab']")
    WebElement registerTab;

    @FindBy (className = "tabs-content.space-phl.space-pvm")
    WebElement registerForm;

    @FindBy (id = "form.firstName")
    WebElement fName;

    @FindBy (id = "form.lastName")
    WebElement lName;

    @FindBy (xpath = "//input[@id='form.emailAddress']")
    WebElement email;

    @FindBy (xpath = "//input[@id='form.password']")
    WebElement password;

    @FindBy (css = ".btn-primary.btn-full-width")
    WebElement registerButton;

    @FindBy (css = ".error-messages")
    WebElement errorMessage;

    public void clickRegisterTab (){
        Utils.click(registerTab);
    }

    /*public boolean verifyUserIsOnRegisterForm(){
        return Utils.isDisplayed(registerForm);
    }*/

    public void enterFName(String text){
        Utils.sendKeys(fName,text);
    }

    public void enterLName(String text){
        Utils.sendKeys(lName,text);
    }

    public void enterEmail(String text){
        Utils.sendKeys(email,text);
    }

    public void enterPassword(String text){
        Utils.sendKeys(password,text);
    }

    public void clickRegisterButton(){
        Utils.click(registerButton);
    }

    public String verifyErrorMessage (){
        return Utils.isEqual(errorMessage);
    }



}
