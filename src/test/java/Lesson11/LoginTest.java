package Lesson11;

import Lesson11.Models.UserModel;
import Lesson11.Pages.HomePage;
import Lesson11.Pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;


public class LoginTest {

    @Test
    public void positiveLoginTest() {
        Common common = new Common();
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        UserModel userModel = new UserModel();
        userModel.setUsername("Testing@inbox.lv");
        userModel.setPassword("TestingProfile");

        common.startPage("https://www.janisroze.lv");

        homePage.openLoginPage();

        homePage.sleep(3);

        loginPage.loginToProfile(userModel.getUsername(), userModel.getPassword());

        //loginPage.loginToProfile(); //validation of the login as such, disregarding user details. For this make Before with announced user and method

        homePage.sleep(10);

        Assert.assertEquals("Lena Testing", loginPage.getProfileName());
        common.stopDriver();
    }

    @Test
    public void negativeLoginTest() {
        Common common = new Common();
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        UserModel userModel = new UserModel();
        userModel.setUsername("TestingNegative@inbox.lv");
        userModel.setPassword("TestingProfile");

        common.startPage("https://www.janisroze.lv");

        homePage.openLoginPage();
        homePage.sleep(3);

        loginPage.loginToProfile(userModel.getUsername(), userModel.getPassword());

        homePage.sleep(10);

        loginPage.validateErrorMessage("Nepareiza e-pasta adrese vai parole.");

        common.stopDriver();
    }

    @Test
     public void loginWithSocialMedia () {
        Common common = new Common();
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        UserModel userModel = new UserModel();
        userModel.setUsername("Testing@inbox.lv");
        userModel.setPassword("TestingProfile");

        common.startPage("https://www.janisroze.lv");
        homePage.openLoginPage();
        homePage.sleep(3);
        loginPage.openSocialMedia();
        loginPage.popUpWindow();
        homePage.sleep(10);

    }
}
