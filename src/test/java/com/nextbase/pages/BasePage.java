package com.nextbase.pages;

import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
               PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement userLogin;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement userPassword;

    @FindBy (xpath = "//input[@class='login-btn']")
    public WebElement loginButton;


    /**
     * below methods will log in using credentials from:
     *  configuration.properties
     */


    public void navigateLogInPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("nextbase.url"));
    }

    public void loginAsHr(){
        userLogin.sendKeys(ConfigurationReader.getProperty("hr.username"));
        userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }
    public void loginAsMarketing(){
        userLogin.sendKeys(ConfigurationReader.getProperty("marketing.username"));
        userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

    public void loginAsHelpdesk(){
        userLogin.sendKeys(ConfigurationReader.getProperty("helpdesk.username"));
        userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }



}
