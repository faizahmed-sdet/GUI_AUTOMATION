Feature: feature to test smoke functionality
#Division
Scenario: Validate the Division operation
Given Two positive non zero number
When second number divides firsts
Then Correct Value is Derived from division

Scenario: Validate the Division with Zero
Given Two positive numbers and one should be zero
When divided by zero
Then Error should be displayed