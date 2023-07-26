Feature: E2E test

  Scenario: Book order happy pass flow
    Given User is logged in
    When User add book in cart
    And Click goToOrders button
    Then User made an order of selected book
    And Click confirmTheOrder button
    Then Successful notification is displayed









