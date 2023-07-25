package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenPage extends Utility {

    private static final Logger log = LogManager.getLogger(MenPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement size;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement color;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addToCartText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;
    public void mouseHoverOnCronusYogaPant()
    {
        mouseHoverToElement(cronusYogaPant);
        log.info("Mouse hover on Cronus Yoga Pant " + cronusYogaPant.toString());
    }

    public void clickOnSize()
    {

        clickOnElement(size);
        log.info("Click on size " + size.toString());
    }

    public void clickOnColor()
    {

        clickOnElement(color);
        log.info("Click on Color " + color.toString());
    }

    public void clickOnAddToCart()
    {
        clickOnElement(addToCart);
        log.info("Click on Add To Cart button " + addToCart.toString());
    }

    public String getTextAfterAddToCart()
    {
        log.info("Getting text AddToCart " + addToCartText.toString());
        return getTextFromElement(addToCartText);

    }

    public void clickOnShoppingCart()
    {
        clickOnElement(shoppingCart);
        log.info("Click on shopping cart " + shoppingCart.toString());
    }



}
