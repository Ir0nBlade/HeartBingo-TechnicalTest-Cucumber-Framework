Feature: Login Functionality

  Background: I am on HomePage

    Scenario: User should not login with Invalid Credentials
      When  I click on Login Link
      And   I enter Invalid Username
      And   I enter Invalid Password
      And   I click on Login Button
      Then  I get error message for invalid Username and Password