package com.insoft.leicster.step_def;

import com.insoft.leicster.HomePage;
import com.insoft.leicster.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by maheshreddy on 28/08/2017.
 */
public class Search_Sd {

    HomePage homePage = new HomePage();
    ResultsPage resultsPage = new ResultsPage();

    @Given("^I am homepages$")
    public void i_am_homepage() {
        homePage.getPageURL();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String item) {
        homePage.doSearch(item);

    }

    @Then("^I should see respective \"([^\"]*)\" products$")
    public void iShouldSeeRespectiveProducts(String expected)  {
        String actual = resultsPage.isRelatedProuctDisplayed();
        Assert.assertEquals(expected,actual);
        Assert.assertTrue(expected.contains(expected));
    }
}
