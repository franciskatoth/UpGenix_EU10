package com.upgenix.pages;

import com.upgenix.utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WrongLogInPassword{

    public WrongLogInPassword(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement messageDisplayed;



}
