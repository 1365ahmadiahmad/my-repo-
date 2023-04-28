Feature: Last name error

Scenario: user see error message at the end of run
Given user on saucedemo page
And enters his username and password and clicks on login button
And adds first item on his cart and clicks on cart button on right up corner
And clicks checkout button
And enters his first and last name and postal code and clicks continue button
Then can see error message 'Error: Last Name is required'