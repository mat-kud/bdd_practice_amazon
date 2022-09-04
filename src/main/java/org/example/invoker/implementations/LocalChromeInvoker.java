package org.example.invoker.implementations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.invoker.WebDriverInvoker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalChromeInvoker implements WebDriverInvoker {

    @Override
    public WebDriver invokeWebDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
