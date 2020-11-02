package Pages;

import Lesson10.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class ForumProfileChange extends Common {
    private final By btnProfile = By.xpath("//*[@id=\"main-header\"]/div/div[3]/div/div[2]/ul/li/a");
    private final By btnSaveProfile = By.xpath("//*[@id=\"layout-left\"]/div/div/div/form/button");
    private final By btnEditProfile = By.linkText("Labot savus datus");
    private final By inputName = By.name("firstName");

    public void goToProfile() {
        List<WebElement> elements = driver.findElements(btnProfile);
        for (WebElement element : elements) {
            if(element.isDisplayed()){
                element.click();
                return;
            }
        }
        System.out.println("unable to find any visible profile button");
    }
    public void gotToProfileEdit() {
        List<WebElement> elements = driver.findElements(btnEditProfile);
        for (WebElement element : elements) {
            if(element.isDisplayed()){
                element.click();
                return;
            }
        }
        System.out.println("unable to find any visible profile edit button");
    }
    public void changeName(final String name) {
        List<WebElement> elements = driver.findElements(inputName);
        for (WebElement element : elements) {
            if(element.isDisplayed()){
                element.clear();
                element.sendKeys(name);
                return;
            }
        }
        System.out.println("unable to find any visible name fields");
    }

    public void saveProfile() {
        List<WebElement> elements = driver.findElements(btnSaveProfile);
        for (WebElement element : elements) {
            if(element.isDisplayed()){
                scrollTo(element);
                element.click();
                return;
            }
        }
        System.out.println("unable to find any visible submit button");
    }

    public String getProfileName() {
        return driver.findElement(inputName).getAttribute("value");
    }
}
