package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemLibraryPage {

  public String generateItemName = "";

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/list");
  }

  public void clickCreate(){
    waitABit(5000);
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Item')]")).click();
  }

  public void inputName(){
    generateItemName = RandomUtils.generateRandomFoodName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Item Name']")).sendKeys(generateItemName);
  }

  public void inputPrice(){
    String price = RandomUtils.generateRandomItemPrice();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Price']")).sendKeys(price);
  }

  public void inputSKU(){
    String sku = RandomUtils.generateRandomSKU();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='SKU']")).sendKeys(sku);
  }

  public void saveItem(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(), 'Save')]")).click();
  }

  public boolean checkItemDisplayed(){
    String xpath = "//td[text()= '%s']";
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 20);
    return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format(xpath, generateItemName))
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
