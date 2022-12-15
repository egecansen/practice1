package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import utilities.Utilities;

import java.util.List;

public class FormsPage extends Utilities {

    @FindBy (css = "[class='practice-form-wrapper']")
    WebElement practiceForm;

    @FindBy (css = "[for*='gender-radio']")
    List<WebElement> genderButtons;

    @FindBy (id = "dateOfBirthInput")
    WebElement datePicker;

    @FindBy (css = "[class='react-datepicker__month-select'] option")
    List<WebElement> months;

    @FindBy (css = "[class=\"react-datepicker__month-select\"]")
    WebElement monthPicker;

    @FindBy (css = "[class='react-datepicker__year-select'] option")
    List<WebElement> years;
    @FindBy (css = "[class='react-datepicker__year-select']")
    WebElement yearPicker;

    public void clickBox(String gender) {
        genderSelect(gender).click();
    }

    public WebElement firstName(){
        return practiceForm.findElement(By.id("firstName"));
    }
    public WebElement lastName(){
        return practiceForm.findElement(By.id("lastName"));
    }
    public WebElement eMail() {
        return practiceForm.findElement(By.id("userEmail"));
    }
    public WebElement genderSelect(String genderName) {
        for (WebElement genderButton : genderButtons) {
            if (genderButton.getText().equals(genderName)) return genderButton;
        }
        throw new RuntimeException("Gender Not Found");
    }
    public WebElement mobileNumber() {
        return practiceForm.findElement(By.id("userNumber"));
    }

    public void dateOfBirth(String day, String month, String yearText) {
        scroll(datePicker);
        datePicker.click();

        for (WebElement monthName : months)
            if (monthName.getText().equals(month))
                monthName.click();

        for (WebElement year : years)
            if (year.getText().equals(yearText))
                year.click();

        for (WebElement dayButton : new DatePicker().days)
            if (dayButton.getText().equals(day))
                dayButton.click();
    }

    public WebElement subject() {
        return practiceForm.findElement(By.cssSelector("[class=\"subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3\"]"));
    }
}
