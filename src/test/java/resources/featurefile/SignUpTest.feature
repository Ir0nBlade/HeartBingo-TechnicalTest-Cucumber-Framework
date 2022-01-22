Feature: Sign Up Functionality

  Background: I am on Homepage


  Scenario Outline: User should be able to Sign Up by entering mandatory details
    When  I click On Sign Up Button
    And   I enter First Name "<FIRST NAME>"
    And   I enter Last Name "<LAST NAME>"
    And   I click on Continue Button
    And   I select Gender "<GENDER>"
    And   I enter email Address
    And   I enter Password
    And   I enter Mobile number "<MOBILE NUMBER>"
    And   I select Date Of Birth "<DOB DAY>", "<DOB MONTH>", "<DOB YEAR>"
    And   I enter Address details "<ADDRESS1>", "<CITY>", "<POSTCODE>"
    And   I click on Continue Button
    And   I select Currency "<CURRENCY>"
    And   I select Exclusive Offers checkbox "<EXCLUSIVE OFFERS>"
    And   I click on Terms and condition Check Box
    And   I click on Create Account button
    Then  My account is created
    Examples:
      | FIRST NAME | LAST NAME | GENDER | MOBILE NUMBER | DOB DAY | DOB MONTH | DOB YEAR | ADDRESS1         | CITY   | POSTCODE | CURRENCY | EXCLUSIVE OFFERS |
      | John       | Scott     | Male   | 7912457832    | 11      | November  | 1980     | 10 Downand Drive | London | SE10 0NY | GBP      | No               |
