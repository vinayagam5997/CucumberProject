Feature: to test the google website
Scenario: google search scenario
Given user is entering google.co.in
When user give some text in search box "bikes"
And user press enter key
Then user should see the search results

