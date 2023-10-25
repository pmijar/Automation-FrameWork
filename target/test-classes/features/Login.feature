@regression @login
Feature: Web-driver University - Login

  Background:
    Given Gary accesses the web-driver university Login page

  Scenario: Validate the successful Login
    When Gary enters a username webdriver
    When Gary enters a password webdriver123
    And Gary clicks on Login button
    Then Gary should be presented with successful Login submission message

  Scenario: Validate the un-successful Login
    When Gary enters a username webdriver
    When Gary enters a password webdriver12
    And Gary clicks on Login button
    Then Gary should be presented with un-successful Login submission message

  @smoke
  Scenario Outline: Validate the successful and unsuccessful Login
    When Gary enters a username <username>
    And Gary enters a password <password>
    And Gary clicks on Login button
    Then Gary should be presented with message <loginValidationMessage>
    Examples:
      | username  | password     | loginValidationMessage |
      | webdriver | webdriver123 | validation succeeded   |
      | webdriver | web7181      | validation failed      |
      | webdriver | web908       | validation failed      |