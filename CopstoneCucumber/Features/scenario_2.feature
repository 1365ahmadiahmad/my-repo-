Feature: Verrify error message

Scenario: A user should be see the error message
Given user in loginpage of Saucedemo
And user enters his uuername and password and ckicks login button
Then user must able to see 'Epic sadface: Sorry, this user has been locked out.'