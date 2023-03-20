Feature: Upload Multiple Files
  User story:  As a user, I should be able to upload files When pictures as messages

  Background: User is on the login page

    Given User navigates to website
    When User logs in with "username" and "password"
    Given User loads the file upload page
    When User clicks on "message" tab on activity stream page
    When User clicks on the "Upload files" button

  @wip
  Scenario Outline: User uploads multiple files of supported formats.


    When User inserts 3 types of <files> at the same time in Upload When images box
    When User clicks on the "send" button on stream page
    Then User sees all 3 files uploaded in "message" tab on stream page

    Examples:

      | files |
      | .pdf  |
      | .txt  |
      | .docx |

    @wip1
  Scenario Outline: User uploads pictures

    When User selects <picture> picture to upload in upload box
    When User clicks on the "send" button
    Then User sees uploaded pictures in message section on stream page

    Examples:

      | picture |
      | .jpeg   |
      | .png    |
      | .gif    |

  @wip2

  Scenario Outline: User inserts files and images into text

    When User selects <image> image to upload in Upload box
    When User selects <files> file to upload
    When User selects <files> file to upload
    When User clicks on "Insert in text" button on stream page
    Then User sees the image in the message field
    Then User sees the files in the message field
    When User clicks on "remove" button for the file on stream page
    When User clicks on "remove" button for the image on stream page
    When User renames the remaining file "UK Map A4" in the message field
    When User clicks on the "send" button on stream page
    Then User sees "test" in message section of the platform on stream page


    Examples:

      | image | files |
      | .jpeg | .pdf  |
      |       | .txt  |
