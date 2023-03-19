package com.upgenix.step_definitions;

import com.upgenix.pages.LogInFunctionality;
import com.upgenix.utilies.ConfigurationReader;
import com.upgenix.utilies.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Properties;

public class LogIn_StepDefinition {

    LogInFunctionality logInPage = new LogInFunctionality();
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

    @Then("user should be on the homepage")
    public void user_should_be_on_the_homepage() {

        String expectedTitle = "#Inbox - Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Odoo"));

    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("User enters {string} and {string}")
    public void user_enters_and(String email, String password) {
        logInPage.emailBox.sendKeys(email);
        logInPage.passwordBox.sendKeys(password);
    }
    @When("User press login button")
    public void user_press_login_button() {
        logInPage.loginButton.click();

    }
    @Then("user sees Wrong login\\/password message displayed")
    public void user_sees_wrong_login_password_message_displayed() {

        String expectedResult = "Wrong login/password";

       // Assert.assertTrue(LogInPage.message.getText().equals(expectedResult));

        Assert.assertTrue(logInPage.messageDisplayed.getText().equals(expectedResult));
    }


    @Then("user see Please fill out this field message should be displayed if the password or username is empty")
    public void user_see_please_fill_out_this_field_message_should_be_displayed_if_the_password_or_username_is_empty() {
        Boolean required = Boolean.parseBoolean(logInPage.passwordBox.getAttribute("required"));
        Assert.assertEquals(true,required);
    }


    @When("user enters {string}")
    public void user_enters(String email) {
        logInPage.emailBox.sendKeys(email);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        logInPage.passwordBox.sendKeys(password);
    }

    @Then("user should see bullet signs by default")
    public void user_should_see_bullet_signs_by_default() {

        Boolean isBullet = logInPage.passwordBox.getAttribute("type").equals("password");
        Assert.assertEquals(isBullet,true);

    }

}
