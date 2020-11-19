Feature: feature to test smoke functionality

#ClearScreen
Scenario: Validate the screen is cleared
Given some numbers typed on the calculator
When C is pressed
Then Screen is cleared