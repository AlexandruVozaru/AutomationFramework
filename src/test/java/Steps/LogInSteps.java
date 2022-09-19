package Steps;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LogInSteps extends BaseUtil {
    private final BaseUtil base;

    public LogInSteps(BaseUtil base) {
        this.base = base;
    }


    @Given("I navigate to the logIn page")
    public void iNavigateToTheLogInPage() {

        base.Driver.navigate().to("https://demosite.executeautomation.com/");
    }

    @And("I enter the username as username and password as pass")
    public void iEnterTheUsernameAsUsernameAndPasswordAsPass() {

    }

    @And("I click logInBtn")
    public void iClickLogInBtn() {
        base.Driver.manage().window().fullscreen();

        base.Driver.close();
    }

    @Then("I should see succesful message")
    public void iShouldSeeSuccesfulMessage() {
    }


    @And("I enter the([^\"]*) and([^\"]*) following for login$")
    public void iEnterTheUserNameAndPasswordFollowingForLogin(String UserName, String Password) {

    }

}
