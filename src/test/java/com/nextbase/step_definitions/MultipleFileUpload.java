package com.nextbase.step_definitions;

import com.nextbase.pages.LogInPage;
import com.nextbase.pages.StreamPage;
import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleFileUpload {

    LogInPage logInPage = new LogInPage();
    StreamPage streamPage = new StreamPage();


    @Given("User navigates to website")
    public void user_navigates_to_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("nextbase.url"));

    }

    @When("User logs in with {string} and {string}")
    public void user_logs_in_with_and(String userLogin, String userPassword) {
        logInPage.userLogin.sendKeys("hr.username");
        logInPage.userPassword.sendKeys("password");

    }

    @Given("User loads the file upload page")
    public void user_loads_the_file_upload_page() {
        logInPage.loginButton.click();

    }

    @When("User clicks on {string} tab on activity stream page")
    public void user_clicks_on_tab_on_activity_stream_page() {
        streamPage.messageTab.click();
    }

    @When("User clicks on the {string} button")
    public void user_clicks_on_the_button() {
        streamPage.uploadFilesIcon.click();

    }

    @When("User inserts {int} types of .pdf at the same time in Upload When images box")
    public void user_inserts_types_of_pdf_at_the_same_time_in_upload_when_images_box(Integer int1) {

        String pathPdf = "C:\\Users\\nafis\\OneDrive\\Desktop\\images and files\\UK Map A4.pdf";
        String pathDoc = "C:\\Users\\nafis\\OneDrive\\Desktop\\images and files\\test.docx";
        String pathText = "C:\\Users\\nafis\\OneDrive\\Desktop\\images and files\\test.txt";

        streamPage.uploadFileButton.sendKeys(pathPdf);
        streamPage.uploadFileButton.sendKeys(pathDoc);
        streamPage.uploadFileButton.sendKeys(pathText);


    }

    @When("User clicks on the {string} button on stream page")
    public void userClicksOnTheButtonOnStreamPage(String arg0) {

    }

    @Then("User sees all {int} files uploaded in {string} tab on stream page")
    public void userSeesAllFilesUploadedInTabOnStreamPage(int arg0, String arg1) {

    }

    //---

    @When("User selects <picture> picture to upload in upload box")
    public void userSelectsPicturePictureToUploadInUploadBox() {
    }

    @Then("User sees uploaded pictures in message section on stream page")
    public void userSeesUploadedPicturesInMessageSectionOnStreamPage() {
    }



    //---

    @When("User selects <image> image to upload in Upload box")
    public void userSelectsImageImageToUploadInUploadBox() {
    }

    @When("User selects <files> file to upload")
    public void userSelectsFilesFileToUpload() {
    }


    @When("User clicks on {string} button on stream page")
    public void userClicksOnButtonOnStreamPage(String arg0) {
    }

    @Then("User sees the image in the message field")
    public void userSeesTheImageInTheMessageField() {
    }

    @Then("User sees the files in the message field")
    public void userSeesTheFilesInTheMessageField() {
    }

    @When("User clicks on {string} button for the file on stream page")
    public void userClicksOnButtonForTheFileOnStreamPage(String arg0) {
    }

    @When("User clicks on {string} button for the image on stream page")
    public void userClicksOnButtonForTheImageOnStreamPage(String arg0) {
    }

    @When("User renames the remaining file {string} in the message field")
    public void userRenamesTheRemainingFileInTheMessageField(String arg0) {
    }

    @Then("User sees {string} in message section of the platform on stream page")
    public void userSeesInMessageSectionOfThePlatformOnStreamPage(String arg0) {
    }
}