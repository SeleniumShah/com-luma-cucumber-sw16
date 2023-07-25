package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    WebElement womenMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")

    WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jackets;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']")
    WebElement menMenu;
    @CacheLookup
    @FindBy(css = "#ui-id-18 span")
    WebElement bottomMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-23 span")
    WebElement pants;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement gearMenu;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;


    public void mouseHoverOnWomenMenu()
    {


        mouseHoverToElement(womenMenu);
        log.info("Mouse hover on WomenMenu " + womenMenu.toString());

    }

    public void mouseHoverOnTops()
    {


         mouseHoverToElement(tops);
        log.info("Mouse hover on Tops " + tops.toString());
    }

    public void clickOnJackets()
    {
        clickOnElement(jackets);
        log.info("Click on jackets " + jackets.toString());
    }

    public void mouseHoverOnMenMenu()
    {

        mouseHoverToElement(menMenu);
        log.info("Mouse hover on Men menu " + menMenu.toString());
    }

    public void mouseHoverOnBottom()
    {

        mouseHoverToElement(bottomMenu);
        log.info("Mouse hover on Bottom " + bottomMenu.toString());
    }

    public void clickOnPant()
    {

        clickOnElement(pants);
        log.info("Click on Pant " + pants.toString());
    }

    public void mouseHoverOnGearMenu()
    {

        mouseHoverToElement(gearMenu);
        log.info("Mouse hover on GearMenu" + gearMenu.toString());
    }

    public void clickOnBags()
    {
         clickOnElement(bags);
         log.info("Click on bags " + bags.toString());
    }

}
