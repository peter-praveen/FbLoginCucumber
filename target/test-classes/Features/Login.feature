Feature: Facebook Login Feature

Background: 
Given Launch chrome browser
When Navigate to Facebook URL
Then Verify the login page

Scenario: Login test
Given  Enter username and password
When Click Login button
Then Verify the HomePage
