@TodayDeals
Feature: Amazon Deals

Background: Goto Todays Deals
Given Goto Amazon "https://www.amazon.com" 

@AllDeals @out
Scenario: Amazon All Deals
When Click on search field
And search for any product with one dim map
|phone1|nokia|
|phone2|sony|
|phone3|Iphone|
Then List the Products displayed in the below grid
When Click on any product

@out
Scenario Outline: Amazon All Deals with different test data
When Click on search field
And search for any product "<Phones>"
Then List the Products displayed in the below grid 
When Click on any product
Then Validate the same product clicked

Examples:
|Phones|
|nokia|
|sony|
|Iphone|

