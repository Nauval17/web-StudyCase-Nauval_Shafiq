@Web @ItemLibrary
Feature: Item Library

  Scenario: Create Item
    Given User open moka backoffice login page
    And User input email "nauval.shafiq17@gmail.com" on backoffice login page
    And User input password "mokaAPPS2020" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu item library on backoffice
    And User click Create Item Button
    And User add random menu to the item
    And User add item price
    And User add item SKU
    And User save item
    Then User will see new item on item library page