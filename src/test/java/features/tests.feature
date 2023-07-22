Feature: Test for mobile app

  Scenario: Login with correct credentials
    Given User enter username "Login" and password "Password"
    When User login to account
    Then User check that display main page

  Scenario: Login with incorrect credentials
    Given User enter username "Login123!@#" and password "Password!@#QWE"
    Then User see message about incorrect data

  Scenario: Login whit empty fields
    When User login to account
    Then User see message about incorrect data

  Scenario: Try a sql injection
    Given User enter username "'or 1=1" and password "qwe"
    When User login to account
    Then User see message about incorrect data

  Scenario: Login with incorrect login
    Given User enter username "Login123!@#" and password "Password"
    When User login to account
    Then User see message about incorrect data

  Scenario: Login with incorrect password
    Given User enter username "Login" and password "PasswordQWE"
    When User login to account
    Then User see message about incorrect data