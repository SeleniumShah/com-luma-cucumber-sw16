package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.MenPage;
import com.luma.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MenTestSteps {
    @When("^I mouse hover men menu$")
    public void iMouseHoverMenMenu() {
        new HomePage().mouseHoverOnMenMenu();
    }

    @And("^I mouse hover on Bottoms$")
    public void iMouseHoverOnBottoms() {
        new HomePage().mouseHoverOnBottom();
    }

    @And("^I click on Pants$")
    public void iClickOnPants() {
        new HomePage().clickOnPant();
    }

    @And("^I mouse hover on Crounus Yoga Pant$")
    public void iMouseHoverOnCrounusYogaPant() {
        new MenPage().mouseHoverOnCronusYogaPant();
    }


    @And("^I click on color Black$")
    public void iClickOnColorBlack() {
        new MenPage().clickOnColor();
    }

    @And("^I click on Add To Cart$")
    public void iClickOnAddToCart() {
        new MenPage().clickOnAddToCart();
    }

    @And("^Message displayed on page is \"([^\"]*)\"$")
    public void messageDisplayedOnPageIs(String expectedMessage)  {
        Assert.assertEquals(new MenPage().getTextAfterAddToCart(),expectedMessage);

    }

    @And("^I click on Shopping cart$")
    public void iClickOnShoppingCart() {
        new MenPage().clickOnShoppingCart();
    }


    @And("^The  text displayed on page \"([^\"]*)\"$")
    public void theTextDisplayedOnPage(String expectedMessage)  {
        Assert.assertEquals(new ShoppingCartPage().getShoppingCart(),expectedMessage);

    }

    @And("^The product name  displayed \"([^\"]*)\"$")
    public void theProductNameDisplayed(String expectedMessage)  {
        Assert.assertEquals(new ShoppingCartPage().getCronusYogaPantText(),expectedMessage);
    }

    @And("^Product size displayed is \"([^\"]*)\"$")
    public void productSizeDisplayedIs(String expectedMessage)  {
        Assert.assertEquals(new ShoppingCartPage().getSizeText(),expectedMessage);
    }

    @And("^Product color  is displayed \"([^\"]*)\"$")
    public void productColorIsDisplayed(String expectedMessage)  {
       Assert.assertEquals(new ShoppingCartPage().getColorText(),expectedMessage);
    }

    @Then("^I should be able to add product to shopping cart successfully$")
    public void iShouldBeAbleToAddProductToShoppingCartSuccessfully() {
    }

    @And("^I click on size$")
    public void iClickOnSize() {
        new MenPage().clickOnSize();
    }
}
