Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  Scenario:User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should verify 'Welcome, Please Sign In! message display

  Scenario: Verify the error message with Invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email
    And I enter password
    And I click on login button
    Then I should verify the error message

    Scenario: Verify that user should login successfully with valid credentilas
      Given I am on homepage
      When I click on login link
      And I enter email
      And I enter password
      And I click on login button
      Then I should verify that LogOut link is display

      Scenario: verify that user should log out successfully
        Given I am on homepage
        When I click on login link
        And I enter email
        And I enter password
        And I click on login button
        And I click on log out button
        Then I should verify that Log in link is display

