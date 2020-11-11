package Lesson13;

import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.refresh;

public class selenideCars {

    @Test
    public void carTest () {
        Configuration.baseUrl = "https://www.ss.com";
        Configuration.holdBrowserOpen = true;
        Configuration.startMaximized = true;

        open("/lv/transport/cars");
        refresh();
        carsPage cars = new carsPage();
        cars.setCarPrice("6000", "10000");
        cars.selectYear("2001");
        cars.selectEngine("3.0");
        cars.selectColor("6318");
        cars.pressSubmit();

    }
}
