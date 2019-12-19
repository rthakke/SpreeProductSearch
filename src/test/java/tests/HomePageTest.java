package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;
import suite.SuiteManager;
import util.DriverManager;

public class HomePageTest extends SuiteManager {
    public BasePage basePage;
    public LoginPage loginPage;
    public HomePage homePage;
    public SearchPage searchPage;

    @Test
    public void basePage() throws InterruptedException {

        homePage = new HomePage();
        searchPage= homePage.homePage();
        Assert.assertTrue(DriverManager.driver.findElement(By.cssSelector(".alert.alert-success")).isDisplayed());
    }
}
