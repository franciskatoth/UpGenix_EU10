package com.upgenix.step_definitions;

import com.upgenix.pages.LogInPage;
import com.upgenix.utilies.ConfigurationReader;
import com.upgenix.utilies.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Properties;

public class AC4_BulletSings_StepDefinition  {

    LogInPage logInPage = new LogInPage();
    Properties properties = new Properties();



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
