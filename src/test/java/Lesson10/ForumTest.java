package Lesson10;

import Pages.ForumLogin;

public class ForumTest {
    public static void main(String[] args) {
        ForumLogin page = new ForumLogin();
        page.startPage("https://www.forumcinemas.lv/");
        page.goToLogin();
        page.login("bunechka@inbox.lv", "TestingForum");
        page.pressSubmitButton();
    }
}
