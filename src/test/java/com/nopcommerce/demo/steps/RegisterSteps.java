package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
    new HomePage().clickOnRegisterLink();
    }


    @Then("I should verify register text")
    public void iShouldVerifyRegisterText() {
        {
            Assert.assertEquals(new RegisterPage().verifyRegisterText(),"Register","Text not displayed");
        }
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
    new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should verify first name error message")
    public void iShouldVerifyFirstNameErrorMessage() {
        Assert.assertEquals(new RegisterPage().verifyfirstErrorMsg(),"First name is required.","Text not displayed");
    }

    @Then("I should verify the last name error message")
    public void iShouldVerifyTheLastNameErrorMessage() {
        Assert.assertEquals(new RegisterPage().verifylastErrorMsg(),"Last name is required.","Text not displayed");
    }

    @Then("I should verify email error message")
    public void iShouldVerifyEmailErrorMessage() {
        Assert.assertEquals(new RegisterPage().verifyemailErrorMsg(),"Email is required.","Text not displayed");
    }

    @Then("I should verify password error message")
    public void iShouldVerifyPasswordErrorMessage() {
        Assert.assertEquals(new RegisterPage().verifypasswordErrorMsg(),"Password is required.","Text not displayed");
    }


    @And("I select gender female")
    public void iSelectGenderFemale() {
        new RegisterPage().clickOngender();
    }

    @And("I enter first name")
    public void iEnterFirstName() {
        new RegisterPage().enterFirstName();
    }

    @And("I enter last name")
    public void iEnterLastName() {
        new RegisterPage().enterLastName();
    }

    @And("I select day")
    public void iSelectDay() {
        new RegisterPage().selectDay();
    }

    @And("I select month")
    public void iSelectMonth() {
        new RegisterPage().selectMonth();
    }

    @And("I select year")
    public void iSelectYear() {
        new RegisterPage().selectYear();
    }

    @And("I enter emailn")
    public void iEnterEmailn() {
        new RegisterPage().enteremail();
    }

    @And("I enter passwordn")
    public void iEnterPasswordn() {
        new RegisterPage().enterPassword();
    }

    @And("I enter  confirm password")
    public void iEnterConfirmPassword() {
        new RegisterPage().confirmPassword();
    }

    @And("I click on registern button")
    public void iClickOnRegisternButton() {
      new RegisterPage().clickOnRegistern();
    }

    @Then("I should verify message your registration completed")
    public void iShouldVerifyMessageYourRegistrationCompleted() {
   Assert.assertEquals(new RegisterPage().verifyRegisterationText(),"Your registration completed","Text not displayed");
    }

}
