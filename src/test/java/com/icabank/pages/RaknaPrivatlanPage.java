package com.icabank.pages;

import com.icabank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RaknaPrivatlanPage extends BasePage{

    @FindBy(css = "#amountSlider [class*=editableLable] span[class*=current]")
    public WebElement hurMycketLanaBox;

    @FindBy(xpath = "//*[@id=\"765989721\"]")
    public WebElement hurMycketLanaCusor;

    @FindBy(xpath = "//*[@id=\"BlancoCalculatorPuff_42\"]/div[2]/div[1]/div[2]/div[1]/div/span[1]")
    public WebElement hurLangTidBox;

    @FindBy(xpath = "//*[@id=\"1504602543\"]")
    public WebElement hurLangTidCursor;

    @FindBy(xpath = "//*[@id=\"BlancoCalculatorPuff_42\"]/div[2]/div[1]/div[2]/div[1]/label")
    public WebElement hurLangTidText;

    @FindBy(xpath = "//*[@id=\"BlancoCalculatorPuff_42\"]/div[2]/div[2]/div[2]/a")
    public WebElement tillAnsokanButton;

    public RaknaPrivatlanPage() {
        PageFactory.initElements(Driver.get(), this);
    }


}
