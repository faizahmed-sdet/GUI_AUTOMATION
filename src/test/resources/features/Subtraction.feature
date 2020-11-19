Feature: feature to test smoke functionality

#Subtraction
Scenario: Validate the Subtraction operation is working as expected
Given Launch Application and provide Two positive non zero numbers
When second number is subtracted from first
Then Correct Value is Derived