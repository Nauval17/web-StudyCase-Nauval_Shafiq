package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModifiersPage {

  public String generateRandomName;

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/modifier");
  }

  public void clickCreate(){
    waitABit(5000);
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Modifier')]")).click();
  }

  public void inputName(){
    generateRandomName = RandomUtils.generateRandomModifierName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Name']"))
            .sendKeys(generateRandomName);
  }

  public void addManageOptions(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Options')]")).click();
  }

  public void addOptions(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Add Options')]")).click();
  }

  public void inputOpName(String op_name){
    WebDriverInstance.webDriver.findElement(By.xpath("//div[@class=\"form-group col-sm-6\"]//input[@type=\"text\"][1]"))
            .sendKeys(op_name);
  }

  public void inputPrice(){
    String price = RandomUtils.generateRandomModifierPrice();
    WebDriverInstance.webDriver.findElement(By.xpath("//div[@class=\"form-group col-sm-5\"]//input[@name=\"" +
            "options[0].price\"][1]")).sendKeys(price);
  }

  public void saveOP_Modifier(){
    WebDriverInstance.webDriver.findElement(By.xpath("//body/div/div/div/div/div/div/span[2]/button[1]")).click();
  }

  public void saveModifier(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(), 'Save')]")).click();
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
