package Lesson10;

import Pages.ForumLogin;

public class ForumTest {
    public static void main(String[] args) {
        ForumLogin page = new ForumLogin();
        page.startPage("https://www.forumcinemas.lv/");
        page.goToLogin();
        page.sleep(1);
        page.login("bunechka@inbox.lv", "TestingForum");
        page.sleep(1);
        page.pressSubmitButton();
        page.sleep(1);
    }
}
