package Pages;

import Lesson10.Common;
import org.openqa.selenium.By;

public class DogsPage extends Common {

    private By dogsAgeMin = By.id("f_o_1276_min");
    private By dogsAgeMax = By.id("f_o_1276_max");

    public void setAge (String min, String max) {
        driver.findElement(dogsAgeMin).sendKeys(min);
        driver.findElement(dogsAgeMax).sendKeys(max);
    }
}
