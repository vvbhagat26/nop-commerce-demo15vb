package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerPageSteps {


    @When("I click on computer tab")
    public void iClickOnComputerTab() {
        new ComputerPage().clickOnComputerTab();
    }

    @Then("I should verify computer text")
    public void iShouldVerifyComputerText() {
        Assert.assertEquals(new ComputerPage().verifyComputertext(), "Computers", "Text not displayed");
    }


    @When("I click on computern tab")
    public void iClickOnComputernTab() {
        new ComputerPage().computernTab();
    }

    @And("I click on desktop tab")
    public void iClickOnDesktopTab() {
        new ComputerPage().clickOndeskTopLink();
    }


    @Then("I should verify desktops text")
    public void iShouldVerifyDesktopsText() {
        Assert.assertEquals(new DesktopsPage().verifydeskTopText(), "Desktops", "Text not displayed");
    }


    @And("click on product name")
    public void clickOnProductName() {
        new ComputerPage().clickOnProductName();
    }

    @And("I select {string}")
    public void iSelect(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I Select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("I Select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("I Select OS {string}")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOs(os);
    }

    @And("I Select Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }


    @Then("I should see product added success message  The product has been added to your shopping cart")
    public void iShouldSeeProductAddedSuccessMessageTheProductHasBeenAddedToYourShoppingCart() {
        Assert.assertEquals(new BuildYourOwnComputerPage().verifySuceessMessage(),"The product has been added to your shopping cart","Text not displyed");
    }
}