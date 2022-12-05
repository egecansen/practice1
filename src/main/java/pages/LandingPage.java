package pages;


import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

import java.util.List;

public class LandingPage {
    @FindBy(css = "[class='card mt-4 top-card']")
    List<WebElement> categories;

    public LandingPage(){
        PageFactory.initElements(Driver.driver, LandingPage.class);
    }

    public void clickCard(String label){
        getCard(label).click();
    }

    public WebElement getCard(String label){
        for (WebElement card : categories) if (card.getText().equals(label)) return card;
        throw new RuntimeException("Card not found");
    }
}
