
  Feature: Creating to do list and editing the list
    As a user i want to add items to do list and edit the list so i can create my list.

    Scenario: Verify that if users create and edit to do list.
      When users are home page
      And users click javascript button
      And users select polymer link
      And users add two items to the list
      And users are able to edit the list
