package Lesson11;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Common {

    public static WebDriver driver;

    public void startPage (String url) {

            String  driverPath = "/Users/Leka/IdeaProjects/GraddleTest/src/main/resources/";
            System.setProperty("webdriver.chrome.driver",  driverPath + "chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);


    }

    public void sleep(int x){
        try {
            Thread.sleep(1000 * x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void scrollTo(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void stopDriver() {
        driver.quit();
    }
}
