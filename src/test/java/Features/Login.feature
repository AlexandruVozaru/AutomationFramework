Feature: First test

  Scenario Outline: Correct logIn
    Given I navigate to the logIn page
    And I enter the <UserName> and<Password> following for login
    And I click logInBtn
    Then I should see succesful message

    Examples:
      | UserName | Password |
      | admin1    | admin11  |
