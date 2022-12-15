package utilities;

import driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public abstract class Utilities {

    public Utilities(){
        PageFactory.initElements(Driver.driver, this);
    }
    public void scroll (WebElement x){
        ((JavascriptExecutor) Driver.driver).executeScript("arguments[0].scrollIntoView(true);", x);
    }


}
