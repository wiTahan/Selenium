package seleniumwebdriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

	WebDriver driver;
    By inventoryItem = By.className("inventory_item");

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    //Get the User name from Home Page
    public int getNumberOfProducts(){
    	
    	List<WebElement> listProduct = driver.findElements(inventoryItem);
    	
        return listProduct.size();
    }
}
