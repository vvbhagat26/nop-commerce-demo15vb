package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ram;



    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddedMsg;

    public void selectProcessor(String valueOfProcessor ){
        log.info("select processor " + processor.toString());
        selectByVisibleTextFromDropDown(processor,valueOfProcessor);

    }
    public void selectRam(String valueOfRam){
        log.info("select ram " + ram.toString());
        selectByVisibleTextFromDropDown(ram,valueOfRam);

    }
    public void selectHDD(String hdd) {
        log.info("select HDD " + hdd.toString());
        clickOnElement(By.xpath("//input[@name='product_attribute_3']/following-sibling::label[text()='" + hdd + "']"));
    }

    public void selectOs(String os) {
        log.info("select OS " + os.toString());
        clickOnElement(By.xpath("//input[@name='product_attribute_4']/following-sibling::label[contains(text(),'" + os + "')]"));
    }

    public void selectSoftware(String software) {
        log.info("select software " + software.toString());
        clickOnElement(By.xpath("//input[@name='product_attribute_5']/following-sibling::label[contains(text(),'" + software +"')]"));
}
   public void clickOnAddToCart(){
       log.info("click on  register button" + addToCart.toString());
        clickOnElement(addToCart);
   }

   public String verifySuceessMessage(){
       log.info("verify  password error  text" + productAddedMsg.toString());
        return getTextFromElement(productAddedMsg);
   }

}
