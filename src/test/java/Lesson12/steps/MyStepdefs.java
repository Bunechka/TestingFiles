package Lesson12.steps;

import Pages.CarsPage;
import Pages.DogsPage;
import Pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    HomePage page = new HomePage();
    DogsPage dogs = new DogsPage();
    CarsPage cars = new CarsPage();


    @Given("Open Chrome browser")
    public void OpenBrowser() {
    }

    @When("^I open (.*)$")
    public void iOpenHttpsWwwSsCom(String url) {
        page.startPage(url);
    }

    @Then("Open dogs category")
    public void openDogsCategory() {
        page.chooseDogsType();
    }

    @Given("open Chrome browser")
    public void openChromeBrowser() {
    }

    @Then("Open cars category")
    public void openCarsCategory() {
        page.chooseCarType();
    }

    @Then("^I choose min year (.*)$")
    public void iChooseMinYear(String year) {
        cars.selectMinYear(year);
    }

    @And("^I choose max engine (.*)$")
    public void iChooseMaxEngine (String engine) {
        cars.selectEngine(engine);
    }

    @And("^I choose color (.*)$")
    public void iChooseColorBalta (String color) {
        cars.selectCarColor("6318");
    }
}
