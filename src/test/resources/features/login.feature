Feature: feature to test smoke functionality

#LaunchApplication
Scenario: Check login is successful with valid credentials
Given Browser is Opened
When User Hits the URL
Then The Calculator Page Should Be displayed

#Application Working
Scenario: Check if all buttons are working
Given Some Random Numbers
When The Numbers are Pressed
Then The Numbers are Shown on the Screen