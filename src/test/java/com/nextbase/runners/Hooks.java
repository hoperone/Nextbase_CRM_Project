package com.nextbase.runners;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("Navigate to the web browser");
    }

    @After
    public void tearDown(){
        System.out.println("after running scenario, close the browser");
    }
}
