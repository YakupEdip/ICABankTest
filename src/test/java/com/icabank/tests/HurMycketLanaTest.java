package com.icabank.tests;

import com.icabank.pages.HurMucketLanaPage;
import com.icabank.pages.LanaPage;
import com.icabank.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HurMycketLanaTest extends TestBase{

    @Test
    public void positiveBorrowingTest_1(){
        extentLogger = report.createTest("Positive borrowing test_1 based on by selecting the betalningsanmarkning option 'nej'");
        HurMucketLanaPage lanaFunction = new HurMucketLanaPage();
        LanaPage lana = new LanaPage();

        extentLogger.info("Accept cookies");
        lana.cookiesAccept.click();

        extentLogger.info("Go to 'Låna' page");
        lana.lanaPage.click();

        extentLogger.info("Go to 'hur mucket lana' page");
        lana.hurMycketLanaButton.click();

        extentLogger.info("Click on the 'nej' button under 'Har du betalningsanmärkning?' title ");
        lanaFunction.anmarkningNejButton.click();

        extentLogger.info("Enter"+ConfigurationReader.get("salary_1")+" as salary to the 'månadinkomst' box ");
        Assert.assertTrue(lanaFunction.inkomstBox.isEnabled());
        lanaFunction.inkomstBox.click();
        enterAmount(ConfigurationReader.get("salary_1"));

        extentLogger.info("Click on 'en person' button ");
        lanaFunction.enPersonButton.click();

        extentLogger.info("Click on the 'hur ser ditt boende ut'button");
        lanaFunction.boendeType.click();

        extentLogger.info("Choose the 'Bostadsrätt' option ");
        lanaFunction.bostadrattOption.click();

        extentLogger.info("Click on the '2000-3000kr' option as monthly fee");
        lanaFunction.hyraTwo_Three.click();

        extentLogger.info("Enter"+ConfigurationReader.get("loan_1")+" loan amount to the 'Andra privatlån och krediter' box ");
        Assert.assertTrue(lanaFunction.andraPrivatlanBox.isEnabled());
        lanaFunction.andraPrivatlanBox.click();
        enterAmount(ConfigurationReader.get("loan_1"));

        extentLogger.info("Click on the 'Beräkna' button");
        lanaFunction.beraknaButton.click();

        extentLogger.info("Verify that 'Gå vidare till ansökan' button is appeared");
        Assert.assertTrue(lanaFunction.goVidareButton.isDisplayed());
        extentLogger.pass("PASSED");

}

    @Test
    public void positiveBorrowingTest_2(){
        extentLogger = report.createTest("Positive borrowing test_2 based on by selecting " +
                " 'Hur ser ditt boende ut?' as 'Hyresrätt'and 'månadhyra' as '4001-5000'");
        HurMucketLanaPage lanaFunction = new HurMucketLanaPage();
        LanaPage lana = new LanaPage();

        extentLogger.info("Accept cookies");
        lana.cookiesAccept.click();

        extentLogger.info("Go to 'Låna' page ");
        lana.lanaPage.click();

        extentLogger.info("Go to 'hur mycket låna' page");
        lana.hurMycketLanaButton.click();

        extentLogger.info("Click on the 'nej' button under 'Har du betalningsanmärkning?' topic ");
        lanaFunction.anmarkningNejButton.click();

        extentLogger.info("Enter"+ConfigurationReader.get("salary_1")+" as monthly salary in the 'månadinkomst' box ");
        Assert.assertTrue(lanaFunction.inkomstBox.isEnabled());
        lanaFunction.inkomstBox.click();
        enterAmount(ConfigurationReader.get("salary_1"));

        extentLogger.info("Click on 'en person' button ");
        lanaFunction.enPersonButton.click();

        extentLogger.info("Click on the 'hur ser ditt boende ut'button");
        lanaFunction.boendeType.click();

        extentLogger.info("choose the 'Hyresrätt' option ");
        lanaFunction.hyresrattOption.click();

        extentLogger.info("Click on the '4001-5000kr' as monthly fee");
        lanaFunction.hyraFour_Five.click();

        extentLogger.info("Enter"+ConfigurationReader.get("loan_1")+" loan amount in the 'Andra privatlån och krediter' box ");
        Assert.assertTrue(lanaFunction.andraPrivatlanBox.isEnabled());
        lanaFunction.andraPrivatlanBox.click();
        enterAmount(ConfigurationReader.get("loan_1"));

        extentLogger.info("Click on the 'Beräkna' button");
        lanaFunction.beraknaButton.click();

        extentLogger.info("Verify that 'Gå vidare till ansökan' button is appeared");
        Assert.assertTrue(lanaFunction.goVidareButton.isDisplayed());
        extentLogger.pass("PASSED");

    }

    @Test
    public void negativeBorrowingTest_1(){
        extentLogger = report.createTest("Negative borrowing test_1 based on entering high amount to 'Andra privat och crediter' box");
        HurMucketLanaPage lanaFunction = new HurMucketLanaPage();
        LanaPage lana = new LanaPage();

        extentLogger.info("Accept cookies");
        lana.cookiesAccept.click();

        extentLogger.info("Go to 'Låna' page ");
        lana.lanaPage.click();

        extentLogger.info("Go to 'hur mycket lana' page");
        lana.hurMycketLanaButton.click();

        extentLogger.info("Click on the 'nej' button under 'Har du betalningsanmärkning?' title ");
        lanaFunction.anmarkningNejButton.click();

        extentLogger.info("Enter"+ConfigurationReader.get("salary_1")+" as monthly salary in the 'månadinkomst' box ");
        Assert.assertTrue(lanaFunction.inkomstBox.isEnabled());
        lanaFunction.inkomstBox.click();
        enterAmount(ConfigurationReader.get("salary_1"));

        extentLogger.info("Click on 'en person' button ");
        lanaFunction.enPersonButton.click();

        extentLogger.info("Click on the 'hur ser ditt boende ut' button");
        lanaFunction.boendeType.click();

        extentLogger.info("choose the 'Bostadsrätt' option ");
        lanaFunction.bostadrattOption.click();

        extentLogger.info("Click on the '2000-3000kr' as monthly fee");
        lanaFunction.hyraTwo_Three.click();

        extentLogger.info("Enter"+ConfigurationReader.get("loan_2")+" as loan amount in the 'Andra privatlån och krediter' box ");
        Assert.assertTrue(lanaFunction.andraPrivatlanBox.isEnabled());
        lanaFunction.andraPrivatlanBox.click();
        enterAmount(ConfigurationReader.get("loan_2"));

        extentLogger.info("Click on the 'Beräkna' button");
        lanaFunction.beraknaButton.click();

        extentLogger.info("Verify that 'Dessvärre tror vi inte att vi kan erbjuda dig ett lån.' message is appeared");
        Assert.assertTrue(lanaFunction.erbjudaInteMessage.getText().contains("Dessvärre tror vi inte"));
        extentLogger.pass("PASSED");

    }

    @Test
    public void verifyingLinkTest(){
        extentLogger = report.createTest("Verify that after clicking 'Gå vidare till ansökan' button page url  changed ");
        HurMucketLanaPage lanaFunction = new HurMucketLanaPage();
        LanaPage lana = new LanaPage();

        extentLogger.info("Accept cookies");
        lana.cookiesAccept.click();

        extentLogger.info("Go to 'Lana' page ");
        lana.lanaPage.click();

        extentLogger.info("Go to 'hur mycket lana' page");
        lana.hurMycketLanaButton.click();

        extentLogger.info("Click on the 'nej' button under 'Har du betalningsanmärkning?' topic ");
        lanaFunction.anmarkningNejButton.click();

        extentLogger.info("Enter"+ConfigurationReader.get("salary_1")+" as monthly salary in the 'månadinkomst' box ");
        Assert.assertTrue(lanaFunction.inkomstBox.isEnabled());
        lanaFunction.inkomstBox.click();
        enterAmount(ConfigurationReader.get("salary_1"));

        extentLogger.info("Click on 'en person' button ");
        lanaFunction.enPersonButton.click();

        extentLogger.info("Click on the 'hur ser ditt boende ut'button");
        lanaFunction.boendeType.click();

        extentLogger.info("choose the 'Bostadsrätt' option ");
        lanaFunction.bostadrattOption.click();

        extentLogger.info("Click on the '2000-3000kr' as monthly fee");
        lanaFunction.hyraTwo_Three.click();

        extentLogger.info("Enter"+ConfigurationReader.get("loan_1")+" as loan amount in the 'Andra privatlån och krediter' box ");
        Assert.assertTrue(lanaFunction.andraPrivatlanBox.isEnabled());
        lanaFunction.andraPrivatlanBox.click();
        enterAmount(ConfigurationReader.get("loan_1"));

        extentLogger.info("Click on the 'Beräkna' button");
        lanaFunction.beraknaButton.click();

        String expectedAmount= amountConverter(lanaFunction.farlanaAmount);

        extentLogger.info("Click on the 'Gå vidare till ansökan' button");
        lanaFunction.goVidareButton.click();

        extentLogger.info("Verify that 'Gå vidare till ansökan' link has been changed");
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedAmount));
        extentLogger.pass("PASSED");

    }



}
