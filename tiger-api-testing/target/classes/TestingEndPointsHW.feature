Feature: Adding Account

  Background: 
    Given url "https://tek-insurance-api.azurewebsites.net"
    And path "/api/token"
    And request {"username": "supervisor","password": "tek_supervisor"}
    When method post
    Then status 200
    * def generatedToken = response.token

  Scenario: Add new account with existing email address.
    Given path "/api/accounts/add-primary-account"
    And request {"Zamary_humraaz@yahoo.com", "title": "Mr.", "firstName": "Zamarai", "LastName": "Shinwari", "gender": "MALE", "maritalStatus": "MARRIED", "employmentStatus": "Working", "dateOfBirth": "1988/08/06"}
    And header Authorization = "Bearer" + generatedToken
    When method post
    Then status 400
    And print response

  Scenario: Add car to the account
    Given path "api/accounts/add-account-car"
    And param primaryPersonld = 2
    And request {"Make": "Genesis", "Model":  "SUV", "Year": "2022", "License Plate": "KBL-289077"}
    And header Authorization = "Bearer" + generatedToken
    When method post
    Then status 201
    And print response

  Scenario: Add phone number to existing account
    Given path "api/accounts/add-account-phone"
    And param primaryPersonld = 2
    And request {"Phone Number": "0777289077", "Extention": "NULL", "Available Time": "Any", "Type": "Mobile"}
    And header Authorization = "Bearer" + generatedToken
    When method post
    Then status 201
    And print response

  Scenario: Add address to existing account
    Given path "/api/accounts/add-account-address"
    And param primaryPersonld = 2
    And request {"Address Type": "Home", "Address": "210 Kirkland drive", "City": "Henrico", "Sate": "Virginia", "Zip Code": "23294"}
    And header Authorization = "Bearer" + generatedToken
    When method post
    Then status 201
    And print response
