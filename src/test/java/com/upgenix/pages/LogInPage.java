package com.upgenix.pages;

import com.upgenix.utilies.ConfigurationReader;
import com.upgenix.utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    public LogInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "login")
    public WebElement emailBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    public void loginWithConfigEmail(){
        emailBox.sendKeys(ConfigurationReader.getProperty("web.email.address"));

    }

    public void loginWithConfPassword(){
        passwordBox.sendKeys(ConfigurationReader.getProperty("web.password"));
    }


}
