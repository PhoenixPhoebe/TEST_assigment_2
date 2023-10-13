Feature: Capitailze string
  I want to Capitailize any string I have

  Scenario Outline: Capitailize a string
    Given I have a string <arg0>
    When I Capitailize the string
    Then I should get <arg01>
    Examples:
      | arg0  | arg01 |
      | "abc" | "ABC" |
      | "aBc" | "ABC" |
      | "aBcde" | "ABCDE" |