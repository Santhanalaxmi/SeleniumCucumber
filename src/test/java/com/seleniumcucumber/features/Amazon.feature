Feature: Validate the amazon application
Background: SEt up the environment
Given Browser is opened
Then Launches the website


Scenario: Check the amazon application is loaded and the tilte
Given User launches the application
Then Fetch the Title

Scenario: Search for an item
Given User is on Amazon Page
Then User selects Book as Category
Then Type Jayakumaran in Search box

Scenario: Fetch all the links in Footer
Given User is on Amazon Page
Then Get all the links in the footer page
