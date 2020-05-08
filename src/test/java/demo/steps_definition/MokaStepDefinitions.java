package demo.steps_definition;

import demo.pages.pos.StartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MokaStepDefinitions {

  StartPage startPage = new StartPage();

  @Given("User is on moka start page")
  public void userIsOnMokaStartPage() {
    boolean actual = startPage.isOnPage();
    Assert.assertTrue(actual);
  }

  @When("User click sign in button on moka start page")
  public void userClickSignInButtonOnMokaStartPage() {
    startPage.clikSignInButton();
  }

}
