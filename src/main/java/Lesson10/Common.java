package Lesson10;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {

    public static WebDriver driver;

    public void startPage (String url) {

            String  driverPath = "/Users/Leka/IdeaProjects/GraddleTest/src/main/resources/";
            System.setProperty("webdriver.chrome.driver",  driverPath + "chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);
    }

    protected void scrollTo(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void sleep(int x){
        try {
            Thread.sleep(1000 * x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stopDriver() {
        driver.quit();
    }
}
