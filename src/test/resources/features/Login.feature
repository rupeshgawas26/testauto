Feature: Login Page Automation of SauceDemo application
Background: User has navigated to Sauce Demo page
Given User is on login Page

@smoke @regression
Scenario Outline: Check if Login is successful with valid credentials
When User enters valid "<username>" and "<password>"
And Clicks on Login Button
Then User should be navigated to Home Page
And Close the Browser
Examples:
|username|password|
|standard_user|secret_sauce|







