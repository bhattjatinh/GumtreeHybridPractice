@TestLogin
Feature: Login function

  Background:
    Given user is on the home page
    And user clicks on login register
    Then user get navigated to the login and register page
@Test1
  Scenario: user should be able to login using valid credentials
    When user provides username as "bhattjatinh@yahoo.co.in" and password as "bhatt6009"
    And user click on login button
    Then user should be logged in and see welcome message as "Hi Jatin!"
@Test2
  Scenario Outline: user should see respective error messages when user try to login with invalid data
    When user provides "<username>" and "<password>"
    And user click on login button
    Then user should see respective "<error message>"

    Examples:
      | username                | password  | error message                          |
      |                         | bhatt6009 | Please enter a valid email address.    |
      | bhattjatinh@yahoo.co.in |           | Please enter your password             |
      | bhattjatinhyahoo.co.in  | bhatt6009 | Please enter a valid email address.    |
      | bhattjatinh@yahoo.co.in | sdfsdf    | Your username or password is incorrect |
      |                         |           | Please enter a valid email address.    |
