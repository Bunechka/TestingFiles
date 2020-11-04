package Lesson11.Pages;

import Lesson11.Common;
import Lesson11.Models.UserModel;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPage extends Common {

    private By usernameElement = By.id("email");
    private By passwordElement = By.id("pass");
    private By submitButton = By.id("send2");
    private By profileName = By.xpath("//*[@id=\"root-wrapper\"]/div/div/div[2]/div[2]/div/div[3]/div/div[1]/div[2]/p[1]/strong");
    private By cookiesButton = By.xpath("/html/body/div[4]/div/div[2]/div/div[2]");

    private By loginErrorMessage = By.xpath("//*[@id=\"root-wrapper\"]/div/div/div[2]/div[2]/div/div[2]/div/ul/li/ul/li/span");
    private By socialMedia = By.xpath("//*[@id=\"facebook_login_button\"]/div/div/div[1]/a");

    private By fbAcceptCookies = By.xpath("//*[@id=\"u_0_j\"]");

    private By fbUsernameField = By.id("email_container");
    private By fbPasswordField = By.id("pass");
    private By fbLoginButton = By.xpath("//*[@id=\"loginbutton\"]");


    public void loginToProfile (String username, String password) {
        driver.findElement(usernameElement).sendKeys(username);
        driver.findElement(passwordElement).sendKeys(password);
        driver.findElement(submitButton).click();

    }

    public void acceptCookies () {
        driver.switchTo().activeElement();
        driver.findElement(cookiesButton).click();
        driver.switchTo().defaultContent();
    }

    public void loginWithFB () {
        UserModel model = new UserModel();
        driver.findElement(fbUsernameField).sendKeys(model.getUsername());
        driver.findElement(fbPasswordField).sendKeys(model.getPassword());
        driver.findElement(fbLoginButton).click();

    }
    public void loginToProfile () {
        UserModel model = new UserModel();
        driver.findElement(usernameElement).sendKeys(model.getUsername());
        driver.findElement(passwordElement).sendKeys(model.getPassword());
        driver.findElement(submitButton).click();

    }
    public String getProfileName () {
        return driver.findElement(profileName).getText();

    }

    public void openSocialMedia () {
        driver.findElement(socialMedia).click();
    }

    public void popUpWindow () {
        driver.switchTo().activeElement();
        driver.findElement(fbAcceptCookies).click();
        driver.switchTo().defaultContent();
    }

    public void validateErrorMessage (String message) {
        String messageText = driver.findElement(loginErrorMessage).getText();

        assertThat(messageText).isEqualTo(message);
    }
}
