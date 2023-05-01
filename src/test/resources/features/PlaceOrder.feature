@EndToEndTests
Feature: Place an order


  Scenario: Order one quantity of a product
    Given the www.saucedemo.com page is open
    And user is logged in
    When the user adds one quantity of a product to the shopping cart
    And user goes to the Checkout page
    And user enters personal details
      | firstname | lastname | postalcode |
      | Maria     | Ivanova  | 1000       |
    And user finishes the order
    Then the product is ordered successfully



