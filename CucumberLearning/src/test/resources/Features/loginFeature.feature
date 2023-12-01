Feature: Test the login functionality of facebook

Scenario Outline: Test the vaild login
Given user is on login page
When user enters <email> and <passward>
And click on login button
Then user should lands on homepage

Examples:
    | email | passward |
    | deepikapolumuri@gmail.com | Varadhi@2022|
    | deepikapolumuri2@gmail.com | Varadahi@20223|
