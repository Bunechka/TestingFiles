package Lesson10;

import Pages.ForumLogin;
import Pages.ForumProfileChange;
import org.junit.Assert;

public class ForumProfileAmendment{

    public static void main(String[] args) {
        ForumLogin page = new ForumLogin();
        page.startPage("https://www.forumcinemas.lv/");
        page.goToLogin();
        page.sleep(1);
        page.login("bunechka@inbox.lv", "TestingForum");
        page.sleep(1);
        page.pressSubmitButton();
        page.sleep(1);

        ForumProfileChange profile = new ForumProfileChange();
        profile.goToProfile();
        profile.sleep(5);
        profile.gotToProfileEdit();
        profile.sleep(5);
        profile.changeName("LenaChanged");
        profile.saveProfile();
        profile.sleep(5);

        Assert.assertEquals("LenaChanged", profile.getProfileName());
    }
}
