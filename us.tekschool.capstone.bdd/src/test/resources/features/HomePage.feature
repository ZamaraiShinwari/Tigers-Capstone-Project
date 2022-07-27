@homePage1
Feature: HomePage

  Background: 
  Given User is on Retail Website

  @testOne
  Scenario: User verify currency values change
    When User click on Currency
    And User Choose Euro from dropdown
    Then currency value should change to Euro
    
  @testTwo
  Scenario: User empty Shopping cart message displays
    When User click on shopping cart
    Then "Your shopping cart is empty!" message should display
