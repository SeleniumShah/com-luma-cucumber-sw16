package com.luma.steps;

import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.OverNightDuffle;
import com.luma.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GearTestSteps {
    @When("^I mouse hover on Gear Menu$")
    public void iMouseHoverOnGearMenu() {
        new HomePage().mouseHoverOnGearMenu();
    }

    @And("^I click on Bags$")
    public void iClickOnBags() {
        new HomePage().clickOnBags();
    }

    @And("^I click on product name Overnight Duffle$")
    public void iClickOnProductNameOvernightDuffle() {
        new GearPage().clickOnProductGear();

    }

    @And("^The  text displayed on the page \"([^\"]*)\"$")
    public void theTextDisplayedOnThePage(String expectedMessage)  {
        Assert.assertEquals( new OverNightDuffle().getOverNightDuffelText(),expectedMessage);

    }

    @And("^I update quantity to \"([^\"]*)\"$")
    public void iUpdateQuantityTo(String newQty)  {
        new OverNightDuffle().changeQuantityTo3(newQty);
    }

    @And("^I click on Add To Cart button$")
    public void iClickOnAddToCartButton() {
        new OverNightDuffle().clickOnAddToCart();
    }

    @And("^Verify the text \"([^\"]*)\"$")
    public void verifyTheText(String expectedText)
    {
      Assert.assertEquals(new OverNightDuffle().getAddToCartText(),expectedText);
    }

    @And("^I click on shopping cart link$")
    public void iClickOnShoppingCartLink() {
        new OverNightDuffle().clickOnShoppingCart();
    }

    @And("^I verify text \"([^\"]*)\"$")
    public void iVerifyText(String expectedMessage)  {
        Assert.assertEquals(new ShoppingCartPage().getOverNightDuffeleText(),expectedMessage);
    }

    @And("^I verify the quantity \"([^\"]*)\"$")
    public void iVerifyTheQuantity(String expectedQty)
    {
       Assert.assertEquals(new ShoppingCartPage().getQty(),expectedQty);

    }

    @And("^I verify the product price \"([^\"]*)\"$")
    public void iVerifyTheProductPrice(String expectedPrice)  {
        Assert.assertEquals(new ShoppingCartPage().getProductPrice(),expectedPrice);
    }

    @And("^I update the quantity \"([^\"]*)\"$")
    public void iUpdateTheQuantity(String newQty)  {
        new ShoppingCartPage().changeQtyOfOverNightDuffle(newQty);

    }

    @And("^I click on update shopping cart button$")
    public void iClickOnUpdateShoppingCartButton() {
        new ShoppingCartPage().clickOnUpdateShoppingCart();
    }

    @Then("^I should be able to add product successfully to shopping cart$")
    public void iShouldBeAbleToAddProductSuccessfullyToShoppingCart() {
    }

    @And("^I verify product Price \"([^\"]*)\"$")
    public void iVerifyProductPrice(String updatedPrice)  {
        Assert.assertEquals(new ShoppingCartPage().getUpdatedProductPrice(),updatedPrice);
    }
}
