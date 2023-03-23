package com.upgenix.step_definitions;

import com.upgenix.utilies.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    // Import from -> io.cucumber.java <- NOT FROM junit
    // @Before (order = 1)
    public void setupScenario(){
        System.out.println("----- Setting up browser using cucumber @Before ----");

    }

    @Before (value = "@login", order = 2) // like Priority in TestNG
    public void setupScenarioForLogins(){
        System.out.println("-> This will only apply to scenarios with @login tag!");

    }

      @Before(value = "@db", order = 0)
    public void setupForDatabaseScenarios(){
        System.out.println("-=-> This will only apply to scenarios with @db tag!");

    }

     @After
    public void teardownScenario(Scenario scenario){

        //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value


        if (scenario.isFailed()){

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }


        //  BrowserUtils.sleep(5);


        Driver.closeDriver();

        // System.out.println("===== Closing browser using cucumber @After ======");
        // System.out.println("===== Scenario ended/ Take screenshot if failed! ======");
    }



     @BeforeStep
    public void setupSet(){
        System.out.println("---> Applying setup using @BeforeStep !!!");
    }




}
