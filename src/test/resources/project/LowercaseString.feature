Feature: Change to lowercase string
  I want to Change to lowercase any string I have

  Scenario Outline: Change to lowercase string
    Given I have a string <arg0>
    When I Change to lowercase the string
    Then I should get <arg01>
    Examples:
      | arg0  | arg01 |
      | "abc" | "abc" |
      | "aBc" | "abc" |
      | "ABCDE" | "abcde" |