package US001_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TC001_ValidUserNPass {
    static WebDriver driver = new ChromeDriver();
    static WebElement element;
    static String index_url = "https://www.saucedemo.com/";
    static String inventory_url = "https://www.saucedemo.com/inventory.html";

    @BeforeTest
    // Get Sauce Demo Login web page
    public void get_webpage () {
        driver.get(index_url);
        driver.manage().window().maximize();
    }

    @Test (dataProvider = "login_credentials")
    public void login (String username, String pass){
        // Create an explicit wait (By default the polling time is 500ms)
        WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
        ewait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        // Find web elements and submit credentials
        element = driver.findElement(By.id("user-name"));
        element.sendKeys(username);
        element = driver.findElement(By.id("password"));
        element.sendKeys(pass);
        element = driver.findElement(By.id("login-button"));
        element.click();

        // Wait until an element under inventory is ready to be clickable
        ewait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")));
        // After the delay, get the current URL
        String txt =  driver.getCurrentUrl();
        // Compare actual URL and expected URL
        Assert.assertEquals(txt, inventory_url);
    }

    @AfterTest
    // Call quit method to destroy the chomedriver process after test
    public void end_test (){
        driver.quit();
    }

    // This method provide valid credentials to the login method
    @DataProvider (name = "login_credentials")
    public Object [][] dp(){
        Object[][] mdata = new Object[1][2];
        mdata[0][0] = "standard_user";
        mdata[0][1] = "secret_sauce";
        return mdata;
    }

}
