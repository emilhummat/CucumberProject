Feature: Feature2

  Scenario Outline:Purchase Foreign Currency functionality
    Given Navigate to Pay Bills
    And Click on PurchaseForeignCurrencyPage
    And Choose random currency
    And Insert "<amount>"
    And select radio "<option>"
    And Click on calculate cost
    And Click on Purchase
    Then Verify purchase
    Examples:
      | amount  | option        |
      | 100     | dollarRadio   |
      | 100     | SelectedRadio |
      | hundred | dollarRadio   |
      |         | SelectedRadio |


