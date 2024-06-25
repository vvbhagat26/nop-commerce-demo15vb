package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();

    }

    @Then("I should verify 'Welcome, Please Sign In! message display")
    public void iShouldVerifyWelcomePleaseSignInMessageDisplay() {
        Assert.assertEquals(new LoginPage().getWelcomeText(),"Welcome, Please Sign In!","Text not displayed");
    }


    @And("I enter email")
    public void iEnterEmail() {
        new LoginPage().enterEmail("paramshah@gmail.com");
    }

    @And("I enter password")
    public void iEnterPassword() {
        new LoginPage().enterPassword("Param1234");
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should verify the error message")
    public void iShouldVerifyTheErrorMessage() {
        Assert.assertEquals(new LoginPage().errorMessage(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found","Text not displayed");

    }

    @Then("I should verify that LogOut link is display")
        public void iShouldVerifyThatLogOutLinkIsDisplay() {
        Assert.assertEquals(new LoginPage().logOutLink(),"Log out","link not displayed");
    }

    @And("I click on log out button")
    public void iClickOnLogOutButton() {
        new LoginPage().clickOnLogOutLink();
    }

    @Then("I should verify that Log in link is display")
    public void iShouldVerifyThatLogInLinkIsDisplay() {
        new HomePage().verifyLoginlinkText();
    }
}
