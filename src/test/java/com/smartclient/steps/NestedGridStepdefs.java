package com.smartclient.steps;

import com.smartclient.pages.FeaturedNestedGridPage;
import com.smartclient.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class NestedGridStepdefs {
    @Given("^User is on the nested grid page$")
    public void userIsOnTheNestedGridPage() throws InterruptedException {
        new HomePage().clickOnNestedGridTab();
    }

    @When("^User selects item with name 'correction'$")
    public void userSelectsItemWithNameCorrection() {
        new FeaturedNestedGridPage().clickToSortAsc();
    }
}
