package SuitePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {

    private WebDriver driver;

    public Base (WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getChromeDriver (){
        driver = new ChromeDriver();
        return driver;
    }

    public void getPage (String url){
        driver.get(url);
    }

    public void maximizeWindow(WebDriver driver){
        driver.manage().window().maximize();
    }

    public void type (String input_data, By locator){
        driver.findElement(locator).sendKeys(input_data);
    }

    public void click (By locator){
        driver.findElement(locator).click();
    }

    public String getCurrentURL (){
        return driver.getCurrentUrl();
    }

}
