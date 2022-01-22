package com.heartbingo.pages;

import com.heartbingo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

/**
 * @author Vimal Vithalpura
 * @project HeartBingo-TechnicalTest-Cucumber-Framework
 * @created 18/01/2022
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy (xpath = "//a[contains(text(),'Log In')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy (xpath = "//a[contains(text(),'Sign Up')]")
    WebElement signUpButton;

    @CacheLookup
    @FindBy (xpath = "//span[@class='bvs-icon is-menu is-big floating-nav__header-item is-inverted']")
    WebElement menuButton;

    @CacheLookup
    @FindBy (xpath = "//div[@class='site-header__user-details']//a[@class='site-header__my-account is-unverified']")
    WebElement myAccountButton;


    public void clickOnLoginbutton(){
        doClickOnElement(loginButton);
        log.info("Clicking on Login Button " + loginButton.toString());
    }

    public void clickOnSignUpButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        doClickOnElement(signUpButton);
        log.info("Clicking on Sign Up Button " + signUpButton.toString());
    }

    public void clickOnMyAccountButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        doClickOnElement(myAccountButton);
        log.info("Clicking on My Account Button " + myAccountButton.toString());
    }

}
