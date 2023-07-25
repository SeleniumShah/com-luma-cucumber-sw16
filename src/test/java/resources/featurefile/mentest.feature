Feature: MenTest

  As a user I want to verify men page

  @smoke @regression
  Scenario: I Should Add Product SuccessFully To ShoppinCart
    Given  I am on homepage
    When  I mouse hover men menu
    And I mouse hover on Bottoms
    And I click on Pants
    And I mouse hover on Crounus Yoga Pant
    And I click on size
    And I click on color Black
    And I click on Add To Cart
    And Message displayed on page is "You added Cronus Yoga Pant to your shopping cart."
    And I click on Shopping cart
    And The  text displayed on page "Shopping Cart"
    And The product name  displayed "Cronus Yoga Pant"
    And Product size displayed is "32"
    And Product color  is displayed "Black"
    Then I should be able to add product to shopping cart successfully
