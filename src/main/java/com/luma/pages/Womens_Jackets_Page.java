package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Womens_Jackets_Page extends Utility {

    private final static Logger log = LogManager.getLogger(Womens_Jackets_Page.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[2]//div[3]//select[1]")
    WebElement productFilter;

   @CacheLookup
   @FindBy(xpath = "//strong[@class = 'product name product-item-name']")
   List<WebElement> productNameList1;

   @CacheLookup
   @FindBy(xpath = "//strong[@class = 'product name product-item-name']")
   List<WebElement> productNameList2;


    @CacheLookup
    @FindBy(xpath = "//span[@class='price-container price-final_price tax weee']")
    List<WebElement> productPriceList1;

    @CacheLookup
    @FindBy(xpath = "//span[@class='price-container price-final_price tax weee']")
    List<WebElement> productPriceList2;






    public ArrayList<String> getProductList1() {
        List<WebElement> beforeFilterProductList = productNameList1;
        ArrayList<String> beforeFilterProductList1 = new ArrayList<>();
        for (WebElement list : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(list.getText()));
        }
        Collections.sort(beforeFilterProductList1);

        return beforeFilterProductList1;
    }

    public void selectProductNameFilter(String filterName)
    {
       // waitUntilVisibilityOfElementLocated(productFilter,20);

        selectByVisibleTextFromDropDown(productFilter,filterName);

    }
    public ArrayList<String> getProductList2()


    {
        List<WebElement> afterFilterProductList = productNameList2;
        ArrayList<String> afterFilterProductList1 = new ArrayList<>();
        for (WebElement list1:afterFilterProductList)
        {
            afterFilterProductList1.add(String.valueOf(list1.getText()));
        }

    return  afterFilterProductList1;
    }

    public void verifyProductDisplayedInAlphabaticalOrder()
    {
        Assert.assertEquals(getProductList1(),getProductList2());
        log.info("Verify products are displayed in ascending order ");
    }

    public ArrayList<String> getProductPriceList1() {
        List<WebElement> beforeFilterProductList = productPriceList1;
        ArrayList<String> beforeFilterProductList1 = new ArrayList<>();
        for (WebElement list : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(list.getText()));
        }
        Collections.sort(beforeFilterProductList1);
        return beforeFilterProductList1;
    }

    public ArrayList<String> getProductPriceList2()


    {
        List<WebElement> afterFilterProductList = productPriceList2;
        ArrayList<String> afterFilterProductList1 = new ArrayList<>();
        for (WebElement list1:afterFilterProductList)
        {
            afterFilterProductList1.add(String.valueOf(list1.getText()));
        }

        return  afterFilterProductList1;
    }

    public void verifyProductDisplayedPriceFromLowToHigh()
    {
        Assert.assertEquals(getProductPriceList1(),getProductPriceList2());
        log.info("Verify products are displayed in Low To High Order ");
    }

}
