Feature: this feature is to test the flight booking site

Scenario: this scenario is to test the flight booking site
Given Launch the browser and load url
When Select the destination and departure date for the flight 
And the flight should be displayed and confirm the flight 
When provide the traveler details and check out
And confirm the payment details with valid cc
Then check the flight is booked and close the browser