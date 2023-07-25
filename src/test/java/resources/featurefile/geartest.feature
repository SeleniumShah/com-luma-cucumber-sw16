Feature: GearTest

  As a user I want to verify Gear Page

  @sanity @regression
  Scenario: I Should Add Product SuccessFully To ShoppingCart
     Given I am on homepage
     When  I mouse hover on Gear Menu 
     And  I click on Bags
    And  I click on product name Overnight Duffle
    And The  text displayed on the page "Overnight Duffle"
    And I update quantity to "3"
    And I click on Add To Cart button
    And Verify the text "You added Overnight Duffle to your shopping cart."
    And I click on shopping cart link
    And I verify text "Overnight Duffle"
    And I verify the quantity "3"
    And I verify the product price "$135.00"
    And I update the quantity "5"
    And I click on update shopping cart button
    And I verify product Price "$225.00"
    Then I should be able to add product successfully to shopping cart

