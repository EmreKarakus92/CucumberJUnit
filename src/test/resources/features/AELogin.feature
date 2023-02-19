@AETask @AELogin
  Feature: As i user i want to login so i can access my account

    Scenario: user logins with correct email and password
      When user is on automationexercise.com home page
      And user should see the home page
      And user clicks on signup-login button
      And user should see Login to your account text
      And user enter correct email and password
      And user click login button
      And user should see the logged in as username
      And user clicks Delete Account button
      Then user should see ACCOUNT DELETED! text and click Continue button