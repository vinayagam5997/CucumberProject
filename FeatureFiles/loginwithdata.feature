@Datadriven
Feature: going to orangeHrm
Scenario: navigating to OrangeHrm website
Given user is on login page of website
When user giving valid credentials"Admin"and "admin123"
And user click login button
Then user will see the home page