package com.indeed.step_definitions;

import com.indeed.pages.DashboardPage;
import com.indeed.pages.LoginPage;
import com.indeed.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_StepDefinitions {

    LoginPage loginPage =new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("user is on the dashboard")
    public void user_is_on_the_dashboard() {
        Driver.getDriver().get("https://qa.symund.com");
        loginPage.usernameBox.sendKeys("Employee111");
        loginPage.passwordBox.sendKeys("Employee123");
        loginPage.loginButton.click();

    }
    @When("user click at the profile in the top right corner")
    public void user_click_at_the_profile_in_the_top_right_corner() {

        dashboardPage.profileButton.click();


    }
    @When("user clicks [Log out] button")
    public void user_clicks_log_out_button() {
        dashboardPage.logoutButton.click();

    }
    @Then("user should ends up in login page")
    public void user_should_ends_up_in_login_page() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Symund - QA";

        Assert.assertEquals(expectedTitle, actualTitle);

        Driver.closeDriver();

    }

    @When("user logged out")
    public void user_logged_out() {
        Driver.getDriver().get("https://qa.symund.com");
        loginPage.usernameBox.sendKeys("Employee111");
        loginPage.passwordBox.sendKeys("Employee123");
        loginPage.loginButton.click();
        dashboardPage.profileButton.click();
        dashboardPage.logoutButton.click();


    }
    @When("user click step back button")
    public void user_click_step_back_button() {
        Driver.getDriver().navigate().back();

    }
    @Then("user should not be directed to the home page again")
    public void user_should_not_be_directed_to_the_home_page_again() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Symund - QA";

        Assert.assertEquals(expectedTitle, actualTitle);

    }

}
