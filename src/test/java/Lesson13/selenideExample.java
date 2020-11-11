package Lesson13;


import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class selenideExample {

    @Test
    public void firstTest() {
        Configuration.baseUrl = "https://www.ss.com";
        Configuration.holdBrowserOpen = true;
        Configuration.startMaximized = true;

        open("/lv/animals/dogs");
        dogsPage dogs = new dogsPage();
        dogs.setDogAge("2", "4");

    }
}
