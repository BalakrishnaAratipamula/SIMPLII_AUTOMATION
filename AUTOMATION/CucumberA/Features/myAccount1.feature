Feature: ***********Testing HRMS application**********
#Given is used to indicate a known step in a scenario
#When is used to indicate an action
#And is used to combine two steps or gherkin steps in a scenario 
#Then is used to validate an output
#regular expression - is 

@tag1
Scenario Outline: a
Given User is already on Open HRMS application
And Enter Registered "<username>" and "<password>" 
Then Home page should be shown

Examples:
|username|password|
|Admin|admin123|
|admin123|admn234|
|admin456|admin456|







#@tag2
#Scenario: b
#Given User is already on Open HRMS application
#And Enter Registered user name and Password
#Then Home page should be shown
#@tag3
#Scenario: c
#Given User is already on Open HRMS application
#And Enter Registered user name and Password
#Then Home page should be shown