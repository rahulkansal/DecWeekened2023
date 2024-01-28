#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login Functionality
 
 
Background:
When Initialize Selenium Webdriver
Then Open the browser

		@Sanity
    Scenario: valid creds login
    Given I am on login page
    When Enter username and password
    And Click on submit button
    Then verify Homepage title
    
    @Regression
    Scenario: invalid creds login
    Given I am on login page
    When Enter username and password
    And Click on submit button
    Then verify Homepage title
    
    @Sanity
    Scenario: valid creds login with given Values
    Given I am on login page
    When Enter username "Rahul" and password "Automation"
    And Click on submit button
    Then verify Homepage title
    
    @Regression
     Scenario: valid creds login with step Values
    Given I am on login page
    When Enter the username and password
    |Rahul123|Kansal123|
    And Click on submit button
    Then verify Homepage title
    
    @Regression
    Scenario Outline: valid creds login with multiple Values
    Given I am on login page
    When Enter the username <username> and password <password>
    And Click on submit button
    Then verify Homepage title
    
    Examples:
    |username|password|
    |user1|password1|
    |user2|password2|
    
   