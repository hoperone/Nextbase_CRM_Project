package com.nextbase.step_definitions;

import com.nextbase.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    public void setupScenario() {
        System.out.println("________________ Setting up browser using cucumber @Before _______________");
    }

    // We can create more than more @Before, @After, @BeforeStep, @AfterStep
    // If we have multiple versions of the same annotation, we can prioritize the running order using the "order" keyword

    // @Before (value = "@login", order = 1)
    public void setupScenarioForLogins() {
        System.out.println("====this will only apply to scenarios with @login tag");
    }



    @After
    public void teardownScenario(Scenario scenario) { // keeps track of currently executed scenario

        if (scenario.isFailed()) { //--> if scenario fails this method will return TRUE boolean value and take a                                   screenshot

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        //BrowserUtils.sleep(5);
        Driver.closeDriver();

        //  System.out.println("_________________ Closing browser using cucumber @After ________________");
        //    System.out.println("============= Scenario ended. Take screenshot if failed!");

    }



    //  @AfterStep
    public void afterStep() {
        System.out.println("xxx Applying teardown using @AfterStep xxx");

    }
}
