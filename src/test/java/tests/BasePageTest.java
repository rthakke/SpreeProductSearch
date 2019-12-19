package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import suite.SuiteManager;
import util.DriverManager;

public class BasePageTest extends SuiteManager {
    public BasePage basePage;
    public LoginPage loginPage;

    @Test
    public void basePage() throws InterruptedException {
        basePage = new BasePage();
        loginPage = basePage.clickLoginButton();
        Assert.assertTrue(DriverManager.driver.findElement(By.id("logo")).isDisplayed());

    }
}
