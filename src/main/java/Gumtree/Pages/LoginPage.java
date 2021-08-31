package Gumtree.Pages;

import Gumtree.Utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.annotation.CheckForNull;

public class LoginPage extends BasePage{

    public LoginPage(){PageFactory.initElements(driver,this);
    }
    @FindBy (className = "category-nav-menu")
    WebElement homePageTabs;

    @FindBy (css = ".button.button--dark.css-1tm6dbt.e137x0or1")
    WebElement loginRegisterButton;

    @FindBy (css = "#login-form")
    WebElement loginForm;

    @FindBy (css = "#email")
    WebElement email;

    @FindBy (css = "#fld-password")
    WebElement password;

    @FindBy (css = ".btn-primary.btn-full-width")
    WebElement loginButton;

    @FindBy (css = ".manage-ads-greeting")
    WebElement welcomeMessage;

    @FindBy (css = ".error-messages")
    WebElement errorMessage;

    public boolean isUserOnHomePage(){
        return Utils.isDisplayed(homePageTabs);
    }

    public void clickOnLoginRegisterButton(){
        Utils.click(loginRegisterButton);
    }

    public boolean isUserOnLoginPage(){
        return Utils.isDisplayed(loginForm);
    }

    public void enterEmail(String text){
        Utils.sendKeys(email,text);
    }

    public void enterPassword(String text){
        Utils.sendKeys(password,text);
    }
    public void clickLoginButton(){
        Utils.click(loginButton);
    }
    public String welcomeMessage(){
        return Utils.isEqual(welcomeMessage);
    }
    public String errorMessage(){return Utils.isEqual(errorMessage);}

}
