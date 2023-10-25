@regression @contact-us
Feature: Web-driver University - Contact Us page

  Background:
    Given <Gary> accesses the web-driver university contact-us page

  @smoke
  Scenario: Validate the successful submission - Unique-Data
    When <Gary> enters a unique first name
    And <Gary> enters a unique last name
    And <Gary> enters a unique email address
    And <Gary> enters comments
    And <Gary> clicks on Submit button
    Then <Gary> should be presented with successful contact us submission message

  Scenario: Validate the successful submission - Specific-Data
    When <Gary> enters a specific first name Joe
    And <Gary> enters a specific last name Baker
    And <Gary> enters a specific email address 'Joe.Baker@mail.com'
    And <Gary> enters comments
    And <Gary> clicks on Submit button
    Then <Gary> should be presented with successful contact us submission message
