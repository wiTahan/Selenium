package seleniumwebdriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestImplementation {
	
	String driverPath = "C:\\chromedriver.exe";
    WebDriver driver;
    LoginPage loginPage;
    ProductPage productPage;
    
    @BeforeTest
    public void setup(){
    	
    	System.setProperty("webdriver.chrome.driver", driverPath);     
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://www.saucedemo.com/");

    }
    
    /**

     * This test case will login in https://www.saucedemo.com/
     * Login to product page
     * Verify the number of products on product page

     */
    @Test
    public void testNumberOfProduct(){

        //Create Login Page object
    	loginPage = new LoginPage(driver);
	
	    //Login to application
    	loginPage.loginToProductPage("standard_user", "secret_sauce");
	
	    // go the next page
    	productPage = new ProductPage(driver);
	
	    //Verify the number of products on product page
	    Assert.assertEquals(productPage.getNumberOfProducts(), 6);

    }
    
    @AfterTest
    public void clean(){
    
    	driver.close();
    }
}
