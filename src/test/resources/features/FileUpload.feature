Feature: Upload Multiple Files functionality
  User story:  As a user, I should be able to upload files When pictures as messages
@wip
  Scenario: User uploads multiple files of supported formats

    Given User navigates to website
    When User logs in with "username" and "password"
    Given User loads the file upload page
    When User clicks on "message" tab on activity stream page
    When User clicks on the "Upload files" button
    When User inserts following 3 types of files at the same time in Upload When images box

      | .pdf  |
      | .txt  |
      | .docx |


    When User clicks on the "send" button on stream page
    Then User sees all 3 files uploaded in "message" tab on stream page



  Scenario: User uploads pictures

    Given User navigates to website
    When User logs in with "username" and "password"
    Given User loads the file upload page
    When User clicks on "message" tab on activity stream page
    When User clicks on the "Upload files" button

    When User selects following pictures to upload in upload box
      | picture |
      | .jpeg   |
      | .png    |
      | .gif    |


    When User clicks on the "send" button
    Then User sees uploaded pictures in message section on stream page





  Scenario: User inserts files and images into text

    Given User navigates to website
    When User logs in with "username" and "password"
    Given User loads the file upload page
    When User clicks on "message" tab on activity stream page
    When User clicks on the "Upload files" button
    When User selects image to upload in Upload box
    When User selects following file file to upload
    When User selects following file to upload

      | image | files |
      | .jpeg | .pdf  |
      |       | .txt  |

    When User clicks on "Insert in text" button on stream page
    Then User sees the image in the message field
    Then User sees the files in the message field
    When User clicks on "remove" button for the file on stream page
    When User clicks on "remove" button for the image on stream page
    When User renames the remaining file "UK Map A4" in the message field
    When User clicks on the "send" button on stream page
    Then User sees "test" in message section of the platform on stream page




