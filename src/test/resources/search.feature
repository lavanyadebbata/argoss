@search
Feature: Search
  As a customer
  I want to search for products
  So that i can view respective products

  @regression @live
  Scenario Outline: Searching for a product
    Given I am homepages
    When I search for "<item>"
    Then I should see respective "<item>" products
    Examples:
      | item |
      | puma |
      | AJ |

  @smoke @live
  Scenario Outline: Searching for a mitesh product
    Given I am homepages
    When I search for "<item>"
    Then I should see respective "<item>" products
    Examples:
      | item |
      | puma |
      | AJ |


    @regression
    Scenario: checkout
      Given I am homepages
      When I search for "nike"
      And I Select any products
      And I add product to basket
      And I go to chekout


  @e2e
  Scenario: Searching for a mitesh product
    Given I am homepages
    When I search for "nike"
    And I Select any products
    And I add product to basket
    And I go to chekout
    And I login to application
    And I proceed to payment
    And I make a payment
    then I should receive an order





