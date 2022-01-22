$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginTest.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4861961500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "I am on HomePage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 5,
  "name": "User should not login with Invalid Credentials",
  "description": "",
  "id": "login-functionality;user-should-not-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I click on Login Link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter Invalid Username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter Invalid Password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I get error message for invalid Username and Password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.iClickOnLoginLink()"
});
formatter.result({
  "duration": 243861000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.iEnterInvalidUsername()"
});
formatter.result({
  "duration": 4255220800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.iEnterInvalidPassword()"
});
formatter.result({
  "duration": 275670200,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.iClickOnLoginButton()"
});
formatter.result({
  "duration": 275109900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.iGetErrorMessageForInvalidUsernameAndPassword()"
});
formatter.result({
  "duration": 277067900,
  "status": "passed"
});
formatter.after({
  "duration": 641206600,
  "status": "passed"
});
formatter.uri("SignUpTest.feature");
formatter.feature({
  "line": 1,
  "name": "Sign Up Functionality",
  "description": "",
  "id": "sign-up-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "User should be able to Sign Up by entering mandatory details",
  "description": "",
  "id": "sign-up-functionality;user-should-be-able-to-sign-up-by-entering-mandatory-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I click On Sign Up Button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter First Name \"\u003cFIRST NAME\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter Last Name \"\u003cLAST NAME\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select Gender \"\u003cGENDER\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter email Address",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter Password",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter Mobile number \"\u003cMOBILE NUMBER\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select Date Of Birth \"\u003cDOB DAY\u003e\", \"\u003cDOB MONTH\u003e\", \"\u003cDOB YEAR\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter Address details \"\u003cADDRESS1\u003e\", \"\u003cCITY\u003e\", \"\u003cPOSTCODE\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select Currency \"\u003cCURRENCY\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select Exclusive Offers checkbox \"\u003cEXCLUSIVE OFFERS\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on Terms and condition Check Box",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Create Account button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "My account is created",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "sign-up-functionality;user-should-be-able-to-sign-up-by-entering-mandatory-details;",
  "rows": [
    {
      "cells": [
        "FIRST NAME",
        "LAST NAME",
        "GENDER",
        "MOBILE NUMBER",
        "DOB DAY",
        "DOB MONTH",
        "DOB YEAR",
        "ADDRESS1",
        "CITY",
        "POSTCODE",
        "CURRENCY",
        "EXCLUSIVE OFFERS"
      ],
      "line": 24,
      "id": "sign-up-functionality;user-should-be-able-to-sign-up-by-entering-mandatory-details;;1"
    },
    {
      "cells": [
        "John",
        "Scott",
        "Male",
        "7912457832",
        "11",
        "November",
        "1980",
        "10 Downand Drive",
        "London",
        "SE10 0NY",
        "GBP",
        "No"
      ],
      "line": 25,
      "id": "sign-up-functionality;user-should-be-able-to-sign-up-by-entering-mandatory-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2748447400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "I am on Homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 25,
  "name": "User should be able to Sign Up by entering mandatory details",
  "description": "",
  "id": "sign-up-functionality;user-should-be-able-to-sign-up-by-entering-mandatory-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I click On Sign Up Button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter First Name \"John\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter Last Name \"Scott\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select Gender \"Male\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter email Address",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter Password",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter Mobile number \"7912457832\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select Date Of Birth \"11\", \"November\", \"1980\"",
  "matchedColumns": [
    4,
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter Address details \"10 Downand Drive\", \"London\", \"SE10 0NY\"",
  "matchedColumns": [
    7,
    8,
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select Currency \"GBP\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select Exclusive Offers checkbox \"No\"",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on Terms and condition Check Box",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Create Account button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "My account is created",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpTest.iClickOnSignUpButton()"
});
formatter.result({
  "duration": 181004200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John",
      "offset": 20
    }
  ],
  "location": "SignUpTest.iEnterFirstName(String)"
});
formatter.result({
  "duration": 461664800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Scott",
      "offset": 19
    }
  ],
  "location": "SignUpTest.iEnterLastName(String)"
});
formatter.result({
  "duration": 229812700,
  "status": "passed"
});
formatter.match({
  "location": "SignUpTest.iClickOnContinueButton()"
});
formatter.result({
  "duration": 234987400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Male",
      "offset": 17
    }
  ],
  "location": "SignUpTest.iSelectGender(String)"
});
formatter.result({
  "duration": 261593400,
  "status": "passed"
});
formatter.match({
  "location": "SignUpTest.iEnterEmailAddress()"
});
formatter.result({
  "duration": 405052400,
  "status": "passed"
});
formatter.match({
  "location": "SignUpTest.iEnterPassword()"
});
formatter.result({
  "duration": 309222800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7912457832",
      "offset": 23
    }
  ],
  "location": "SignUpTest.iEnterMobileNumber(String)"
});
formatter.result({
  "duration": 301719400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11",
      "offset": 24
    },
    {
      "val": "November",
      "offset": 30
    },
    {
      "val": "1980",
      "offset": 42
    }
  ],
  "location": "SignUpTest.iSelectDateOfBirth(String,String,String)"
});
formatter.result({
  "duration": 694847600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10 Downand Drive",
      "offset": 25
    },
    {
      "val": "London",
      "offset": 45
    },
    {
      "val": "SE10 0NY",
      "offset": 55
    }
  ],
  "location": "SignUpTest.iEnterAddressDetails(String,String,String)"
});
formatter.result({
  "duration": 888058300,
  "status": "passed"
});
formatter.match({
  "location": "SignUpTest.iClickOnContinueButton()"
});
formatter.result({
  "duration": 162203700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GBP",
      "offset": 19
    }
  ],
  "location": "SignUpTest.iSelectCurrency(String)"
});
formatter.result({
  "duration": 500410800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No",
      "offset": 36
    }
  ],
  "location": "SignUpTest.iSelectExclusiveOffersCheckbox(String)"
});
formatter.result({
  "duration": 126547500,
  "status": "passed"
});
formatter.match({
  "location": "SignUpTest.iClickOnTermsAndConditionCheckBox()"
});
formatter.result({
  "duration": 144409000,
  "status": "passed"
});
formatter.match({
  "location": "SignUpTest.iClickOnCreateAccountButton()"
});
formatter.result({
  "duration": 115674300,
  "status": "passed"
});
formatter.match({
  "location": "SignUpTest.myAccountIsCreated()"
});
formatter.result({
  "duration": 125759100,
  "status": "passed"
});
formatter.after({
  "duration": 614789900,
  "status": "passed"
});
});