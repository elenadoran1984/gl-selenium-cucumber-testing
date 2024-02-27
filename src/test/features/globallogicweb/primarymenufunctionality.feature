Feature: GlobalLogic Web

#  Background:
#    Given I open GlobalLogic Home page
#    And I select all available pages from Primary Menu

    #Scenario: 1
    @Smoke
    Scenario Outline: Select Services option from primary menu
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      When I select Services option from primary menu
      Then GlobalLogic Services Offerings page is opened
      And GlobalLogic Services Offerings Title page is displayed

      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |

    #Scenario: 2
    @Smoke
    Scenario Outline: Select Work option from primary menu
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      When I select Work option from primary menu
      Then GlobalLogic Work page is opened
      And GlobalLogic Work Title page is displayed

      Examples:
        | browser |
        | chrome  |
        #| firefox |
        # | edge    |

    #Scenario: 3
    @Smoke
    Scenario Outline: Select Insights option from primary menu
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      When I select Insights option from primary menu
      Then GlobalLogic Insights page is opened
      And GlobalLogic Insights Title page is displayed

      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |

    #Scenario: 4
    @Smoke
    Scenario Outline: Select Careers option from primary menu
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      When I select Careers option from primary menu
      Then GlobalLogic Careers page is opened
      And GlobalLogic Careers Title page is displayed

      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |

    #Scenario: 5
    @Smoke
    Scenario Outline: Select About option from primary menu
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      When I select About option from primary menu
      Then GlobalLogic About page is opened
      And GlobalLogic About Title page is displayed

      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |

    #Scenario: 6
    @Smoke
    Scenario Outline: Select Contact option from primary menu
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      When I select Contact option from primary menu
      Then GlobalLogic Contact page is opened
      And GlobalLogic Contact Title page is displayed

      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |