package Lesson10;

import org.openqa.selenium.WebDriver;
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
}
