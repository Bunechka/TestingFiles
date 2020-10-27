package Lesson10;

import Pages.CarsPage;
import Pages.DogsPage;
import Pages.HomePage;

public class MyFirstTest {

    public static void main(String[] args) {
        HomePage page = new HomePage();
        DogsPage dogs = new DogsPage();
        CarsPage cars = new CarsPage();

        page.startPage("https://www.ss.com");
        //page.chooseDogsType();
        //dogs.setAge("2","7");

        page.chooseCarType();
        cars.setPrice("6000", "10000");
        cars.selectMinYear("2001");
        cars.selectCarColor("6318");
        cars.selectEngine("3.0");
        cars.pressSearchButton();
    }
}
