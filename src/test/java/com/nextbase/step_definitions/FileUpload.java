package com.nextbase.step_definitions;

import com.nextbase.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FileUpload {

    @Given("User navigates to website")
    public void user_navigates_to_website() {


    }
    @When("User logs in with {string} and {string}")
    public void user_logs_in_with_and(String string, String string2) {


    }
    @Given("User loads the file upload page")
    public void user_loads_the_file_upload_page() {

    }
    @When("User clicks on {string} tab on activity stream page")
    public void user_clicks_on_tab_on_activity_stream_page(String string) {

    }
    @When("User clicks on the {string} button")
    public void user_clicks_on_the_button(String string) {

    }
    @When("User selects  image to upload in Upload box")
    public void user_selects_image_to_upload_in_upload_box() {

    }
    @When("User selects .txt file to upload")
    public void user_selects_txt_file_to_upload() {

    }
    @When("User clicks on {string} button on stream page")
    public void user_clicks_on_button_on_stream_page(String string) {

    }
    @Then("User sees the image in the message field")
    public void user_sees_the_image_in_the_message_field() {

    }
    @Then("User sees the files in the message field")
    public void user_sees_the_files_in_the_message_field() {

    }
    @When("User clicks on {string} button for the file on stream page")
    public void user_clicks_on_button_for_the_file_on_stream_page(String string) {

    }
    @When("User clicks on {string} button for the image on stream page")
    public void user_clicks_on_button_for_the_image_on_stream_page(String string) {

    }
    @When("User renames the remaining file {string} in the message field")
    public void user_renames_the_remaining_file_in_the_message_field(String string) {

    }
    @When("User clicks on the {string} button on stream page")
    public void user_clicks_on_the_button_on_stream_page(String string) {

    }
    @Then("User sees {string} in message section of the platform on stream page")
    public void user_sees_in_message_section_of_the_platform_on_stream_page(String string) {

    }


    public static class Hooks  {
        @Before
        public void setUp(){


        }

        @After
        public void tearDown(){
            Driver.getDriver().close();
        }
    }
}
