package com.upgenix.pages;

import com.upgenix.utilies.ConfigurationReader;
import com.upgenix.utilies.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInFunctionality {

    public LogInFunctionality(){
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
    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement messageDisplayed;

    public void loginWithConfPassword(){
        passwordBox.sendKeys(ConfigurationReader.getProperty("web.password"));
    }







}
