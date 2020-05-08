package demo.pages.backoffice;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

  public boolean isOnPage() {
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 30);
    return wait.until(
        ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(text(),'Dashboard')]")))
        .isDisplayed();
  }

}
