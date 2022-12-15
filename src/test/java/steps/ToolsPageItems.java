package steps;

import io.cucumber.java.en.Given;
import pages.ToolsPage;

public class ToolsPageItems {

    ToolsPage toolsPage = new ToolsPage();

    @Given("Click {} from the selected card menu")
    public void clickItem(String subItem) {
        toolsPage.clickSubItem(subItem);
    }
}
