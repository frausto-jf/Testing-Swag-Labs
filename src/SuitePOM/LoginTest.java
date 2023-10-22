package SuitePOM;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;
    LoginPage login_var;

    @BeforeTest
    public void setUp (){
        login_var = new LoginPage(driver);
        driver = login_var.getChromeDriver();
        login_var.getPage("https://www.saucedemo.com/");
    }
    @AfterTest
    public void tearDown (){
        driver.quit();
    }

    @Test
    public void login_test () {
        login_var.login();
        Assert.assertEquals(login_var.loginAssertion(), "https://www.saucedemo.com/inventory.html");
    }
}
