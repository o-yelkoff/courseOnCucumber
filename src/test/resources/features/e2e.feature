Feature: E2E test

  Scenario: Book order happy pass flow
    Then Click " Увійти " button
    Then Input login
    Then Input password
    Then Click login button
    Then Account logo is displayed

    Then Insert book name in the search field
    Then Find selected book
    Then Hover the mouse over the book card
    Then Check book availability
    Then Click addToCart button
    Then Click cart icon
    Then Click goToOrders button



