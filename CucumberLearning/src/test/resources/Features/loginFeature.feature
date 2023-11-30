Feature: Test the login functionality of facebook

Scenario: Test the vaild login
Given user is on login page
When user enters email address and passward
And click on login button
Then user should lands on homepage

Scenario: Test the vaild login1
Given user is on login page
When user enters email address and passward
And click on login button
Then user should lands on homepage
