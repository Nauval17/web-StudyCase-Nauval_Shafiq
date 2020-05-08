package demo.webdriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

public class WebDriverInstance {

  public static WebDriver webDriver;

  public static void initialize() {
    ChromeOptions options = new ChromeOptions();
    options
        .addArguments("--start-maximized", "--incognito", "--disable-infobars"); // Add some options

    options.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC); // Optional, only as an info
    options.setCapability(CapabilityType.BROWSER_NAME,
        BrowserType.CHROME); // Optional, only as an info

    webDriver = new ChromeDriver(options); // Create the WebDriver object

    webDriver.manage().window().maximize(); // Add a screen option

    webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // Set the implicit timeout
  }

  public static WebDriver getWebDriver() {
    if (webDriver == null) {
      initialize();
    }
    return webDriver;
  }

  public static void quit() {
    webDriver.quit();
  }

}
