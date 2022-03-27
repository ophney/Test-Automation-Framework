Feature: Maintain user

  Scenario Outline: Updating user info
    Given User navigate to wamly landing page
    When user log in using username <username> and password <password>
    Then home page is displayed
    When user selects the user to edit using email <email>
    Then user enters firstname <firstname>, lastname <lastname>, mobile number <mobile number>, role <role> and department <department>
    And user clicks the update button
    And user clicks the Edit button <email>
    Then user checks if firstname <firstname> is updated
    And user checks if lastname <lastname> is updated
    And user checks if mobile number <mobile number> is updated
    And user checks if role <role> is updated
    And user checks if department <department> is updated


    Examples:

      |username                     | password     |firstname|lastname|email         | mobile number   |role         |department|
      |mthobisi@commandquality.co.za|Ntl@hl@M@rc3l#|Claro      |Relay  |ntlekom@gmail.com| 0801234567   |Rater| Analysis |

