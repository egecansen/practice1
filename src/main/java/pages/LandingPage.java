package pages;


import driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Utilities;

import java.util.List;

public class LandingPage extends Utilities {
    @FindBy(css = "[class='card mt-4 top-card']")
    List<WebElement> categories;

    public void clickCard(String label){
        scroll(getCard(label));
        getCard(label).click();
    }

    public WebElement getCard(String label){
        for (WebElement card : categories)
            if (card.getText().equals(label))
                return card;
        throw new RuntimeException("Card not found");
    }
}
