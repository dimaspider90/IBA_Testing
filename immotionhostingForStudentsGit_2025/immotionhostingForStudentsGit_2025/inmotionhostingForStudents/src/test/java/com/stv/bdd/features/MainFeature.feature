Feature: Verify the "Need help logging in?" link

  Scenario: Verify the "Need help logging in?" link
    Given Main page is loaded
    When Support Center panel is loaded
    And Navigation Bar is loaded
    When Go to the login page
    When Click on the Need help logging in link
    Then User should be redirected to the help page