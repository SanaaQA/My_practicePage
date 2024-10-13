Feature:Application demo

Scenario:Login should be success

Given User navigate to url
And User Enters username as sana
And User enters useremail as sanasameer.k@gmail.com
And User enters password as Test
And User clicks on checkbox
And User choose Gender
And User choose Employmet status
And User choose Date of birth
When User clicks the register button
Then Login should be success


Scenario: User Buys Something from Cart
Given User Navigates to URL
And User clicks on shop
And Added an item to the cart
And Clicks on Checkout
Then The Order is placed

