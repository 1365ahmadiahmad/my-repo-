Feature: Success message at the end of run

Scenario: user can see success message
Given user on the saucedemo page
And enters his username and password and clicks login button
And sorts items based on price from low to high 
And adds first item to cart and clicks cart buttons 
And verrifies same selected item 
And clicks checkout buttons 
And enters his first and last name and pastol code and clicks continue buttons 
And clicks finish button
Then can see success message 'Thank you for your order!'