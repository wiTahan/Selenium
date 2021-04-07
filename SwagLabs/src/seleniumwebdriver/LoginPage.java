package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
    By userName = By.id("user-name");
    By passWord = By.id("password");
    By loginBtn = By.name("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Set user name in textbox
    public void setUserName(String strUserName){
        driver.findElement(userName).sendKeys(strUserName);
    }

    //Set password in password textbox
    public void setPassword(String strPassword){
         driver.findElement(passWord).sendKeys(strPassword);
    }

    //Click on login button
    public void clickLogin(){
            driver.findElement(loginBtn).click();
    }

    /**

     * This POM method will be exposed in test case to login in the application
     * @param strUserName
     * @param strPasword
     * @return

     */

    public void loginToProductPage(String strUserName,String strPasword){
    	
        //Fill user name
        this.setUserName(strUserName);

        //Fill password
        this.setPassword(strPasword);

        //Click Login button
        this.clickLogin();        
    }
}
