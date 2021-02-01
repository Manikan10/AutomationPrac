Feature: Login validation 2

	@SmokeTest
  Scenario Outline: Login Tests
    Given Load the Website
    And Goto SignIn page
    When Enter the "<email>" and "<password>"
    And Click on SignIn button
    Then Ensure the "<expMessage>" error message is displayed

    Examples: 
      | email                  | password    | expMessage                 |
      |                        |             | An email address required. |
#      | test@betbull.com       |             | Password is required.      |
#      |                        | testbetbull | An email address required. |
#      | validemail@betbull.com | password1   | Authentication failed.     |

	@SmokeTest @RegressionTest
  Scenario Outline: Search for an available Item
    Given Load the Website
    When Search for an "<item>"
    Then Results are displayed for an "<item>"

    Examples: 
      | item         |
#      | t-shirt      |
      | blouse       |
#      | Casual Dress |

	@SmokeTest @RegressionTest
  Scenario Outline: Search for an unavailable Item
    Given Load the Website
    When Search for an "<item>"
    Then Results are displayed for an "<item>"

    Examples: 
      | item |
      | pant |
      |  |
	
	@RegressionTest @Test3
  Scenario: Check the Cart is empty when no items added
    Given Load the Website
    And Go to Cart
    Then No item is displayed in Cart

	@RegressionTest
  Scenario: Add an item to the Cart
    Given Load the Website
    When Add an item under Home->Popular to Cart
    And Go to Cart
    Then Added item is displayed in Cart

  @RegressionTest
  Scenario: Remove an item from the Cart
    Given Load the Website
    When Add an item under Home->Popular to Cart
    And Go to Cart
    When Remove an item from Cart
    Then Item is removed from Cart
