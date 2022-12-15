package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Utilities;

import java.util.List;

public class DatePicker extends Utilities {

    @FindBy (css = ".react-datepicker__month [role='option']")
    public List<WebElement> days;



}
