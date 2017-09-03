@login
Feature: Login

  As a end user
  I want to login into application
  So that i can access website

  Scenario: Login with valid credentials
    Given I am on signIn page
    When I enter "rakesh" and ""
    Then I should successfully login to application


    @regression
  Scenario Outline: Login with invalid credentials
    Given I am on signIn page
    When i enter "<username>"
    And I enter "<password>"
    Then I should not login to application
    Examples:
      | username  | password |
      | validuser | IP       |
      | IU        | VP       |
      |           |          |
      |           | vp       |
      | IU        |          |
