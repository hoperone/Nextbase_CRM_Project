package com.nextbase.pages;

import com.nextbase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StreamPage {
    public StreamPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageTab;

    @FindBy(xpath = "//span[@title='Upload files']")
    public WebElement uploadFilesIcon;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//button[@class='ui-btn ui-btn-lg ui-btn-primary']")
    public WebElement sendButton;

    @FindBy(xpath = "//span[.='Insert in text']")
    public WebElement insertInTextButton;
    @FindBy(xpath = "//span[@class= 'del-but']")
    public WebElement deleteButton;
    @FindBy(xpath = "//span[@class= 'f-wrap']")
    public WebElement clickOnFileToRename;


}
