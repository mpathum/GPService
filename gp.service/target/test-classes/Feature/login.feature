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
@tag
Feature: Login and Book a Doctor Appointment

  Scenario: User logs in and books a doctor appointment
    Given the user is on the login page
    When the user enters valid credentials
    And accepts the terms
    Then the user should be logged in successfully
    And navigates to book a doctor appointment
    And selects appointment time
    And enters complaint and postcode
    And finds a doctor
    And selects Boots Pharmacy
    And confirms the appointment


