package com.indeed.pages;

import com.indeed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordPage {

    public ResetPasswordPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "reset-password-submit")
    public WebElement resetPasswordButton;
}
