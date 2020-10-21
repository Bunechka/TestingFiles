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
        page.chooseDogsType();
        dogs.setAge("2","7");
    }
}
