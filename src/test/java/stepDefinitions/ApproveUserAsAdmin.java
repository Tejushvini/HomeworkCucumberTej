package stepDefinitions;
import io.cucumber.java.en.*;
import org.testng.Assert;
import utils.Base;

public class ApproveUserAsAdmin {
    @Given("the system is accessible")
    public void the_system_is_accessible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("an existing admin account {string} is available")
    public void an_existing_admin_account_is_available(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("I am on the {string} page")
    public void i_am_on_the_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I register a new user with username {string} and password {string}")
    public void i_register_a_new_user_with_username_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user {string} should be created with a {string} status")
    public void the_user_should_be_created_with_a_status(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I log in as {string}")
    public void i_log_in_as(String string) {

            loginPage.enterUsername(username);

    }
    @Then("I navigate to the {string} dashboard")
    public void i_navigate_to_the_dashboard(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I approve the user account for {string}")
    public void i_approve_the_user_account_for(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the account status for {string} should change to {string}")
    public void the_account_status_for_should_change_to(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I navigate to {string}")
    public void i_navigate_to(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I change the role of {string} from {string} to {string}")
    public void i_change_the_role_of_from_to(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I save the changes")
    public void i_save_the_changes() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("{string} should be listed with {string} permissions")
    public void should_be_listed_with_permissions(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I log out of the system")
    public void i_log_out_of_the_system() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I log in with username {string} and password {string}")
    public void i_log_in_with_username_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should be successfully redirected to the dashboard")
    public void i_should_be_successfully_redirected_to_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see the {string} menu option")
    public void i_should_see_the_menu_option(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should have access to the {string} page")
    public void i_should_have_access_to_the_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should not see any {string} warnings")
    public void i_should_not_see_any_warnings(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
