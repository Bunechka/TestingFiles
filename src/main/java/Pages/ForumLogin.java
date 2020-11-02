package Pages;

import Lesson10.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ForumLogin extends Common {

    private By btnLogin = By.cssSelector(".btn.btn-login");
    private By userName = By.cssSelector("input[name=userName]");
    private By userPassword = By.cssSelector("input[name=password]");
    private By submitButton = By.cssSelector(".btn.btn-lg");

    public void goToLogin() {
        List<WebElement> elements = driver.findElements(btnLogin);
        for (WebElement element : elements) {
            if(element.isDisplayed()){
                element.click();
                return;
            }
        }
        System.out.println("unable to find any visible element");
    }

    public void login(String username, String password) {
        driver.findElement(userName).sendKeys(username);
        driver.findElement(userPassword).sendKeys(password);
    }

    public void pressSubmitButton() {
        driver.findElement(submitButton).click();
    }

}
