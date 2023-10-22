package SuitePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base {
    // Web Elements in Login Page
    By usernameLocator = By.id("user-name");
    By passLocator = By.id("password");
    By loginButton = By.id("login-button");
    // Assert to log in : https://www.saucedemo.com/inventory.html

    // Auto-generated constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Actions to perform in this page
    public void login () {
        type("standard_user", usernameLocator);
        type("secret_sauce", passLocator);
        click(loginButton);
    }

    public String loginAssertion (){
        return getCurrentURL();
    }
}
