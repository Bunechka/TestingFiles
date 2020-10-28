package Lesson11;

import Lesson11.Models.UserModel;
import Lesson11.Pages.HomePage;
import Lesson11.Pages.LoginPage;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class LoginTest {

    private Object driver;

    @Test
    public void positiveLoginTest() {
        Common common = new Common();
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        UserModel userModel = new UserModel();

        common.startPage("https://www.janisroze.lv");

        homePage.openLoginPage();

        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-350)");

        try {
            Thread.sleep(1500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        loginPage.loginToProfile(userModel.getUsername(), userModel.getPassword());

        //loginPage.loginToProfile(); //validation of the login as such, disregarding user details. For this make Before with announced user and method

        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        //loginPage.validateErrorMessage("Dont want to log in to Janis Roze");
        common.stopDriver();
    }
}
