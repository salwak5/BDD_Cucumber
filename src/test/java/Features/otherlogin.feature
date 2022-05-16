@otherloginfeature @testall
Feature: Techfios Login Functionality Validation
Background Given User is on TechFios Login page
@otherlogin1
Scenario: User should be able login with valid credentials
When User eneters username as "demo2@techfios.com"
When User eneters password as "abc123"
When User clicks signin button
Then User should land on dashboard page
@otherlogin2
Scenario: User should be able login with valid credentials from Database;
When User eneters "username" from database;
When User eneters "password" from database;
When User clicks signin button
Then User should land on dashboard page