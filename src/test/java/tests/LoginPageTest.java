package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import suite.SuiteManager;
import util.DriverManager;

public class LoginPageTest extends SuiteManager {
    public BasePage basePage;
    public LoginPage loginPage;
    public HomePage homePage;


    @Test
    public void basePage() throws InterruptedException {

        loginPage = new LoginPage();

        basePage.clickLoginButton();
        homePage= loginPage.login();
        Assert.assertTrue(DriverManager.driver.findElement(By.id("products")).isDisplayed());
    }
}
