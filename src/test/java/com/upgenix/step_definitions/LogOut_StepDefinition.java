package com.upgenix.step_definitions;

import com.upgenix.pages.LogInFunctionality;
import com.upgenix.pages.LogOutFunctionality;
import com.upgenix.utilies.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class LogOut_StepDefinition {

    LogOutFunctionality logOutFunctionality = new LogOutFunctionality();

    Actions actions = new Actions(Driver.getDriver());
    @Then("user click to his own username")
    public void user_click_to_his_own_username() {
        logOutFunctionality.userNameButton.click();

    }
    @Then("user click to Log Out button")
    public void user_click_to_log_out_button() {
        logOutFunctionality.logOutButton.click();

    }

    @And("User clicks the step backButton after successfully logged out.")
    public void userClicksTheStepBackButtonAfterSuccessfullyLoggedOut() {

        Driver.getDriver().navigate().back();


    }


    @And("user can not go to homepage again.")
    public void userCanNotGoToHomepageAgain() {
        String expectedTitle = "Login | Best solution for startups";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Login |"));





    }

}
