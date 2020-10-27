package Pages;

import Lesson10.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CarsPage extends Common {

    private By carPriceMin = By.id("f_o_8_min");
    private By carPriceMax = By.id("f_o_8_max");
    private By minYear = By.id("f_o_18_min");
    private By carColor = By.id("f_o_17");
    private By engineVolume = By.id("f_o_34");
    private By submitButton = By.cssSelector("input[value = 'Meklēt']");

    public void setPrice (String min, String max) {
        driver.findElement(carPriceMin).sendKeys(min);
        driver.findElement(carPriceMax).sendKeys(max);
    }

    public void selectMinYear (String year) {
        Select minYearSelector = new Select(driver.findElement(minYear));
        minYearSelector.selectByValue(year);
    }

    public void selectCarColor (String color) {
        Select carColorSelector = new Select(driver.findElement(carColor));
        carColorSelector.selectByValue(color);
    }

    public void selectEngine (String engine){
        Select engineSelector = new Select(driver.findElement(engineVolume));
        engineSelector.selectByValue(engine);
    }

    public void pressSearchButton () {
        driver.findElement(submitButton).click();
    }

}
