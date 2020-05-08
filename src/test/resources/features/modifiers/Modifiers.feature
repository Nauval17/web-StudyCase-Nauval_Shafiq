@Web @Modifiers
Feature: Modifiers

  Scenario: Create modifier
    Given User open moka backoffice login page
    And User input email "nauval.shafiq17@gmail.com" on backoffice login page
    And User input password "mokaAPPS2020" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu modifiers on backoffice
    And User Create a modifier
    And User input modifier name
    And User add or manage modifier
    And User click modifier options
    And User input modifier options name "Modifier_OP"
    And User input modifier options price
    And User save modifier options name
    And User save modifier
    Then User see new modifier