package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import suite.SuiteManager;
import util.ConfigFileReader;
import util.DriverManager;

public class BasePage extends SuiteManager {

   // WebDriverWait wait = new WebDriverWait(DriverManager.driver, 10);
    ConfigFileReader config;

    public BasePage()
    {
        PageFactory.initElements(DriverManager.driver,this);
        config = new ConfigFileReader();
    }

    @FindBy(css = "#link-to-login")
    private WebElement loginbutton;


    public LoginPage clickLoginButton() throws InterruptedException {
        Thread.sleep(1000);
       loginbutton.click();
        System.out.println("Clicked Login link");
        return new LoginPage();
    }

}
