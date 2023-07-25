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

    Then Check that we are on the Order page
    Then Mark callBack checkbox
    Then Select city in dropdown
    Then Select post point
    Then Select payment method
    Then Leave the comment
    Then Click confirmTheOrder button

    Then Check that order is successful
