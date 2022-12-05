package steps;

import driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import pages.LandingPage;

import java.util.concurrent.TimeUnit;

public class Steps {


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

    @Given("Wait {} seconds")
    public void wait(int duration) {
        try {
            TimeUnit.SECONDS.sleep(duration);}
        catch (InterruptedException ignored){}
    }
}
