package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import util.ConfigFileReader;
import util.DriverManager;

import java.net.MalformedURLException;

public class SuiteManager {
    DriverManager driverManager;
   // String browser;

    private static ConfigFileReader config = new ConfigFileReader();

    @BeforeSuite (alwaysRun = true)
    public void startDriver() throws MalformedURLException {
        driverManager = new DriverManager();
        System.out.println("Driver initialized");

    }

    @AfterSuite
    public void quitDriver(){
        DriverManager.driver.quit();
        System.out.println("Driver closed");
    }

    @BeforeClass
    public void launchUrl() {

        DriverManager.driver.manage().window().maximize();
        String baseUrl = config.getProperty("base_url");
        DriverManager.driver.get(baseUrl);
        System.out.println("Launched the url " + baseUrl);

    }
}
