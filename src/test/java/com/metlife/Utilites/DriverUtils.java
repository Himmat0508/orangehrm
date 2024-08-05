package com.metlife.Utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverInfo;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class DriverUtils {

    static WebDriver driver;
    static WebDriverWait wait;


    public static void Browserlounch(){


        switch (PropertiesUtils.getproperties("Browser")){

            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                ChromeOptions opt = new ChromeOptions();
                opt.addArguments("--disable-notifications");
                driver = new ChromeDriver(opt);
                break;


        }
driver.manage().window().maximize();
wait = new WebDriverWait(driver, Duration.ofSeconds(2));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    public static void close(){
driver.quit();
    }

public static void nevigate(String url){
        driver.get(url);
}

public static void type(By locator , String value){

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
}

public static void click(By locator) throws InterruptedException {
    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    Thread.sleep(3000);
    driver.findElement(locator).click();



}

}
