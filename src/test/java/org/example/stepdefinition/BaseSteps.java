package org.example.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class BaseSteps {
    public static WebDriver webDriver;

    @Before
    public void initWebDriver() {
        webDriver = new WebDriverFactory().getWebDriver();
    }

    /*@After
    public void afterScenario() {
        webDriver.close();
        webDriver.quit();
    }*/
}
