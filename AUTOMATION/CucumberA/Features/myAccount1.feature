Feature: *********** Testing HRMS application **********
#Given - is used to indicate a known step in a scenario
#When - is used to indicate an action
#And - is used to combine two steps or gherkin steps in a scenario 
#Then - is used to validate an output
#regular expression - is 

#----After installing 'CucumberEclipsePlugin' in Eclipse market place then only we will get 'log in Feature File'------#
#==========================================Execution 1===========================================#
@tag1
Scenario: a
Given User is already on Open HRMS application	### If we have duplicate steps 'Duplicate Stepdefinition exception' will occur
When Enter Registered user name and Password
Then Home page should be shown
When Browser is close


#==========================================Execution 2===========================================#
#@tag2
#Scenario Outline: b
#Given User is already on Open HRMS application
#When Enter Registered userName as "<username>" and passWord as "<password>" 
#Then Home page should be shown
#When Browser is close

#Examples:
#|username|password|
#|admin456|admin234|
#|admin456|admin456|
#|Admin|admin123|


#================================== Execution 3 : Data Table / data Driven ======================================#
#@tag3
#Scenario: c
#Given User is already on Open HRMS application
#When Enter Registered userName and passWord 
#|username|password|
#|admin123|admn234|
#|admin456|admin456|
#|Admin|admin123|
#Then Home page should be shown
#When Browser is close

#============================== We can write Feature file like be,low also (Just dummy implementation not there) =====================================#
#Feature: Login
#
#@tag1
#Scenario: Successful login with valid credentials
#
   #Given 	User Launch Chrome browser
   #When    User opens URL "https://admin-demo.nopcommerce.com/login"
   #Then    User Enter Email as "admin@yourstore.com" and password as "admin"
   #And     Click on Login
   #Then    Page Title should be "Dashboard / nopCommerce administration"
   #When    User click on Log out Link
   #Then    page title should be "Your store.Login"
   #And     close browser
   
