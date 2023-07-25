package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {



    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

   // By shoppingCart = By.xpath("//span[@class='base']");

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;


    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement size;


    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement color;


    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement overNightDuffleText;


    @CacheLookup
    @FindBy(css = ".input-text.qty")
    WebElement qtyText;


    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement productPrice;


    @CacheLookup
    @FindBy(css = ".input-text.qty" )
    WebElement qty;


    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;


    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement updatedProductPrice;


    public String getShoppingCart()
    {
        log.info("Get message Shopping Cart" + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }
    public String getCronusYogaPantText()
    {
        log.info("Get message CronusYogaPant text " + cronusYogaPant.toString());
        return getTextFromElement(cronusYogaPant);
    }
    public String getSizeText()
    {
        log.info("Get text size " + size.toString());
        return getTextFromElement(size);
    }
    public String getColorText()
    {
        log.info("Get text color " + color.toString());
        return getTextFromElement(color);
    }

    public String getOverNightDuffeleText()
    {
        log.info("Get text overnight Duffle  " + overNightDuffleText.toString());
        return getTextFromElement(overNightDuffleText);
    }

    public String getQty()
    {
        log.info("Get Qty " + qtyText.toString());
        String q = qtyText.getAttribute("value");
        return q;
    }

    public String getProductPrice()
    {
        log.info("Get Product price " + productPrice.toString());
        return getTextFromElement(productPrice);
    }

    public void changeQtyOfOverNightDuffle(String newQty)
    {
        qty.clear();
        log.info("Change quantity of overnight duffle  " + qty.toString());
        sendTextToElement(qty,newQty);
    }
    public void clickOnUpdateShoppingCart()
    {
        log.info("Click on shopping cart " + updateShoppingCart.toString());
        clickOnElement(updateShoppingCart);
    }
    public String getUpdatedProductPrice()
    {
        log.info("Get Update Product Price " + updatedProductPrice.toString());
        return getTextFromElement(updatedProductPrice);
    }
}
