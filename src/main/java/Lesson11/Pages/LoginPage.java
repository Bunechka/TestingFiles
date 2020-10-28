package Lesson11.Pages;

import Lesson11.Common;
import Lesson11.Models.UserModel;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPage extends Common {

    private By usernameElement = By.id("email");
    private By passwordElement = By.id("pass");
    private By submitButton = By.id("send2");
    private By errorMessage = By.id("advice-validate-email-email");

    public void loginToProfile (String username, String password) {
        driver.findElement(usernameElement).sendKeys(username);
        driver.findElement(passwordElement).sendKeys(password);
        driver.findElement(submitButton).click();

    }
    public void loginToProfile () {
        UserModel model = new UserModel();
        driver.findElement(usernameElement).sendKeys(model.getUsername());
        driver.findElement(passwordElement).sendKeys(model.getPassword());

    }

    public void validateErrorMessage (String message) {
        String messageText = driver.findElement(errorMessage).getText();
        assertThat(messageText).isNotEqualTo(message);
    }
}
