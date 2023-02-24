Feature: Login

Scenario: successfull login with valid credentials
	Given user launch mozilla firefox browser
	When user opens url "https://admin-demo.nopcommerce.com/login"
	And users enter email "admin@yourstore.com" and password as "admin"
	And click login
	Then page title should be "Dashboard / nopCommerce administration"
	When user click on logout link
	Then page title should be "Your store. Login"
	And close the browser
	
	
Scenario Outline: Login data driven
	Given user launch mozilla firefox browser
	When user opens url "https://admin-demo.nopcommerce.com/login"
	And users enter email "<email>" and password as "<ped>"
	And click login
	Then page title should be "Dashboard / nopCommerce administration"
	When user click on logout link
	Then page title should be "Your store. Login"
	And close the browser
	
	Examples:
		|email|ped|
		|admin@yourstore.com|admin|
		|admin@yourstore.com|admi123|