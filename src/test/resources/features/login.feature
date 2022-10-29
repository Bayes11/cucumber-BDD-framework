@SYMU-1392
Feature: Symund login page functionality



  Background:
    Given user is on the login page


  @SYMU-1646
  Scenario: User can log in with valid credentials
    When user enters correct "Employee111" in the username box
    And user enters correct "Employee123" in the password box
    And user enters Log in button
    Then user should be able to see the dashboard

    @SYMU-1648
    Scenario: User cannot login with invalid credentials
      When user enters wrong "username" in the username box
      And user enters wrong "password" in the password box
      Then Wrong username or password message should be displayed


    Scenario: User cannot login with invalid credentials
      When user keeps empty the username or the password
      Then Please fill out this field message should be displayed


     @SYMU-1649
      Scenario: user can see the password in the form of dots by default
       When user types in the password box
       Then user should see the password in the form of dots

       @SYMU-1650
       Scenario: User should see the password explicitly if needed
         When user types in the password box
         And user clicks on the eye button in the password box
         Then user can see the password


         @SYMU-1651
         Scenario: User can see the "Forgot password?" link on the login page and can see the "Reset password" button
         on the next page after clicking on forget password link
           When user can see the Forgot password? link on the page
           And user clicks on the Forgot password? link
           And user can see the Reset password button on the next page

           @SYMU-1652
           Scenario: User can see valid placeholders on Username and Password fields
             When user can see the Username or email in the username box placeholder
             And user can see the Password in the password box placeholder













