@sample
  Feature: Sample feature file
    Scenario Outline: Scenario1
      Given user launches the application <url>
      When user enters credentials <userid> and <password>
      Then verify user enters homepage <validity>

      Examples:
      |url|userid|password|validity|
      |   |      |        |        |