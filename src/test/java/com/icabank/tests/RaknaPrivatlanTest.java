package com.icabank.tests;

import com.icabank.pages.RaknaPrivatlanPage;
import com.icabank.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RaknaPrivatlanTest extends TestBase{


    @Test
    public void calculatePrivatlanTest() throws InterruptedException {

        extentLogger = report.createTest("Rakna pa privatlan link verification test");
        RaknaPrivatlanPage privatlan = new RaknaPrivatlanPage();

        extentLogger.info("Accep cookies");
        privatlan.cookiesAccept.click();

        extentLogger.info("Enter"+ConfigurationReader.get("loan_1")+"as amount of loan in the 'Hur mycket vill du låna?' box");
        Assert.assertTrue(privatlan.hurMycketLanaBox.isEnabled());
        clearCurrentAmount(privatlan.hurMycketLanaBox);
        enterAmount(ConfigurationReader.get("loan_1"));

        extentLogger.info("Enter"+ConfigurationReader.get("period")+" as period of loan in the'Och under hur lång tid?' box");
        Assert.assertTrue(privatlan.hurLangTidBox.isEnabled());
        clearCurrentAmount(privatlan.hurLangTidBox);
        enterAmount(ConfigurationReader.get("period"));

        extentLogger.info("Click on 'till ansökan' button");
        privatlan.tillAnsokanButton.click();

        extentLogger.info("Verify that the link has been changed");
        Assert.assertTrue(driver.getCurrentUrl().contains(ConfigurationReader.get("loan_1")));
        extentLogger.pass("PASSED");

    }



}

