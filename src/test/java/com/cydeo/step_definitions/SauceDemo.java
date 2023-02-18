package com.cydeo.step_definitions;

import com.cydeo.pages.sauce_demo.HomePage;
import com.cydeo.pages.sauce_demo.LoginPage;
import com.cydeo.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class SauceDemo {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get("https://www.saucedemo.com/");
    }

    @When("user enters standard user username")
    public void userEntersStandardUserUsername() {
        loginPage.usernameBox.sendKeys("standard_user");
    }

    @And("user enters password")
    public void userEntersPassword() {
        loginPage.passwordBox.sendKeys("secret_sauce");
    }

    @And("user clicks login button")
    public void userClicksLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("user sees the home page")
    public void userSeesTheHomePage() {
        assertTrue(Driver.getDriver().getTitle().contains("Swag Labs"));
    }

    @When("user enters locked-out user username")
    public void userEntersLockedOutUserUsername() {
        loginPage.usernameBox.sendKeys("locked_out_user");
    }

    @When("user enters problem user username")
    public void userEntersProblemUserUsername() {
        loginPage.usernameBox.sendKeys("problem_user");
    }

    @When("user enters performance glitch user username")
    public void userEntersPerformanceGlitchUserUsername() {
        loginPage.usernameBox.sendKeys("performance_glitch_user");
    }

    @Given("user is on the home page")
    public void userIsOnTheHomePage() {
        Driver.getDriver().get("https://www.saucedemo.com/inventory.html");
    }

    @When("user clicks ADD TO CART buttons one by one")
    public void userClicksADDTOCARTButtonsOneByOne() {
        homePage.backpack.click();
        homePage.bikeLight.click();
        homePage.tshirtBolt.click();
        homePage.jacket.click();
        homePage.onesie.click();
        homePage.tshirt.click();
    }

    @And("user clicks cart button")
    public void userClicksCartButton() {
        homePage.cart.click();
    }

    @Then("user sees all products in the cart")
    public void userSeesAllProductsInTheCart() {
        System.out.println("Cart is here");
    }




}
