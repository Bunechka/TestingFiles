package Lesson10;

import Pages.ForumLogin;

public class ForumTest {
    public static void main(String[] args) {
        ForumLogin page = new ForumLogin();
        page.startPage("https://www.forumcinemas.lv/mypage/logon/?returnUrl=%252f");
        //page.goToLogin();
        page.login("bunechka@inbox.lv", "TestingForum");
        page.pressSubmitButton();
    }
}
