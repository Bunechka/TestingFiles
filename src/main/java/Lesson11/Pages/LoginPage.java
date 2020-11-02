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
    private By profileName = By.xpath("//*[@id=\"root-wrapper\"]/div/div/div[2]/div[2]/div/div[3]/div/div[1]/div[2]/p[1]/strong");
    private By loginErrorMessage = By.xpath("//*[@id=\"root-wrapper\"]/div/div/div[2]/div[2]/div/div[2]/div/ul/li/ul/li/span");

    //public void loginToProfile (String username, String password) {
      //  driver.findElement(usernameElement).sendKeys(username);
        //driver.findElement(passwordElement).sendKeys(password);
        //driver.findElement(submitButton).click();}

    public void loginToProfile(String username, String password) {
        UserModel model = new UserModel();
        driver.findElement(usernameElement).sendKeys(model.getUsername());
        driver.findElement(passwordElement).sendKeys(model.getPassword());
        driver.findElement(submitButton).click();

    }
    public String getProfileName () {
        return driver.findElement(profileName).getText();

    }

    public void validateErrorMessage (String message) {
        String messageText = driver.findElement(loginErrorMessage).getText();
        assertThat(messageText).isEqualTo(message);
    }
}
