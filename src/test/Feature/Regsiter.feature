@TestRegister
Feature: Register feature

  Background:
    Given user is on the home page
    And user clicks on login register
    Then user get navigated to the login and register page
    And user clicks on register tab



 Scenario Outline:
   When user enters first name as "<fName>" last name as "<lName>" email as "<email>" password as "<password>"
   And user clicks on register button
   Then user should see error message as "<error message>"
   Examples:
     | fName | lName | email                   | password  | error message                                  |
     |       | Bhatt | bhattjatinh@yahoo.co.in | Trial123$ | Please enter your first name                   |
     | Jatin |       | bhattjatinh@yahoo.co.in | Trial123$ | Please enter your last name                    |
     | Jatin | Bhatt |                         | Trial123$ | Please enter a valid email address.            |
     | Jatin | Bhatt | bhattjatinh@yahoo.co.in |           | Too short. Please enter at least 8 characters. |

