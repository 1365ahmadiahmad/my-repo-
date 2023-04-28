Feature: Verrify final success message

Scenario: can see the success message at the end
Given he must on saucedemo page 
And user enters his username and password and clicks on login button
And adds first and thrid items to cart 
And removes first item from cart and clicks on cart button right up corner 
And sees your cart text on left corner up and clicks continue shopping button
And sorts items from high to low based price 
And adds expensive item to cart and clicks cart button
And can see two items in the cart 
And user clicks checkout button 
And enters his first and last name and postal code in  the text boxes and clicks on continue button
And clicks on finish button
Then user can see success message 'Thank you for your order!'