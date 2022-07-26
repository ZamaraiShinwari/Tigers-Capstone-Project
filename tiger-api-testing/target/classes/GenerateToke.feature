Feature: Token Generator

  Scenario: Generate valid token with supervisor user
    Given url "https://tek-insurance.azurewebsites.net/"
    And path "/api/token"
    And request {"username": "supervisor","password": "tek_supervisor"}
    When method post
    Then status 200
    And print response

  Scenario: Create New Account using Data generator
    * def generator = Java.type('tiger.api.test.data.DataGenerator')
    * def email = generator.getEmail()
    * def firstName = generator.getFirstName()
    * def lastName = generator.getLastName()
    Given path "api/accounts/add-primary-account"
    And request
      """
      {"email": "#(email)", "title": "Mr.", "firstName":"#(firstName)",
      "gender": "MALE", "maritalStatus": "MARRIED", "employmentStatus": "student",
      "dateOfBirth": "1989-20-07"
      }
      """
    And header Authoriztion = "Bearer " + generatedToken
    When method post
    Then status 201
    * def generatedId = response.id
    And print generatedId
    And print response
