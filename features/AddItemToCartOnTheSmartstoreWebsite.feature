Feature: Add Item to Cart on the Smartstore website
  Background:
    When I launch website "https://services.smartbear.com/samples/TestComplete14/smartstore/"
    Scenario:Add item to cart and verify price
      Given I have launched the  website "https://services.smartbear.com/samples/TestComplete14/smartstore"
      When I search for item "Chronograph Watch"
      And I navigate to the Product page
      And I add the item to the cart
      Then the item "Chronograph Watch" must be added to cart
      And price should equal "$24,110.00"