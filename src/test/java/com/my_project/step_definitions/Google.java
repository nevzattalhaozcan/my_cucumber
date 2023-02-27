package com.my_project.step_definitions;

import com.my_project.pages.google.GoogleHomePage;
import com.my_project.pages.google.GoogleResultPage;
import com.my_project.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Google {

    GoogleHomePage googleHomePage = new GoogleHomePage();

    @Given("user on the google page")
    public void userOnTheGooglePage() {
        Driver.getDriver().get("https://google.com");
    }

    @And("user sends some keys to the input box and press enter")
    public void userSendsSomeKeysToTheInputBoxAndPressEnter() {
        GoogleHomePage googleHomePage = new GoogleHomePage();
        googleHomePage.inputBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user sees the search results on the page")
    public void userSeesTheSearchResultsOnThePage() {
        GoogleResultPage googleResultPage = new GoogleResultPage();
        assertTrue(googleResultPage.result.isDisplayed());
        System.out.println(googleResultPage.result.getText());
    }


    @When("user clicks images link")
    public void userClicksImagesLink() {
        googleHomePage.imagesLink.click();
    }

    @When("user searches an image and presses enter")
    public void userSearchesAnImageAndPressesEnter() {
        googleHomePage.inputBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user sees the page on the screen")
    public void userSeesThePageOnTheScreen() {
        assertTrue(Driver.getDriver().getTitle().contains("apple"));
    }

}
