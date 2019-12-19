package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import suite.SuiteManager;
import util.ConfigFileReader;
import util.DriverManager;

public class HomePage extends SuiteManager {

    ConfigFileReader config;
    public HomePage()
    {
        PageFactory.initElements(DriverManager.driver,this);
        config = new ConfigFileReader();
    }

    @FindBy(css = ".alert.alert-success")
     private WebElement myAccount;

    public SearchPage homePage(){

      if(myAccount.getText().equals("Logged in successfully"))
        {
            System.out.println("Logged in Successfully");
        }
      return new SearchPage();
    }



}