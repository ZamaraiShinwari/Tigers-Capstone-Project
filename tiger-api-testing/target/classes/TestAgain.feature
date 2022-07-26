Feature: Sample API Tests

  Scenario: Test tb sample GETn API
    Given url is 'https://reqres.in/api/users?page=2'
    When method GET
    Then status 200
