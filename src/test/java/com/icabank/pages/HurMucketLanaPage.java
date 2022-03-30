package com.icabank.pages;

import com.icabank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HurMucketLanaPage extends BasePage{

    @FindBy (xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[1]/div/label[1]/div")
    public WebElement anmarkningJaButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[1]/div/label[2]/div")
    public WebElement anmarkningNejButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[2]/div/input")
    public WebElement inkomstBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[6]/div/input")
    public WebElement mobInkomstBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[3]/div/label[1]/div")
    public WebElement enPersonButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[3]/div/label[2]/div")
    public WebElement tvaPersonButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[4]/div/button[2]")
    public WebElement antalBarnPlusButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[4]/div/button[1]")
    public WebElement antalBarnMinusButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[5]/div[1]/div/div")
    public WebElement boendeType;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[5]/div/div/ul/li[1]")
    public WebElement bostadrattOption;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[5]/div[1]/div/ul/li[2]")
    public WebElement hyresrattOption;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[6]/div/label[1]/div[2]")
    public WebElement hyraTwo_Three;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[6]/div/label[2]/div[2]")
    public WebElement hyraThree_Four;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[6]/div/label[3]/div[2]")
    public WebElement hyraFour_Five;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[6]/div/label[4]/div[2]")
    public WebElement Five_More;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[7]/div/input")
    public WebElement andraPrivatlanBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/button")
    public WebElement beraknaButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/a")
    public WebElement goVidareButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/div[8]/p[1]")
    public WebElement erbjudaInteMessage;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/section/section/form/span[6]")
    public WebElement farlanaAmount;

    public HurMucketLanaPage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
