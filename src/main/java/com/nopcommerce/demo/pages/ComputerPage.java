package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath ="//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']" )
    WebElement computertab;

    @CacheLookup
    @FindBy(xpath ="//h1[normalize-space()='Computers']" )
    WebElement verifyComputertext;



    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement deskTopLink;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement bulildComputer;



    public void clickOnComputerTab(){
        log.info("click on comp. tab : " + computertab.toString());
        clickOnElement(computertab);
    }
    public String verifyComputertext(){
        log.info("verify computer text" + verifyComputertext.toString());
        return getTextFromElement(verifyComputertext);
    }


    public void computernTab(){
        clickOnElement(computertab);
    }
    public void clickOndeskTopLink(){
        clickOnElement(deskTopLink);
    }



    public void clickOnProductName(){
        log.info("click on product name : " + bulildComputer.toString());
        clickOnElement(bulildComputer);
    }




}
