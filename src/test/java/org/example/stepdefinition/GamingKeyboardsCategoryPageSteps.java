package org.example.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageobject.GamingKeyboardsCategoryPage;
import org.testng.Assert;

import static org.example.stepdefinition.BaseSteps.*;

public class GamingKeyboardsCategoryPageSteps {
    GamingKeyboardsCategoryPage gamingKeyboardsCategoryPage = new GamingKeyboardsCategoryPage(webDriver);

    @And("User selects {string} on Gaming Keyboards Category Page")
    public void userSelectsBrandOnGamingKeyboardsCategoryPage(String brandName){
        gamingKeyboardsCategoryPage.selectBrand(brandName);
    }
    
    @And("User sets {string} and {string} on Gaming Keyboards Category Page")
    public void userSetsPriceRangeOnGamingCategoryPage(String minPrice, String maxPrice){
        gamingKeyboardsCategoryPage.setPriceRange(Float.parseFloat(minPrice), Float.parseFloat(maxPrice));
    }

    @And("User sorts items by price ascendingly on Gaming Keyboards Category Page")
    public void userSortsItemsByPriceAscendingly(){
        gamingKeyboardsCategoryPage.sortProductsByPriceLowToHigh();
    }

    @Then("Every title contains chosen {string} on Gaming Keyboards Category Page")
    public void everyTitleContainsChosenBrandName(String brandName){
        boolean doesEveryTitleContainBrandName = gamingKeyboardsCategoryPage
                                                    .verifyEveryTitleContainsBrandName(brandName);

        Assert.assertTrue(doesEveryTitleContainBrandName, "Not every title contains chosen brand name");
    }

    @Then("Items prices are between {string} and {string} on Gaming Keyboards Category Page")
    public void itemsPricesAreInDefinedRange(String minPrice, String maxPrice){
        boolean arePricesInChosenRange = gamingKeyboardsCategoryPage
                .verifyPricesAreInChosenRange(Float.parseFloat(minPrice), Float.parseFloat(maxPrice));

        Assert.assertTrue(arePricesInChosenRange, "Prices are not within specified range");
    }

    @Then("Items prices are sorted ascendingly on Gaming Keyboards Category Page")
    public void itemsPricesAreSortedAscendingly(){
        boolean arePricesInAscendingOrder = gamingKeyboardsCategoryPage
                                                .verifyPricesAreInAscendingOrder();

        Assert.assertTrue(arePricesInAscendingOrder, "Prices are not in ascending order");
    }









}
