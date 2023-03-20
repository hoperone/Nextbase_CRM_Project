package com.nextbase.step_definitions;

import com.nextbase.pages.LogInPage;
import com.nextbase.pages.StreamPage;
import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FileUpload {

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
    public void user_clicks_on_the_button(String string) {
        streamPage.uploadFilesIcon.click();
    }


    @When("User inserts following {int} types of files at the same time in Upload When images box")
    public void user_inserts_following_types_of_files_at_the_same_time_in_upload_when_images_box() {
        String pathPdf = "C:\\Users\\nafis\\OneDrive\\Desktop\\images and files\\UK Map A4.pdf";
        String pathDoc = "C:\\Users\\nafis\\OneDrive\\Desktop\\images and files\\test.docx";
        String pathText = "C:\\Users\\nafis\\OneDrive\\Desktop\\images and files\\test.txt";

        streamPage.uploadFileButton.sendKeys(pathPdf);
        streamPage.uploadFileButton.sendKeys(pathDoc);
        streamPage.uploadFileButton.sendKeys(pathText);

    }
    @When("User clicks on the {string} button on stream page")
    public void user_clicks_on_the_button_on_stream_page(String string) {

    }
    @Then("User sees all {int} files uploaded in {string} tab on stream page")
    public void user_sees_all_files_uploaded_in_tab_on_stream_page(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //--


    @When("User selects following pictures to upload in upload box")
    public void user_selects_following_pictures_to_upload_in_upload_box() {

    }

    @Then("User sees uploaded pictures in message section on stream page")
    public void user_sees_uploaded_pictures_in_message_section_on_stream_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

// --

    @When("User selects image to upload in Upload box")
    public void user_selects_image_to_upload_in_upload_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User selects following file file to upload")
    public void user_selects_following_file_file_to_upload() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User selects following file to upload")
    public void user_selects_following_file_to_upload(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on {string} button on stream page")
    public void user_clicks_on_button_on_stream_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User sees the image in the message field")
    public void user_sees_the_image_in_the_message_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User sees the files in the message field")
    public void user_sees_the_files_in_the_message_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on {string} button for the file on stream page")
    public void user_clicks_on_button_for_the_file_on_stream_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks on {string} button for the image on stream page")
    public void user_clicks_on_button_for_the_image_on_stream_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User renames the remaining file {string} in the message field")
    public void user_renames_the_remaining_file_in_the_message_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User sees {string} in message section of the platform on stream page")
    public void user_sees_in_message_section_of_the_platform_on_stream_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
