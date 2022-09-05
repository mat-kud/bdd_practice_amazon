package org.example.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pageobject.IndexPage;

import static org.example.stepdefinition.BaseSteps.*;


public class IndexPageSteps {
    IndexPage indexPage = new IndexPage(webDriver);

    @Given("User is on Index Page")
    public void userIsOnIndexPage(){
        indexPage.openIndexPage();
    }

    @When("User opens Gaming Keyboards Category Page")
    public void userOpensGamingCategoryPage(){
        indexPage.openGamingKeyboardsPage();
    }
}
