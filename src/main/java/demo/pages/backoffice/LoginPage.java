package demo.pages.backoffice;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;

public class LoginPage {

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/login");
  }

  public void inputEmailorPhone(String data) {
    WebDriverInstance.webDriver
        .findElement(By.xpath("//input[@placeholder='Email or phone number']")).sendKeys(data);
  }

  public void inputPassword(String password) {
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Password']"))
        .sendKeys(password);
  }

  public void clickSignIn() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[text()='Sign in']")).click();
  }

}
