package com.heartbingo.cucumber.stepdefs;

import com.heartbingo.pages.HomePage;
import com.heartbingo.pages.LoginPage;
import com.heartbingo.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * @author Vimal Vithalpura
 * @project HeartBingo-TechnicalTest-Cucumber-Framework
 * @created 18/01/2022
 */

public class LoginTest extends Utility {
    @When("^I click on Login Link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginbutton();
    }

    @And("^I enter Invalid Username$")
    public void iEnterInvalidUsername() {
        new LoginPage().enterUsername(doGetRandomEmail());
    }

    @And("^I enter Invalid Password$")
    public void iEnterInvalidPassword() {
        new LoginPage().enterPassword(doGetRandomString(9));
    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I get error message for invalid Username and Password$")
    public void iGetErrorMessageForInvalidUsernameAndPassword() {
        Assert.assertEquals(new LoginPage().getErrorMessageText(),"The username or password you entered is incorrect. Please try again.");
    }



}
