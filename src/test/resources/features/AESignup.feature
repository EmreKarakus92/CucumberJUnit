  @AETask1 @AESignup
  Feature: As a user I want to signup so i can create my account

    Scenario: new account sign up verification
      When user is on automationexercise.com home page
      And user should see the home page
      And user clicks on signup-login button
      And user should see New User Signup! text
      And user enters username
      And user enters password
      And user clicks on signup
      And user should see ENTER ACCOUNT INFORMATION text
      And user enters Title Name Email Password Date of birth information
      And user select Sign up for our newsletter! checkbox
      And user select Receive special offers from our partners! checkbox
      And user fills Fill details: First name Last name Company Address Address2 Country State City Zipcode Mobile Number
      And user clicks Create Account button
      And user should see ACCOUNT CREATED! text
      And user clicks continue button
      And user should see Logged in as username text
      And user clicks Delete Account button
      Then user should see ACCOUNT DELETED! text and click Continue button

