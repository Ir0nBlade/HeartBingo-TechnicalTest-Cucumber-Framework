package com.heartbingo.pages;

import com.heartbingo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * @author Vimal Vithalpura
 * @project HeartBingo-TechnicalTest-Cucumber-Framework
 * @created 18/01/2022
 */
public class SignUpPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignUpPage.class.getName());

    @CacheLookup
    @FindBy(id = "first_name")
    WebElement firstNameField;

    @CacheLookup
    @FindBy (id = "last_name")
    WebElement lastNameField;

    @CacheLookup
    @FindBy (css = ".regpath__button-next-text")
    WebElement continueButton;

    @CacheLookup
    @FindBy (className = "bvs-button-card-alternative")
    WebElement gender;

    @CacheLookup
    @FindBy (id = "regpath_form_email_input")
    WebElement emailField;

    @CacheLookup
    @FindBy (id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy (name = "phone_number")
    WebElement mobileNumberField;

    @CacheLookup
    @FindBy (xpath = "//select[@name='day']")
    WebElement dobDay;

    @CacheLookup
    @FindBy (xpath = "//select[@name='month']")
    WebElement dobMonth;

    @CacheLookup
    @FindBy (xpath = "//select[@name='year']")
    WebElement dobYear;

    @CacheLookup
    @FindBy (id = "address1")
    WebElement address1Field;

    @CacheLookup
    @FindBy (id = "city")
    WebElement cityField;

    @CacheLookup
    @FindBy (id = "postcode")
    WebElement postcodeField;

    @CacheLookup
    @FindBy (xpath = "//div[@class='account-form__circle-selector']")
    WebElement selectCurrency;

    @CacheLookup
    @FindBy (xpath = "//button[@class='bvs-button-alternative is-round is-secondary account-box']")
    WebElement selectExclusiveOffers;

    @CacheLookup
    @FindBy (xpath = "//div[@class='bvs-checkbox-card__checkbox']")
    WebElement checkbox;

    @CacheLookup
    @FindBy (xpath = "//button[@type='submit']")
    WebElement createAccountButton;

    @CacheLookup
    @FindBy (xpath = "//span[@class='bvs-icon is-big is-cross is-inverted']")
    WebElement closeButton;

    @CacheLookup
    @FindBy (xpath = "//span[contains(text(),'Continue')]")
    WebElement getContinueButton;


    public void enterFirstName(String firstName){
        doSendTextToElement(firstNameField, firstName);
        log.info("Entering First Name into 'FIRST NAME' field " + firstName.toString());
    }

    public void enterLastName(String lastName){
        doSendTextToElement(lastNameField, lastName);
        log.info("Entering Last Name into 'LAST NAME' field " + lastName.toString());
    }

    public void clickOnContinueButton(){
        doClickOnElement(continueButton);
        log.info("Clicking on Continue Button " + continueButton.toString());
    }

    public void selectGender(String gen){
        doclickOnElement(gender, gen);
        log.info("Selecting Gender 'Male or Female' " + gender.toString());
    }

    public void enterEmailAddress(String email){
        doSendTextToElement(emailField, email);
        log.info("Entering Email into 'EMAIL' field " + email.toString());
    }

    public void enterPassword(String password){
        doSendTextToElement(passwordField, password);
        log.info("Entering Password into 'PASSWORD' field " + password.toString());
    }

    public void enterMobileNumber(String mobile){
        doSendTextToElement(mobileNumberField, mobile);
        log.info("Entering Mobile number into 'MOBILE NUMBER' field " + mobile.toString());
    }

    public void selectDayMonthYearForDateOfBirth(String day, String month, String year){
        doSelectByVisibleTextFromDropDown(dobDay, day);
        log.info("Selecting Day from dropdown for 'Date Of Birth' field  " + day.toString());
        doSelectByVisibleTextFromDropDown(dobMonth, month);
        log.info("Selecting Month from dropdown for 'Date of Birth' field  " + month.toString());
        doSelectByVisibleTextFromDropDown(dobYear, year);
        log.info("Selecting Year from dropdown for 'Date Of Birth' field " + year.toString());
    }

    public void enterAddressDetails(String address1, String city, String postcode){
        doSendTextToElement(address1Field, address1);
        log.info("Entering first line of address into 'Address1' field  " + address1.toString());
        doSendTextToElement(cityField, city);
        log.info("Entering City into 'City' field " + city.toString());
        doSendTextToElement(postcodeField, postcode);
        log.info("Entering Postcode into 'Postcode' field " + postcode.toString());
    }

    public void selectCurrency(String currency){
        doclickOnElement(selectCurrency, currency);
        log.info("Selecting Currency  " + currency.toString());
    }

    public void selectExclusiveOffers(String yesOrNo){
        doclickOnElement(selectExclusiveOffers, yesOrNo);
        log.info("Verifying Join Now link is displayed " + yesOrNo.toString());
    }

    public void clickTermsAndConditionCheckbox(){
        doClickOnElement(checkbox);
        log.info("Clicking on Checkbox for accepting Terms and Conditions " + checkbox.toString());
    }

    public void clickOnCreateAccountButton(){
        doClickOnElement(createAccountButton);
        log.info("Clicking on Create Account button " + createAccountButton.toString());
    }
    public void clickOncloseButton(){
        doClickOnElement(closeButton);
        log.info("Clicking on Close button " + closeButton.toString());
    }

    public void doClickOnContinueButton(){
        doClickOnElement(getContinueButton);
        log.info("Clicking on Continue button " + getContinueButton.toString());
    }
}
