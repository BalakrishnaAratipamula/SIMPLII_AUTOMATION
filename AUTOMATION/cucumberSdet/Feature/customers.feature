Feature: Customers

Scenario: Add a new customer 
	Given user launch mozilla firefox browser
	When user opens url "https://admin-demo.nopcommerce.com/login"
	And users enter email "admin@yourstore.com" and password as "admin"
	And click login
	Then user can view Dashboard
	When user click on customers menu
	And click on customers menu item 
	And click on add new button
	Then user can view add new customer page
	When user enter customer info
	And click on save button
	Then user can see confirmation message "The new customer has been added successfully."
	And close browser