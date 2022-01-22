package com.heartbingo.cucumber;

import com.cucumber.listener.Reporter;
import com.heartbingo.propertyreader.PropertyReader;
import com.heartbingo.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

/**
 * @author Vimal Vithalpura
 * @project HeartBingo-TechnicalTest-Cucumber-Framework
 * @created 18/01/2022
 */
public class Hooks extends Utility {

    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Vimal Vithalpura");
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            String screenshotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenshotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        closeBrowser();
    }
}
