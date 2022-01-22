package com.heartbingo.cucumber.stepdefs;

import com.heartbingo.pages.HomePage;
import com.heartbingo.pages.SignUpPage;
import com.heartbingo.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Vimal Vithalpura
 * @project HeartBingo-TechnicalTest-Cucumber-Framework
 * @created 18/01/2022
 */
public class SignUpTest extends Utility {

    @When("^I click On Sign Up Button$")
    public void iClickOnSignUpButton() {
        new HomePage().clickOnSignUpButton();
    }

    @And("^I enter First Name \"([^\"]*)\"$")
    public void iEnterFirstName(String name)  {
        new SignUpPage().enterFirstName(name);
    }

    @And("^I enter Last Name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName)  {
        new SignUpPage().enterLastName(lastName);
    }

    @And("^I click on Continue Button$")
    public void iClickOnContinueButton() {
        new SignUpPage().clickOnContinueButton();
    }

    @And("^I select Gender \"([^\"]*)\"$")
    public void iSelectGender(String gender)  {
        new SignUpPage().selectGender(gender);
    }

    @And("^I enter email Address$")
    public void iEnterEmailAddress() {
        new SignUpPage().enterEmailAddress(doGetRandomEmail());
    }

    @And("^I enter Password$")
    public void iEnterPassword() {
        new SignUpPage().enterPassword(doGetRandomString(15));
    }

    @And("^I enter Mobile number \"([^\"]*)\"$")
    public void iEnterMobileNumber(String mobile)  {
        new SignUpPage().enterMobileNumber(mobile);
    }

    @And("^I select Date Of Birth \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void iSelectDateOfBirth(String day, String month, String year)  {
        new SignUpPage().selectDayMonthYearForDateOfBirth(day, month, year);
        new SignUpPage().doClickOnContinueButton();
    }

    @And("^I enter Address details \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void iEnterAddressDetails(String address1, String city, String postcode)  {
        new SignUpPage().enterAddressDetails(address1, city, postcode);
    }

    @And("^I select Currency \"([^\"]*)\"$")
    public void iSelectCurrency(String currency)  {
        new SignUpPage().selectCurrency(currency);
    }

    @And("^I select Exclusive Offers checkbox \"([^\"]*)\"$")
    public void iSelectExclusiveOffersCheckbox(String offer)  {
        new SignUpPage().selectExclusiveOffers(offer);
    }

    @And("^I click on Terms and condition Check Box$")
    public void iClickOnTermsAndConditionCheckBox() {
        new SignUpPage().clickTermsAndConditionCheckbox();
    }

    @And("^I click on Create Account button$")
    public void iClickOnCreateAccountButton() {
        new SignUpPage().clickOnCreateAccountButton();
    }

    @Then("^My account is created$")
    public void myAccountIsCreated() {
        new SignUpPage().clickOncloseButton();
    }


}
