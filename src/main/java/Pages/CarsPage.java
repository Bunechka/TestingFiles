package Pages;

import Lesson10.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CarsPage extends Common {

    private By carPriceMin = By.id("f_o_8_min");
    private By carPriceMax = By.id("f_o_8_max");
    private By minYear = By.id("f_o_18_min");

    public void setPrice (String min, String max) {
        driver.findElement(carPriceMin).sendKeys(min);
        driver.findElement(carPriceMax).sendKeys(max);
    }

    public void selectMinYear (String year) {
        Select minYearSelector = new Select(driver.findElement(minYear));
        minYearSelector.selectByValue(year);
    }

}
