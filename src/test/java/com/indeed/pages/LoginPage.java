package com.indeed.pages;

import com.indeed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "user")
    public WebElement usernameBox;

    @FindBy (id = "password")
    public WebElement passwordBox;

    @FindBy (id = "submit-form")
    public WebElement loginButton;

    @FindBy (id = "lost-password")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongUsernameOrPasswordMessage;

    @FindBy (xpath = "//a[@class='toggle-password']")
    public WebElement eyeButton;

}
