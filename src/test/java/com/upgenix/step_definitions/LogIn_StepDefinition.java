package com.upgenix.step_definitions;

import com.upgenix.pages.LogInPage;
import com.upgenix.utilies.BrowserUtils;
import com.upgenix.utilies.ConfigurationReader;
import com.upgenix.utilies.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class LogIn_StepDefinition {

    LogInPage logInPage = new LogInPage();
    Properties properties = new Properties();


    @When("User in on log in page")
      public void user_in_on_log_in_page() {

       Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Then("User enters {string} address")
    public void user_enters_address(String email) {

        logInPage.emailBox.sendKeys(email);
       // logInPage.loginWithConfigEmail();

    }
    @Then("user enter {string}")
    public void user_enter(String password) {
        logInPage.passwordBox.sendKeys(password);

    }

    @Then("user clicks on the log in button")
    public void user_clicks_on_the_log_in_button() {
        logInPage.loginButton.click();



    }


}
