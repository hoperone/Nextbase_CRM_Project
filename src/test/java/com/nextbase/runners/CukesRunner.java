package com.nextbase.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt",
        },
        features = "src/test/resources/features",
        glue = "com/nextbase/step_definitions",
        dryRun = false,
        tags = "@run"
)
public class CukesRunner {
}
