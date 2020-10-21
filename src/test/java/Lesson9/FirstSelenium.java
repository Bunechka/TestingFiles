package Lesson9;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

    @Test
    public void firstSelenium() {

        String  driverPath = "/Users/Leka/IdeaProjects/GraddleTest/src/main/resources/";
        System.setProperty("webdriver.chrome.driver",  driverPath + "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ss.com/");
        driver.findElement(By.id("mtd_300")).click();
        driver.findElement(By.id("f_o_1276_min")).sendKeys("3");
        driver.findElement(By.id("f_o_8_max")).sendKeys("25");
        driver.findElement(By.cssSelector("input[class = 'b s12']")).click();
        driver.findElement(By.xpath("//input[@class = 'b s12]")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
