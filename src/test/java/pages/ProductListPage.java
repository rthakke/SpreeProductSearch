package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import suite.SuiteManager;
import util.ConfigFileReader;
import util.DriverManager;

import java.util.List;

public class ProductListPage extends SuiteManager {

    ConfigFileReader config;
    public ProductListPage()
        {
            PageFactory.initElements(DriverManager.driver,this);
            config = new ConfigFileReader();
        }

    @FindBy(xpath = "//*[@id='products']/div")
    private List<WebElement> productList;

    public void productListPage()
    {
        System.out.println("ProductList method is called");
        System.out.println("Number of products returned for the serach are: " + productList.size());

        for(WebElement products: productList)
        {
            System.out.println("Products returned for the search" + products.getText());
        }


    }


}
