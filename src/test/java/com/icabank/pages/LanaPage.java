package com.icabank.pages;

import com.icabank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LanaPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"SmallInfoPuff_6790\"]/div[1]")
    public WebElement hurMycketLanaButton;

    public LanaPage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
