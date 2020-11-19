Feature: feature to test smoke functionality

#Subtraction

#Scenario One
Scenario: Validate the Subtraction operation is working as expected
Given Launch Application and provide Two positive non zero numbers
When second number is subtracted from first
Then Correct Value is Derived


#Scenario Two
Scenario: Validate when a greater number is subtracted from smaller number
Given Two non equal numbers positive numbers
When When a greater number is subtracted from smaller number
Then Result should be a negative number


#Scenario Three
Scenario: Validate when a smaller number is subtracted from a greater number
Given Two non equal numbers positive numbers
When When a smaller number is subtracted from greater number
Then Result should be a positive number


#Scenario Four
Scenario: Validate when the same number is subracted from itself
Given Two equal positive numbers
When When the number is subtracted itself
Then Result should be a Zero

