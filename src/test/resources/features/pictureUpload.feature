Feature: Upload Multiple Files
  User story:  As a user, I should be able to upload files and pictures as messages

  Background: User is on the login page

    Given User loads the file upload page
    When User clicks on message tab
    And User clicks on the paper clip icon (Upload files) button

  Scenario Outline: User uploads multiple files of supported formats.


    When User inserts 3 types of <files> at the same time in Upload and images box
    And User clicks on the send button
    Then User sees all 3 files uploaded in message section of the platform


    Examples:

      | files |
      | .pdf  |
      | .txt  |
      | .docx |


  Scenario Outline: User uploads pictures

    And User selects <picture> picture to upload in Upload and images box
    Then User sees the platform display a progress bar indicating the upload progress
    And User clicks on the send button
    Then User sees uploaded pictures in message section of the platform



    Examples:

      | picture |
      | .jpeg   |
      | .png    |
      | .gif    |


  Scenario Outline: User inserts files and images into text
    And User selects <image> image to upload in Upload and images box
    And User clicks on insert in text box
    And User selects <files> file to upload
    And User clicks on insert in text box
    And User selects <files> file to upload
    And User clicks on insert in text box
    Then User sees the image and file(s) in the message field
    And User removes one file from the message field
    And User removes the image from the message field
    And User renames the remaining file in the message field
    And the user clicks on the send button
    Then User sees uploaded file in message section of the platform


    Examples:

      | image | files |
      | .jpeg | .pdf  |
      |       | .txt  |


