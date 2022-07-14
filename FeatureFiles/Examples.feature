@Datadriven
Feature: orangeHrm website
Scenario Outline: going to OrangeHrm website
Given login page of website
When  credentials validating "<username>" and "<password>"
And login button click
Examples:
|username|password|
|Admin   |admin123|
|Admin | admin555|