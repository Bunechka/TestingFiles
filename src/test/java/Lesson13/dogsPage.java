package Lesson13;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class dogsPage {

    public void setDogAge (String min, String max) {
        $(By.id("f_o_8_max")).setValue(max);
        $(By.id("f_o_8_min")).setValue(min);
    }
}
