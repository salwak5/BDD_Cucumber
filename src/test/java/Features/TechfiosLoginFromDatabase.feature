@DBTF_loginFeature @Testall
Feature: Techfios Login Functionality Validation

Background Given User is on TechFios Login page

@DBSTF_Login2
Scenario: User should be able login with valid credentials
When User eneters "username" from techfios database
#When User eneters "password" from techfios database
When User clicks signin button
Then User should land on dashboard page
