@completeTest
Feature: Desktops Tab

  Background: 
    Given User is on Retail website
    When User click on Desktops tab
    And User click on Show all desktops

  @desktops1
  Scenario: User verify all items are present in Desktop tab
    Then User should see all items are present in Desktop page

  @desktop2
  Scenario: User add HP LP 3065 from Desktops tab to the cart
    And User click ADD TO CART option on HP LP3065 item
    And User select quantity '1'
    And User click on add to Cart button
    Then User should see a Message 'Success: you have added HP LP 3065 to your shopping cart!'

  @desktop3
  Scenario: User add Canon EOS 5D from Desktops tab to the cart
    And User click ADD To CART option on Canon EOS 5D item
    And User select color from dropdown Red
    And User select quantity '1'
    And User click on add to Cart button

  @desktop4
  Scenario: User add a review to Canon EOSn 5D item in Desktops tab
    And User click on Canon EOS 5D item
    And User click on write a review link
    And User fill the review information with below information
      | yourname | yourReview                         | Rating |
      | TEk User | This is not good on Friday Evening | good   |
    And User click on Continue Button
    Then User should see a message with 'Thank you for your review. it has been submitted to the webmaster for approval.'
