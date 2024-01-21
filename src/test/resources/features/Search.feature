Feature: Search a Term in different search engines

@smoke
Scenario Outline: Search given text using Google search engines
Given User is navigated to Google page
When User searches "<text>" in search text box of Google
And First Link in Google Search results contains "<text>"
Examples: 
|text|
|flipkart|



@smoke
Scenario Outline: Search given text using Bing search engines
Given User is navigated to Bing page
When User searches "<text>" in search text box of Bing
And First Link in Bing Search results contains "<text>"
Examples: 
|text|
|amazon|


@smoke
Scenario Outline: Search given text using Yahoo! search engines
Given User is navigated to Yahoo page
When User searches "<text>" in search text box of Yahoo
And First Link in Yahoo Search results contains "<text>"
Examples: 
|text|
|flipkart|
|hkjh%^5|
