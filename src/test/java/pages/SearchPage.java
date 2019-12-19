package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import suite.SuiteManager;
import util.ConfigFileReader;
import util.DriverManager;

public class SearchPage extends SuiteManager {

    ConfigFileReader config;
    public SearchPage()
    {
        PageFactory.initElements(DriverManager.driver,this);
        config = new ConfigFileReader();
    }

    @FindBy(id = "keywords")
    private WebElement searchInputField;

    @FindBy(css = "input.btn.btn-success")
    private WebElement searchButton;

    public ProductListPage searchPage(){
        searchInputField.sendKeys(config.getProperty("searchItem"));
        searchButton.click();
        System.out.println("Searched for an Item");

        return new ProductListPage();
    }

}
