package com.upgenix.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/upgenix/step_definitions",
        dryRun = false,
        tags = "@UPGNX10-236",
        publish = true


        //"or"-> keyword "@librarian or @student"--> it will look for matching scenario tag(It will execute both of them)
        // "and": keyword - we are more specific
        //"and not": keyword-> can be used for excluding conditions
)
public class CukesRunner {
}
