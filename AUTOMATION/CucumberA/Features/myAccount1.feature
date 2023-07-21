Feature: ***********Testing HRMS application**********
#Given - is used to indicate a known step in a scenario
#When - is used to indicate an action
#And - is used to combine two steps or gherkin steps in a scenario 
#Then - is used to validate an output
#regular expression - is 



#==========================================Execution 1===========================================#
@tag1
Scenario: a
Given User is already on Open HRMS application
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


#==================================Execution 3 : Data Table / data Driven ======================================#
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


