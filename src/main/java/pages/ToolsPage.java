package pages;

import driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Utilities;

import java.util.List;

public class ToolsPage extends Utilities {
    @FindBy(css = "[class='btn btn-light ']")
    List<WebElement> menuItems;

    public void clickSubItem(String subItem) {
        scroll(getSubItem(subItem));
        getSubItem(subItem).click();
    }

    public WebElement getSubItem(String subItem) {
        for (WebElement item : menuItems)
            if (item.getText().equals(subItem))
                return item;
        throw new RuntimeException("The menu item not found");
    }
}
