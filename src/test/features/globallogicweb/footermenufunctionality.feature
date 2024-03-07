Feature: GlobalLogic Web

#  Background:
#    Given I open GlobalLogic Home page
#    And I select all available pages from Primary Menu

    #Scenario: 1
    @Smoke
    Scenario Outline: Select Services option from footer menu
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      And I scroll to footer menu from GlobalLogic Home Romania English page
      When I select Services option from footer menu
      Then GlobalLogic Services Offerings page is opened
      And GlobalLogic Services Offerings Title page is displayed

      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |

    #Scenario: 2
    @Smoke
    Scenario Outline: Select Work option from footer menu
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      And I scroll to footer menu from GlobalLogic Home Romania English page
      When I select Work option from footer menu
      Then GlobalLogic Work page is opened
      And GlobalLogic Work Title page is displayed

      Examples:
        | browser |
        | chrome  |
        #| firefox |
        # | edge    |

    #Scenario: 3
    @Smoke
    Scenario Outline: Select Insights option from footer menu
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      And I scroll to footer menu from GlobalLogic Home Romania English page
      When I select Insights option from footer menu
      Then GlobalLogic Insights page is opened
      And GlobalLogic Insights Title page is displayed

      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |

    #Scenario: 4
    @Smoke
    Scenario Outline: Select Careers option from footer menu
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      And I scroll to footer menu from GlobalLogic Home Romania English page
      When I select Careers option from footer menu
      Then GlobalLogic Careers page is opened
      And GlobalLogic Careers Title page is displayed

      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |

    #Scenario: 5
    @Smoke
    Scenario Outline: Select About option from footer menu
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      And I scroll to footer menu from GlobalLogic Home Romania English page
      When I select About option from footer menu
      Then GlobalLogic About page is opened
      And GlobalLogic About Title page is displayed

      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |

    #Scenario: 6
    @Smoke
    Scenario Outline: Select Privacy option from footer menu
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      And I scroll to footer menu from GlobalLogic Home Romania English page
      When I select Privacy option from footer menu
      Then GlobalLogic Privacy page is opened
      And GlobalLogic Privacy Title page is displayed

      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |

    #Scenario: 7
    @Smoke
    Scenario Outline: Select Compliance and Disclosures option from footer menu
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      And I scroll to footer menu from GlobalLogic Home Romania English page
      When I select Compliance and Disclosures option from footer menu
      Then GlobalLogic Compliance and Disclosures page is opened
      And GlobalLogic Compliance and Disclosures Title page is displayed

      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |

    #Scenario: 8
    @Smoke
    Scenario Outline: Select Contact option from footer menu
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      And I scroll to footer menu from GlobalLogic Home Romania English page
      When I select Contact option from footer menu
      Then GlobalLogic Contact page is opened
      And GlobalLogic Contact Title page is displayed

      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |

    #Scenario: 9
    @Smoke
    Scenario Outline: Validate Social Pages
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      When I scroll to footer menu from GlobalLogic Home Romania English page
      Then GlobalLogic Social Pages are displayed
      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |

    #Scenario: 10
    @Smoke
    Scenario Outline: Select Linkedin Social Page
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      And I scroll to footer menu from GlobalLogic Home Romania English page
      When I select Linkedin from footer menu
      Then Linkedin page is opened
      And Linkedin Title page is displayed
      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |

    #Scenario: 11
    @Smoke
    Scenario Outline: Select Twitter Social Page
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      And I scroll to footer menu from GlobalLogic Home Romania English page
      When I select Twitter from footer menu
      Then Twitter page is opened
      And Twitter Title page is displayed
      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |

    #Scenario: 12
    @Smoke
    Scenario Outline: Select Facebook Social Page
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      And I scroll to footer menu from GlobalLogic Home Romania English page
      When I select Facebook from footer menu
      Then Facebook page is opened
      And Facebook Title page is displayed
      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |

    #Scenario: 13
    @Smoke
    Scenario Outline: Select Youtube Social Page
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      And I scroll to footer menu from GlobalLogic Home Romania English page
      When I select Youtube from footer menu
      Then Youtube page is opened
      And Youtube Title page is displayed
      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |

    #Scenario: 14
    @Smoke
    Scenario Outline: Select Instagram Social Page
      Given I open GlobalLogic Home page on "<browser>"
      And I change to Romania English from country options
      And GlobalLogic Home Romania English page is opened
      And I scroll to footer menu from GlobalLogic Home Romania English page
      When I select Instagram from footer menu
      Then Instagram page is opened
      And Instagram Title page is displayed
      Examples:
        | browser |
        | chrome  |
        #| firefox |
        #| edge    |