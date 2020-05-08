@Web @Categories
Feature: Categories

  Scenario: Create Categories
    Given User open moka backoffice login page
    And User input email "nauval.shafiq17@gmail.com" on backoffice login page
    And User input password "mokaAPPS2020" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu categories on backoffice
    And User click add new categories
    And User add new categories
    And User save new categories
    Then User see new categories

