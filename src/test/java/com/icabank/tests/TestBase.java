package com.icabank.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.icabank.utilities.BrowserUtils;
import com.icabank.utilities.ConfigurationReader;
import com.icabank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;
    protected static ExtentReports report;
    protected static ExtentHtmlReporter htmlReporter;
    protected static ExtentTest extentLogger;

    @BeforeTest
    public void setUpTest(){

        report = new ExtentReports();
        String projectPath = System.getProperty("user.dir");
        String path = projectPath + "/test-output/report.html";

        htmlReporter = new ExtentHtmlReporter(path);
        report.attachReporter(htmlReporter);

        htmlReporter.config().setReportName("ICA Bank Låna Test");
        report.setSystemInfo("Environment","GUI");
        report.setSystemInfo("Browser", ConfigurationReader.get("browser"));
        report.setSystemInfo("OS",System.getProperty("os.name"));



    }

    @BeforeMethod
    public void setUp(){

        driver = Driver.get();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        actions = new Actions(driver);
        wait = new WebDriverWait(driver,10);
        driver.get(ConfigurationReader.get("url"));

    }

    @AfterMethod
    public void tearDown(ITestResult result) throws InterruptedException, IOException {

        if(result.getStatus()==ITestResult.FAILURE){

            extentLogger.fail(result.getName());
            String screenShotPath = BrowserUtils.getScreenshot(result.getName());

            extentLogger.addScreenCaptureFromPath(screenShotPath);
            extentLogger.fail(result.getThrowable());

        }
        Thread.sleep(2000);
        Driver.closeDriver();
    }

    @AfterTest
    public void tearDownTest(){

        report.flush();

    }

    public void clearCurrentAmount(WebElement element) {
        String boxValue= element.getText();
        element.click();
        Actions action = new Actions(driver);
        for (int i = 0; i < boxValue.length(); i++) {

            action.sendKeys(Keys.BACK_SPACE);
            action.build().perform();
        }
    }

    public void enterAmount(String amount) {
        char[] chars = amount.toCharArray();
        Actions actions = new Actions(driver);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                actions.sendKeys(Keys.NUMPAD0).perform();
            } else if (chars[i] == '1') {
                actions.sendKeys(Keys.NUMPAD1).perform();
            } else if (chars[i] == '2') {
                actions.sendKeys(Keys.NUMPAD2).perform();
            } else if (chars[i] == '3') {
                actions.sendKeys(Keys.NUMPAD3).perform();
            } else if (chars[i] == '4') {
                actions.sendKeys(Keys.NUMPAD4).perform();
            } else if (chars[i] == '5') {
                actions.sendKeys(Keys.NUMPAD5).perform();
            } else if (chars[i] == '6') {
                actions.sendKeys(Keys.NUMPAD6).perform();
            } else if (chars[i] == '7') {
                actions.sendKeys(Keys.NUMPAD7).perform();
            } else if (chars[i] == '8') {
                actions.sendKeys(Keys.NUMPAD8).perform();
            } else if (chars[i] == '9') {
                actions.sendKeys(Keys.NUMPAD9).perform();
            }
        }
    }

    public String amountConverter(WebElement element){
        String text=element.getText();
        String[] split = text.split(" ");
        String amount="";
        for (int i = 0; i < split.length-1; i++) {
            amount+=split[i];
        }
        return amount;
    }

}