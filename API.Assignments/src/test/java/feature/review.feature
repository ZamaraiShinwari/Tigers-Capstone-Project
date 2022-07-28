@End2End
Feature: End to End Testing

  Scenario: Automating of End to End testing
    Given url "https://tek-insurance-api.azurewebsites.net"
    And path "/api/token"
    And request {"username": "supervisor","password": "tek_supervisor"}
    When method post
    Then status 200
    And print response
    * def generatedToken = response.token
    And print generatedToken
    * def generator = Java.type('faker.data.api.DataGenerator')
    * def email = generator.getEmail()
    * def phone = generator.getPhoneNumber()
    * def firstname = generator.getFirstName()
    * def lastname = generator.getLastName()
    * def dob = generator.getDateOfBirth()
    And print email
    And print phone
    And print firstname
    And print lastname
    And print dob
    Given path "/api/accounts/add-primary-account"
    And request
      """
      {
      "email": "#(email)",
      "title": "Mr.",
      "firstName": "#(firstName)",
      "lastName": "lastName",
      "gender": "MALE",
      "maritalStatus": "MARRIED",
      "employmentStatus": "Employed",
      "dateOfBirth": "2022-07-18T23:16:41.471Z",
      "new": true
      }
      """
    And header Authorization = "Bearer " + generatedToken
    When method post
    Then status 201
    * def generatedId = response.id
    And print response
    Then assert response.email == email
    And print response
    Given path "/api/accounts/add-account-car"
    And header Authorization = "Bearer " + generatedToken
    And param primaryPersonId = generatedId
    And request
      """
      {
      "make": "Gensis",
      "model": "SUV",
      "year": "2022",
      "licensePlate": "KBL289077"
      }
      """
    When method post
    Then status 201
    And print response
    * def generator = Java.type('faker.data.api.DataGenerator')
    * def phone = generator.getPhone()
    * def ex = generator.getPhoneExtension()
    And print phone
    And print ex
    Given path "api/accounts/add-account-phone"
    And header Authorization = "Bearer " + generatedToken
    And param primaryPersonId = generatedId
    And request
      """
      {
      "phoneNumber": "#(phoneNumber)",
      "phoneExtension": "#(phoneExtension)",
      "phoneTime": "Day",
      "phoneType": "Mobile"
      }
      """
    When method post
    Then status 201
    And print response
    * def generator = Java.type('faker.data.api.DataGenerator')
    * def street = generator.getStreet()
    * def city = generator.getCity()
    * def state = generator.getState()
    * def country = generator.getCountry()
    * def zipCode = generator.getZipCode()
    * def countryCode = generator.getCountryCode()
    And print street
    And print city
    And print state
    And print country
    And print zipCode
    And print countryCode
    Given path "/api/accounts/add-account-address"
    And header Authorization = "Bearer " + generatedToken
    And param primaryPersonId = generatedId
    And request
      """
      {
      "addressType": "#(addressType)",
      "addressLine1": "#(addressLine1)",
      "city": "#(city)",
      "state": "#(state)",
      "postalCode": "#(postalCode)",
      "current": true
      }
      """
    When method post
    Then status 201
    And print response
