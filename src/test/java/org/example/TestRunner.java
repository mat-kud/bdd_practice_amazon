package org.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features/SearchingAndFilteringTest.feature",
    glue = {"org/example/stepdefiniton"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
