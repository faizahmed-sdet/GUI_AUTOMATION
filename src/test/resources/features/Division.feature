Feature: feature to test smoke functionality
#Division


#Scenario 1
Scenario: Validate the Division operation
Given Two positive non zero number
When second number divides firsts
Then Correct Value is Derived from division


#Scenario 2
Scenario: Validate the Division with Zero
Given Two positive numbers and one should be zero
When divided by zero
Then Error should be displayed


#Scenario 3
Scenario: Validate the Zero divide by positive non zero number
Given Two numbers and one should be zero and another is positive non zero
When zero is divided by positive non zero
Then Result should be Zero
