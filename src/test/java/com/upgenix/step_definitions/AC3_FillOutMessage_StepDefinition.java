package com.upgenix.step_definitions;

import com.upgenix.pages.LogInPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AC3_FillOutMessage_StepDefinition extends LogInPage {

    LogInPage logInPage = new LogInPage();


    @When("User enters {string}")
    public void user_enters(String email) {
       logInPage.emailBox.sendKeys(email);
       logInPage.passwordBox.sendKeys("");
    }

    @Then("user see Please fill out this field message should be displayed if the password or username is empty")
    public void user_see_please_fill_out_this_field_message_should_be_displayed_if_the_password_or_username_is_empty() {
       Boolean required = Boolean.parseBoolean(logInPage.passwordBox.getAttribute("required"));
        Assert.assertEquals(true,required);
    }



}
