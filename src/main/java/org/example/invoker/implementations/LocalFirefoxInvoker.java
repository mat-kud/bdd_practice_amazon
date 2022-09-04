package org.example.invoker.implementations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.invoker.WebDriverInvoker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalFirefoxInvoker implements WebDriverInvoker {

    @Override
    public WebDriver invokeWebDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}
