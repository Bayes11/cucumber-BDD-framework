package com.indeed.pages;

import com.indeed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "expand")
    public WebElement profileButton;

    @FindBy (xpath = "//li[@data-id='logout']")
    public WebElement logoutButton;


}
