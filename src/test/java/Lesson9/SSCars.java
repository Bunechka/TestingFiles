package Lesson9;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SSCars {
    @Test
    public void firstSelenium() {

        String driverPath = "/Users/Leka/IdeaProjects/GraddleTest/src/main/resources/";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ss.com/");
        driver.findElement(By.id("mtd_97")).click();
        driver.findElement(By.id("f_o_8_min")).sendKeys("6000");
        driver.findElement(By.id("f_o_8_max")).sendKeys("10000");
        Select minYear = new Select (driver.findElement(By.id("f_o_18_min")));
        minYear.selectByValue("2019");
        Select engineMax = new Select(driver.findElement(By.id("f_o_15_max")));
        engineMax.selectByValue("3.0");
        Select color = new Select(driver.findElement(By.id("f_o_17")));
        color.selectByValue("Balta");

        driver.findElement(By.cssSelector("input[class = 'b s12']")).click();
        //driver.findElement(By.xpath("//input[@class = 'b s12]")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}