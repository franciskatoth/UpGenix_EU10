package com.upgenix.step_definitions;

import com.upgenix.pages.LogInFunctionality;
import com.upgenix.pages.LogOutFunctionality;
import io.cucumber.java.en.Then;

public class LogOut_StepDefinition {

    LogOutFunctionality logOutFunctionality = new LogOutFunctionality();
    @Then("user click to his own username")
    public void user_click_to_his_own_username() {
        logOutFunctionality.userNameButton.click();

    }
    @Then("user click to Log Out button")
    public void user_click_to_log_out_button() {
        logOutFunctionality.logOutButton.click();

    }

}
