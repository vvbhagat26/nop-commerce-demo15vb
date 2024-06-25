package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutLink;




    public String getWelcomeText(){
        log.info("Getting text from : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void enterEmail(String email){
        log.info("Getting text from : " + emailField.toString());
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        log.info("Getting text from : " + passwordField.toString());
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        log.info("click on login : " + loginButton.toString());
        clickOnElement(loginButton);
    }
    public String errorMessage(){
        log.info("Getting text from : " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }
    public String logOutLink(){
        log.info("verify log out link" + logOutLink.toString());
        return getTextFromElement(logOutLink);
    }
    public void clickOnLogOutLink(){
        log.info("click on log out : " + logOutLink.toString());
        clickOnElement(logOutLink);
    }


}
