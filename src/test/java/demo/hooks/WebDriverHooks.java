package demo.hooks;

import demo.webdriver.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class WebDriverHooks {

  @Before(value = "@Web and @Categories")
  public void initializeWebdriver() {
    WebDriverInstance.initialize();
  }

  @After(value = "@Web and @Categories")
  public void quitWebdriver(Scenario scenario) {
    if (scenario.isFailed()) {
      scenario
          .embed(((TakesScreenshot) WebDriverInstance.webDriver)
                  .getScreenshotAs(OutputType.BYTES),
              "image/png");
      scenario.write("Scenario Fail");
    }
    WebDriverInstance.quit();
  }

}
