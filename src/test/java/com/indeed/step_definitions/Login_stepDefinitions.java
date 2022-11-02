package com.indeed.step_definitions;

import com.indeed.pages.LoginPage;
import com.indeed.pages.ResetPasswordPage;
import com.indeed.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_stepDefinitions {

    LoginPage loginPage = new LoginPage();

    ResetPasswordPage resetPasswordPage = new ResetPasswordPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.symund.com");
    }
    @When("user enters correct {string} in the username box")
    public void user_enters_correct_in_the_username_box(String string) {
        loginPage.usernameBox.sendKeys(string);

    }
    @When("user enters correct {string} in the password box")
    public void user_enters_correct_in_the_password_box(String string) {
        loginPage.passwordBox.sendKeys(string);
    }

    @And("user clicks the login button")
    public void userClicksTheLoginButton() {
        loginPage.loginButton.click();

    }

    @Then("user should be able to see the dashboard")
    public void user_should_be_able_to_see_the_dashboard() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));

        Driver.closeDriver();
    }

    @When("user enters wrong {string} in the username box")
    public void user_enters_wrong_in_the_username_box(String string) {
        loginPage.usernameBox.sendKeys(string);
    }
    @When("user enters wrong {string} in the password box")
    public void user_enters_wrong_in_the_password_box(String string) {
        loginPage.passwordBox.sendKeys(string);
    }


    @Then("Wrong username or password message should be displayed")
    public void wrong_username_or_password_message_should_be_displayed() {
        loginPage.wrongUsernameOrPasswordMessage.isDisplayed();
    }


    @When("user keeps empty the username or the password")
    public void user_keeps_empty_the_username_or_the_password() {
        loginPage.usernameBox.sendKeys(" ");
    }
    @Then("Please fill out this field message should be displayed")
    public void please_fill_out_this_field_message_should_be_displayed() {
        loginPage.passwordBox.sendKeys(" ");
    }


    @Then("user should see the password in the form of dots")
    public void user_should_see_the_password_in_the_form_of_dots() {
        Assert.assertEquals("password" , loginPage.passwordBox.getAttribute("type"));

    }


    @When("user types in the password box")
    public void user_types_in_the_password_box() {
        loginPage.passwordBox.sendKeys("Hello");
    }
    @When("user clicks on the eye button in the password box")
    public void user_clicks_on_the_eye_button_in_the_password_box() {
        loginPage.eyeButton.click();
    }
    @Then("user can see the password")
    public void user_can_see_the_password() {
        Assert.assertEquals("text" , loginPage.passwordBox.getAttribute("type"));

    }


    @When("user can see the Forgot password? link on the page")
    public void user_can_see_the_forgot_password_link_on_the_page() {
        loginPage.forgotPasswordLink.isDisplayed();
    }
    @When("user clicks on the Forgot password? link")
    public void user_clicks_on_the_forgot_password_link() {
        loginPage.forgotPasswordLink.click();
    }
    @When("user can see the Reset password button on the next page")
    public void user_can_see_the_reset_password_button_on_the_next_page() {

        resetPasswordPage.resetPasswordButton.isDisplayed();

    }


    @When("user can see the [Username or email] in the username box placeholder")
    public void user_can_see_the_username_or_email_in_the_username_box_placeholder(){
        String actualPlaceHolder = loginPage.usernameBox.getAttribute("placeholder");
        String expectedPlaceholder = "Username or email";
        Assert.assertEquals(expectedPlaceholder, actualPlaceHolder);


    }
    @When("user can see the [Password] in the password box placeholder")
    public void user_can_see_the_password_in_the_password_box_placeholder() {

        Assert.assertEquals("Password",loginPage.passwordBox.getAttribute("placeholder") );
    }


}
