@TF_loginFeature @Testall
Feature: Techfios Login Functionality Validation

Background Given User is on TechFios Login page
@TF_Login1 

Scenario Outline: User should be able login with valid credentials
When User eneters username as "<USERNAME>"
When User eneters password as "<PASSWORD>"
When User clicks signin button
Then User should land on dashboard page

Examples:
|USENAME            | PASSWORD |
|demo@techfios.com  |abc12|
|demo@techfios.com  |abc123|
|demo@techfios.com |abc123|



@TF_Login2
Scenario: User should be able login with valid credentials

When User eneters username as "demo@techfios.com"
When User eneters password as "abc123"
When User clicks signin button
Then User should land on dashboard page
#@TF_Login3
#Scenario: User should be able login with valid credentials

#When User eneters username as "demo2@techfios.com"
#When User eneters password as "abc123"
#When User clicks signin button
#Then User should land on dashboard page
#@TF_Login4
#Scenario: User should be able login with valid credentials

#When User eneters username as "demo2@techfios.com"
#When User eneters password as "abc1234"
#When User clicks signin button
#Then User should land on dashboard page