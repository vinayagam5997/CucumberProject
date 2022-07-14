Feature: orangeHrm
Scenario: OrangeHrm website
Given on login page of website
When entering the  valid credentials
|Admin|admin123|
And clicking login button
Then moving to the home page