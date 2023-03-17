package com.upgenix.step_definitions;

import com.upgenix.pages.LogInPage;
import com.upgenix.pages.WrongLogInPassword;
import com.upgenix.utilies.ConfigurationReader;
import com.upgenix.utilies.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AC2_WrongLogIn_StepDefinition extends LogInPage {

    WrongLogInPassword wrongLogInPassword = new WrongLogInPassword();
    LogInPage logInPage = new LogInPage();

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

        Assert.assertTrue(wrongLogInPassword.messageDisplayed.getText().equals(expectedResult));

    }

}
