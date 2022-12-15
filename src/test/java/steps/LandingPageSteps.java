package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LandingPage;

public class LandingPageSteps {

    LandingPage landingPage = new LandingPage();

    @Given("Click {} card")
    public void clickCard(String label) throws InterruptedException {
        landingPage.clickCard(label);
    }
}
