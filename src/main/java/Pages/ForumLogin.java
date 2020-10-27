package Pages;

import Lesson10.Common;
import org.openqa.selenium.By;

public class ForumLogin extends Common {

    private By userName = By.cssSelector("input[id = 'input-userName']");
    private By userPassword = By.cssSelector("input[id = 'input-password']");
    private By submitButton = By.cssSelector("input[class* = 'btn-primary']");
    private By loginButton = By.cssSelector("input[class* = 'btn-login']");

    public void goToLogin () {
        driver.findElement(loginButton).click();
    }

    public void login (String username, String password) {
    driver.findElement(userName).sendKeys(username);
    driver.findElement(userPassword).sendKeys(password);
  }
    public void pressSubmitButton () {
        driver.findElement(submitButton).click();
    }

}
