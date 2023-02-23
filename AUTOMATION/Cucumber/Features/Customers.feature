Feature: Customers 

Background: Below are thecommon steps for each Scenario
	Given user launch chrome browser 
	When user opens URL "http://admin-demo.nopcommerce.com/login" 
	And user enters Email as "admin@yourstore.com" and password as "admin" 
	And click on login 
	Then user can view Dashboad 
	
Scenario: Add a new customer 
	When User click on customer menu 
	And click click on customer menu items 
	And click on add new button 
	Then  user view add new customer page 
	When user enter customer info 
	And click on save button 
	Then user can view confirmation message "The new customer has been added successfully." 
	And close browser 
	
Scenario: Search customer by EmailId 
	When User click on customer menu 
	And click click on customer menu items 
	And enter customer Email 
	When click on search button 
	Then user should found Email in search table 
	And close browser 
	
Scenario: Search customer by FirstName and LastName 
	When User click on customer menu 
	And click click on customer menu items 
	And enter customer FirstName 
	And enter customer LastName 
	When click on search button 
	Then user should found Name in the search table 
	And close browser