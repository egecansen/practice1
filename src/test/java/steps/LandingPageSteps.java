package steps;

import io.cucumber.java.en.Given;
import pages.LandingPage;

public class LandingPageSteps {

    LandingPage landingPage = new LandingPage();

    @Given("Click {} card")
    public void clickCard(String label) {
        landingPage.clickCard(label);
    }
}
