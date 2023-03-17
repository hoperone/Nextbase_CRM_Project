Feature: Upload Multiple Files
  User story:  As a user, I should be able to upload files and pictures as messages

 # Background: User is on the login page
  #  Given the user is logged in to the application and is on the file upload page
 #   When the user clicks on message tab and clicks the file upload button

  Scenario Outline: User uploads multiple files of supported formats.

    Given the user is logged in to the application and is on the file upload page
    When the user clicks on message tab and clicks the file upload button
    And selects 3 <files> each in a supported format
    Then the message section of the platform uploads all three files
    Then the uploaded files accessible to both the sender and recipient of the message.

    Examples:
    files
    .pdf
    .txt
    .docx


  Scenario Outline: User uploads pictures

    Given the user is logged in to the application and is on the file upload page
    When the user clicks on message tab and clicks the file upload button
    And the user selects <picturetype> picture to upload
    Then the application accepts the picture and begins the upload process
    Then the platform displays a progress bar indicating the upload progress
    Then once the upload is complete, the application displays an indication message that the file(s) are uploaded
    Then the application displays a preview of each uploaded picture
    Then the uploaded file(s) is accessible to the user and any other authorized users who can access the uploaded files.


    Examples:

    picturetype
    .jpg
    .png
    .gif


  Scenario Outline: : User uploads a file in a different format
    Given the user is logged in to the application and is on the file upload page
    When the user clicks on message tab and clicks the file upload button
    And the user selects <filetype> file(s) to upload
    Then the platform accepts the file(s) and begins the upload process
    Then the platform displays a progress bar indicating the upload progress
    Then once the upload is complete, the application displays an indication message that the file(s) are uploaded
    Then the uploaded file(s) is accessible to the user and any other authorized users who can access the uploaded files.

    Examples:

    filetype
    .pdf
    .jpeg
    .png
    .docx
    .txt
    .gif
