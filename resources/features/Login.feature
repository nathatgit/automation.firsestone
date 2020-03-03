Feature: Validate the login page functionalities (TC_001_LoginPage)

  @LoginPage
  Scenario Outline: 
    Given User is on home page
    When User validate Page Logo
    When user validate contact_us and sign_in links
    When user user clicks on sign_in link
    Then user validate sign-in failed with incorrect credentials
    Then user validate sign-in with correct "<username>" and "<password>"

    Examples: 
      | username            | password |
      | qurate@selenium.com | qurate   |
