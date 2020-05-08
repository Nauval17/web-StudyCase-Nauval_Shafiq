package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoriesPage {

  public String generateRandomName;

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/categories");
  }

  public void clickCreate(){
    waitABit(5000);
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Category')]")).click();
  }

  public void inputCategoryName(){
    generateRandomName = RandomUtils.generateRandomCategoryName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Category Name']"))
            .sendKeys(generateRandomName);
  }

  public void saveCategory(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
  }

  public boolean checkItemDisplayed(){
    String xpath = "//td[text()= '%s']";
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 20);
    return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format(xpath, generateRandomName))
    )).isDisplayed();
  }

  public void waitABit(int millis){
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
