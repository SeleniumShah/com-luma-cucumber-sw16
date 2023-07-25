package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OverNightDuffle extends Utility {

    private static final Logger log = LogManager.getLogger(OverNightDuffle.class.getName());
   @CacheLookup
   @FindBy(xpath = "//span[@class='base']")
   WebElement overNightDuffleText;


    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qty;


    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;


    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addToCartText;


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    public String getOverNightDuffelText()
    {
        return getTextFromElement(overNightDuffleText);
    }

    public void changeQuantityTo3(String newQty)
    {
       // driver.findElement(qty).clear();

        qty.clear();
        sendTextToElement(qty,newQty);
        log.info("Update quantity To " + newQty);

    }

    public void clickOnAddToCart()
    {
        clickOnElement(addToCart);
        log.info("Click On Add To Cart " + addToCart.toString());
    }

    public String getAddToCartText()
    {
        log.info("Verify Text Add To Cart Text " + addToCartText.toString());
        return getTextFromElement(addToCartText);
    }

    public void clickOnShoppingCart()
    {
        clickOnElement(shoppingCart);
        log.info("Click on Shopping Cart " + shoppingCart.toString());
    }
}
