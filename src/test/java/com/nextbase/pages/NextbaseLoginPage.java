package com.nextbase.pages;

import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextbaseLoginPage {

    public NextbaseLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement userLogin;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement userPassword;

    @FindBy (xpath = "//input[@class='login-btn']")
    public WebElement loginButton;


    /**
     * This method will log in using credentials from:
     *  configuration.properties
     */

    public void loginWithConfig(){
        userLogin.sendKeys(ConfigurationReader.getProperty("hr.username"));
        userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();

    }

}
