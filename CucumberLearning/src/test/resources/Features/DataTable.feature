Feature: Test the login functionality of facebook using DataTable

Scenario: Test the vaild login using DataTable
Given user is on login page
When user enters credentails using DataTable
 | deepikapolumuri@gmail.com | Varadhi@2022|
And click on login button
Then user should lands on homepage

