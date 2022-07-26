#Feature: Create an account and add address to the account
#
  #Background: 
    #Given url "https://tek-insurance-api.azurewebsites.net"
    #* def createAccountResult = callonce read ("CreateAccountFeature.feature")
    #And print createAccountResult
    #* def primaryPersonId = createAccountResult.response.id
    #* def token = createAccountResult.response.result.token
#
  #Scenario: Add Address to an account
    #Given path "/api/accounts/add-account-address"
    #And param primaryPersonId = primaryPersonId
    #Given header Authorization = "Bearer " + token
    #Given request
      #"""
      #{
      #"addressType": "Home",
      #"addressLine1": "210 Kirkland drive",
      #"city": "Richmond",
      #"state": "Virginia",
      #"postalCode": "23294",
      #"current": true
      #}
      #"""
    #When method post
    #Then status 201
    #And print response
