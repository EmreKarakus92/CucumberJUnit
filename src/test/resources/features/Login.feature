@Regression
  Feature: As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

    Background: users is expected to be Library Login Page
      Given user is on library login page

    Scenario: Login as librarian
      And user enter librarian username
      And user enter librarian password
      Then user should see the dashboard

    Scenario: Login as student
      And user enter student username
      And user enter student password
      Then user should see the dashboard

    Scenario: Login as admin
      And user enter admin username
      And user enter admin password
      Then user should see the dashboard  