Feature: Creating Account

  Background: 
    Given url "https://tek-insurance-api.azurewebsites.net"
    And path "/api/token"
    And request {"username": "supervisor","password": "tek_supervisor"}
    When method post
    Then status 200
    And print response 

  Scenario: Create new Account happy path
    Given path "/api/accounts/add-primary-account"
    And request {"james2015us@yahoo.com", "title": "Mr.","firstName": "Zamarai","lastName": "Shinwari","gender": "MALE","maritalStatus": "MARRIED","employmentStatus": "Working","dateOfBirth": "1988-08-06"}
    And header Authorization = "Bearer " + generatedToken
    When method post
    And print response
    Then status 201
