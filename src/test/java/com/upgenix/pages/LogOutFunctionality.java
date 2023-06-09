package com.upgenix.pages;

import com.upgenix.utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutFunctionality {

    public LogOutFunctionality(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userNameButton;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logOutButton;
}

