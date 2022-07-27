Feature: Retail Page N
Background:
Given user is on Retail website
And User click on MyAccount
When User click on login 
And user enter username 'userName'and password'password'
And User click on login button
Then User should be logged in to MyAccount dashboard

@ScenarioOne
Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on Register for an Affiliate Account link
And User fill affiliate form with below information
|company|website|taxtID|paymentMethod|Payee Name|
|TEK    |tekschool.us|123456|Cheque|TEK User|
And User check on About us check box
And User click on continue button
Then User should see a success message
@ScenarioTwo
Scenario: Edit your affiliate information from Cheque payment method to bank transfer 
When User click on 'Edit your affiliate information'link
And User click on Bank Transfer radio button 
And User fill Bank information with bellow information 
|bankName|abaNumber|swiftCode|accountName|accountNumber|
And User click on Continue button
Then User should see success message 
@ScenarioThree
Scenario: Edit  your account Information
When User click on 'Edit your account information'link
And User modify below information
| firstname | lastName | email          | telephone  |
| test     | test      | test53212364371@gmail.com | 8535353352 |
And User click on continue button
Then User should see a message 'Success: Your account has been successfully updated.'
