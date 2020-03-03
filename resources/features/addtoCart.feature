Feature: Validate the Add to cart functionalities (TC_002_AddItemToCart)

  @AddToCart
  Scenario: 
    Given User is on the home page
    Then user mouseHover to Dresses and click on Summer Dress
    Then user add one item to cart and save item name
    When User clicks on Continue Shopping
    Then user add one more item to Cart and click on proceed and validate no of items present on cart
