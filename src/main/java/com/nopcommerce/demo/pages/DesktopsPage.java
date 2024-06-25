package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement deskTopText;

    public String verifydeskTopText(){
        log.info("verify  desktop  text" + verifydeskTopText().toString());
        return getTextFromElement(deskTopText);
    }



}
