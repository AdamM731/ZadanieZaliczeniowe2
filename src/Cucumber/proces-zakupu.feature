Feature: Product purchasing process

  Scenario: User can go through the product purchasing process

    Given Logged user can search Hummingbird Printed Sweater
    When User can select size and amount of product
    And User can add order to cart, go to check out options and select shipping address
    And User can select method of receipt "pick up in store"
    And User can chose Pay by Check in payment method and click "order with an obligation to pay"
    #Then User can make an screenshot of order confirmation and price
