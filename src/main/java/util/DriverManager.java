package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    public static WebDriver driver;

    /*
    public static final String USERNAME = "rajani26";
    public static final String AUTOMATE_KEY = "praDnrizwzoyGjTizcMk";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    public String browser;
  */
    public  DriverManager() throws MalformedURLException {
       String chromeDriverPath = System.getProperty("user.dir")+"/"+"src/main/resources/drivers/chromedriver";
       System.setProperty("webdriver.chrome.driver",chromeDriverPath);
       driver = new ChromeDriver();

      /*  this.browser = browser;
        DesiredCapabilities caps = new DesiredCapabilities();
        if( browser == "chrome") {

            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "70.0");
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("resolution", "1024x768");
            caps.setCapability("name", "Bstack-[Java] Sample Test");
        }

        if(browser == "firefox")
        {

            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "Firefox");
            caps.setCapability("browser_version", "70.0");
            caps.setCapability("browserstack.local", "false");
            caps.setCapability("browserstack.selenium_version", "3.10.0");

        }

        driver = new RemoteWebDriver(new URL(URL), caps);

       */

      //  driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

}
