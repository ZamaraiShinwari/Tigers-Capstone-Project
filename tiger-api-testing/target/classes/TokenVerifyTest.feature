Feature: Security test Verify Token test

  Scenario: Verify Valid token
    Given url "https://tek-insurance-api.azurewebsites.net"
    And path "/api/token"
    And request {"username": "supervisor","password": "tek_supervisor"}
    When method post
    Then status 200
    * def generatedToken = response.token
    Given path "/api/token/verify"
    And param token = generatedToken
    And param username = "supervisor"
    When method get
    And status 200
    Then print response

  Scenario: Verify Invalid token
    Given url "https://tek-insurance-api.azurewebsites.net"
    And path "/api/token/verify"
    And param token = "invalid-token-random-string"
    And param username = "supervisor"
    When method get
    Then status 400
    And print response
    * def errorMessage = response.errorMessage
    And assert errorMessage == "Token Expired or Invalid Token"

  Scenario: Test token verify with valid token and invalid usename
    Given url "https://tek-insurance-api.azurewebsites.net"
    And path "/api/token"
    And request {"username": "supervisor","password": "tek_supervisor"}
    When method post
    Then status 200
    * def gerenratedToken = response.token
    Given path "/api/token/verify"
    And param username = "invalid-username"
    And param token = generatedToken
    When method get
    Then status 400
    * def errorMessage = response.errorMesssage
    And assert errorMessage == "Wrong Username send along with Token"
