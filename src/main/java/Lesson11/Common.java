package Lesson11;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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

        Map prefs = new HashMap();
        prefs.put("profile.default_content_settings.cookies",2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

    }

    public void stopDriver() {
        driver.quit();
    }
}
