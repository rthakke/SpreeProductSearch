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

public class SearchPageClass extends SuiteManager {
    public BasePage basePage;
    public LoginPage loginpage;
    public HomePage homePage;
    public SearchPage searchPage;


    @Test
    public void SearchFlow() throws InterruptedException {
        basePage = new BasePage();
        loginpage = basePage.clickLoginButton();
        homePage = loginpage.login();
        searchPage = homePage.homePage();
        Assert.assertTrue(DriverManager.driver.findElement(By.id("search-bar")).isDisplayed());
    }



}
