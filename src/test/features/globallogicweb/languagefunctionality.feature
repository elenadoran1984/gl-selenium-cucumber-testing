Feature: GlobalLogic Web

#  Background:
#    Given I open GlobalLogic Home page
#    And I select all available pages from Primary Menu

    #Scenario: 1
  @Smoke
  Scenario Outline: Select Services option from primary menu
    Given I open GlobalLogic Home page on "<browser>"
    When I change to Romania English from country options
    Then GlobalLogic Home Romania English page is opened

    Examples:
      | browser |
      | chrome  |
        #| firefox |
        #| edge    |