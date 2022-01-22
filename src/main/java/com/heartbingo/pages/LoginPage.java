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
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy (xpath = "//iframe[@class='oneauth-iframe']")
    WebElement iFrame;

    @CacheLookup
    @FindBy (id = "username")
    WebElement usernameField;

    @CacheLookup
    @FindBy (id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log In')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy (className = "login_errorMessageWrapper__2ZcGx")
    WebElement errorMessge;


    public void swithToFrame(){
        driver.switchTo().frame(iFrame);
        log.info("Switching into iFrame " + iFrame.toString());
    }

    public void enterUsername(String username){
        swithToFrame();
        doSendTextToElement(usernameField, username);
        log.info("Entering Username into username field " + username.toString());
    }

    public void enterPassword(String password){
        doSendTextToElement(passwordField, password);
        log.info("Entering Password into password field " + password.toString());
    }

    public void clickOnLoginButton(){
        doClickOnElement(loginButton);
        log.info("Clicking on Login Button on Login Page " + loginButton.toString());
    }

    public String getErrorMessageText(){
        log.info("Getting Error message text " + errorMessge.toString());
        return doGetTextFromElement(errorMessge);
    }
}
