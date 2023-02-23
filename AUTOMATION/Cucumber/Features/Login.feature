Feature: Login 

Scenario: Successful login with valid credentials 
	Given user launch chrome browser 
	When user opens URL "http://admin-demo.nopcommerce.com/login" 
	And user enters Email as "admin@yourstore.com" and password as "admin" 
	And click on login 
	Then page title should be "Dashboard / nopCommerce administration" 
	When user click on LogOut link 
	Then page title should be "Your store. Login" 
	And close browser 
	
Scenario Outline: Login Data Driven 
	Given user launch chrome browser 
	When user opens URL "http://admin-demo.nopcommerce.com/login" 
	And user enters Email as "<email>" and password as "<password>" 
	And click on login 
	Then page title should be "Dashboard / nopCommerce administration" 
	When user click on LogOut link 
	Then page title should be "Your store. Login" 
	And close browser 
	
	Examples: 
		|email|password|
		|admin@yourstore.com|admin|
		|admin@yourstore.com|admin123456|