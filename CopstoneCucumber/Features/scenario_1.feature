Feature: Verrify success message

Scenario: A user should be able to see succ message 
Given user in loginpage of saucedemo 
And user inserts his username and password and clicks login button
And user adds first and second items to cart and clicks on cartbutton
And user clicks cneckout button
And user enters his personal informations in to textboxes and clicks on continue button
And user clicks finish button
Then user must see 'Your order has been dispatched, and will arrive just as fast as the pony can get there!'