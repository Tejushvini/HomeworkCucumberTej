@UserManagement
Feature: Approve user as admin
  As a System Administrator
  I want to create, approve, and promote a new user to Admin status
  So that user is able to access admin functionalities

  Background:
    Given the system is accessible
    And an existing admin account "SuperAdmin" is available

  Scenario: Promote a new user to admin and verify privileges
    # Step 1: Create a new user
    Given I am on the "Sign Up" page
    When I register a new user with username "NewAssociate" and password "Pass1234!"
    Then the user "NewAssociate" should be created with a "Pending" status

    # Step 2: Approve the new user
    And I log in as "SuperAdmin"
    And I navigate to the "Pending Approvals" dashboard
    When I approve the user account for "NewAssociate"
    Then the account status for "NewAssociate" should change to "Active"

    # Step 3: Make the new user an admin user
    And I navigate to "User Management"
    When I change the role of "NewAssociate" from "Standard User" to "Administrator"
    And I save the changes
    Then "NewAssociate" should be listed with "Admin" permissions

    # Step 4: Login with the new user
    And I log out of the system
    When I log in with username "NewAssociate" and password "Pass1234!"
    Then I should be successfully redirected to the dashboard

    # Step 5: Verify Admin status
    And I should see the "Admin Settings" menu option
    And I should have access to the "System Logs" page
    But I should not see any "Unauthorized Access" warnings

    Examples:
      | username          | password  |
      | tej1@gmail.com | @123456789 |