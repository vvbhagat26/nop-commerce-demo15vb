package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement verifyRegisterText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstErrorMsg;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastErrorMsg;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailErrorMsg;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement passwordErrorMsg;

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement gender;


    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement fName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lName;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement selectDay;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement selectMonth;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement selectYear;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement enterEmail;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement enterConfirmPassword;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyRegistrationText;


    public String verifyRegisterText(){
        log.info("verify register text" + verifyRegisterText.toString());
        return getTextFromElement(verifyRegisterText);
    }
    public void clickOnRegisterButton(){
        log.info("click on  register button" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String verifyfirstErrorMsg(){
        log.info("verify first error  text" + firstErrorMsg.toString());
        return getTextFromElement(firstErrorMsg);
    }
    public String verifylastErrorMsg(){
        log.info("verify last error  text" + lastErrorMsg.toString());
        return getTextFromElement(lastErrorMsg);
    }
    public String verifyemailErrorMsg(){
        log.info("verify  error  text" + emailErrorMsg.toString());
        return getTextFromElement(emailErrorMsg);
    }
    public String verifypasswordErrorMsg(){
        log.info("verify  password error  text" + passwordErrorMsg.toString());
        return getTextFromElement(passwordErrorMsg);
    }



    public void clickOngender(){
        log.info("click on  gender button" + gender.toString());
        clickOnElement(gender);
    }
    public void enterFirstName(){
        log.info("enetr first name" + fName.toString());
        sendTextToElement(fName,"Binal");
    }
    public void enterLastName(){
        log.info("enetr last name" + lName.toString());
        sendTextToElement(lName,"Shah");
    }
    public void selectDay(){
        log.info("select day" + selectDay.toString());
        selectByValueFromDropDown(selectDay,"10");
    }
    public void selectMonth(){
        log.info("select day" + selectMonth.toString());
        selectByValueFromDropDown(selectMonth,"10");
    }
    public void selectYear(){
        log.info("select day" + selectYear.toString());
        selectByValueFromDropDown(selectYear,"2000");
    }

    public void enteremail(){
        log.info("Getting text from : " + enterEmail.toString());
        sendTextToElement(enterEmail,"Binal123@gmail.com");
    }
    public void enterPassword(){
        log.info("Getting text from : " + enterPassword.toString());
        sendTextToElement(enterPassword,"Binal1234");
    }
    public void confirmPassword(){
        log.info("Getting text from : " + enterConfirmPassword.toString());
        sendTextToElement(enterConfirmPassword,"Binal1234");
    }
    public void clickOnRegistern(){
        log.info("click on  register button" + registerButton.toString());
        clickOnElement(registerButton);
    }
    public String verifyRegisterationText(){
        log.info("verify  password error  text" + verifyRegisterText.toString());
        return getTextFromElement(verifyRegistrationText);
    }

}

