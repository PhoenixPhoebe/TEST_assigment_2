Feature: Reverse string
    I want to reverse any string I have

  Scenario: Reverse a string
    Given I have a string "abc"
    When I reverse the string
    Then I should get "cba"

  Scenario: Reverse a string with capital letters
    Given I have a string "aBc"
    When I reverse the string
    Then I should get "cBa"

  Scenario: Reverse a string 5 characters long
    Given I have a string "abcdefg"
    When I reverse the string
    Then I should get "gfedcba"
