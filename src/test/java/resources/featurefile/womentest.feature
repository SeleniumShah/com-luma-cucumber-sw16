Feature: WomenTest

  As a User I want to verify sort By filter of women_jacket Page

  @smoke @regression
  Scenario Outline: verify The Sort By ProductName Filter
    Given I am on homepage
    When  I mouse hover on Women menu
    And   I mouse hover on Tops
    And   I click on Jackets
    And   I select sort By filter "<filterName>"
    Then  Products names displayed in alphabetical order

    Examples:
    | filterName   |
    | Product Name |

    @sanity @regression

      Scenario: verify The Sort By ProductPrice  Filter
      Given   I am on homepage
      When    I mouse hover on Women menu
      And     I mouse hover on Tops
      And     I click on Jackets
      And     I select sort By filter "Price"
      Then    Products price displayed in LowToHigh Order


