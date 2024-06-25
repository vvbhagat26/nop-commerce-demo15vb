Feature: Register

  Scenario: User should navigate to register page successfully
    Given I am on homepage
    When I click on register link
    Then I should verify register text


    Scenario: Verify that FirstName LastName Email Password And ConfirmPasswordFields Are Mandatory
      Given I am on homepage
      When I click on register link
      And I click on register button
      Then I should verify first name error message
      Then I should verify the last name error message
      Then I should verify email error message
      Then I should verify password error message


      Scenario: verify that user should create account successfully
        Given I am on homepage
        When I click on register link
        And I select gender female
        And I enter first name
        And I enter last name
        And I select day
        And I select month
        And I select year
        And I enter emailn
        And I enter passwordn
        And I enter  confirm password
        And I click on registern button
        Then I should verify message your registration completed



