Feature: To check the functionality of Ryanair airlines page
Scenario: To check the functionality of login with invalid email and invalid password
Given User should launch the chrome browser
When User should agree the prompt message 
When User should click the login button
And User should type the invalid email id
And User should type the invalid password
And User should click the page login button
Then User should get a invalid email id or invalid password message in red colour 



