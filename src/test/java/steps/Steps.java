package steps;

import driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import pages.LandingPage;

public class Steps {

    LandingPage landingPage = new LandingPage();

    @Before
    public void before() {
        Driver.setup();
    }

    @After
    public void after() {
        Driver.quitDriver();
    }

    @Given("Navigate to {}")
    public void navigate(String url) {
        Driver.driver.get(url);
    }

    @Given("Click {} card")
    public void clickCard(String label) {
        landingPage.clickCard(label);
    }
}
