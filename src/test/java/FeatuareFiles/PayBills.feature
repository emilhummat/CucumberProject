Feature: Feature1

  Scenario Outline:New Payee functionality
    Given Navigate to Pay Bills
    And Click on Add New Payee
    And Fill out the form "<Payee Name>" "<Payee Address>" "<Account>" "<Payee Details>"
    Then Verify adding the Payee Account
    Examples:
      | Payee Name | Payee Address | Account | Payee Details |
      | Ahmet      | Main st       | 101     | 102           |
      | Ahmet      | Main st       |         | 102           |
      | Ahmet      |               | 101     | 102           |
      |            | Main st       | 101     | 102           |
