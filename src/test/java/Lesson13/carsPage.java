package Lesson13;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class carsPage {

    public void setCarPrice (String min, String max) {
        $(By.id("f_o_8_min")).setValue(min);
        $(By.id("f_o_8_max")).setValue(max);
    }

    public void selectYear (String min) {
        $(By.id("f_o_18_min")).selectOptionByValue(min);
    }

    public void selectEngine (String min) {
        $(By.id("f_o_15_min")).selectOptionByValue(min);
    }

    public void selectColor (String color) {
        $(By.id("f_o_17")).selectOptionByValue(color);
    }

    public void pressSubmit() {
        $(By.cssSelector("input[class = 'b s12']")).click();
    }
}
