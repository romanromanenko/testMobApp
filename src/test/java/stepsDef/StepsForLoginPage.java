package stepsDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import pages.LoginPage;
import pages.ProfilePage;

public class StepsForLoginPage {

    LoginPage loginPage = new LoginPage();
    ProfilePage profilePage = new ProfilePage();

    @Given("User enter username {string} and password {string}")
    public void enterCredentials(String login, String password){
        loginPage.enterCredentials(login, password);
    }

    @When("User login to account")
    public void userLoginToAccount() {
        loginPage.enterToProfile();
    }

    @Then("User check that display main page")
    public void userCheckThatDisplayMainPage() {
        Assertions.assertThat(profilePage.checkForMainPage()).isTrue();
    }

    @Then("User see message about incorrect data")
    public void userSeeMessageAboutIncorrectData() {
        Assertions.assertThat(loginPage.displayErrorMessage()).isTrue();
    }
}
