package Lesson9;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAliExpress {
    @Test
    public void firstSelenium() {

        String driverPath = "/Users/Leka/IdeaProjects/GraddleTest/src/main/resources/";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");
        driver.switchTo().frame("pc_1455_24317_20201014");
        driver.findElements(By.xpath("//img[@class = 'rax-image ']")).get(1).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.id("search-key")).sendKeys("Tatoo");
        driver.findElement(By.xpath("//input[@placeholder = 'min']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@placeholder = 'max']")).sendKeys("20");
        driver.findElement(By.xpath("//img[@class = 'ui-button narrow-go']")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
