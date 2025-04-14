Feature: User API Tests

  Background:
    * url 'http://localhost:' + karate.properties['karate.server.port']

  Scenario: Get all users
    Given path '/users'
    When method get
    Then status 200
    And match response[0].name == 'Alice'

  Scenario: Get user by ID
    Given path '/users/1'
    When method get
    Then status 200
    And match response.email == 'alice@example.com'

  Scenario: Create new user
    Given path '/users'
    And request { id: 2, name: 'Bob', email: 'bob@example.com' }
    When method post
    Then status 200
    And match response.name == 'Bob'