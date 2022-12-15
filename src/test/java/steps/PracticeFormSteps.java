package steps;

import io.cucumber.java.en.Given;
import pages.FormsPage;

public class PracticeFormSteps {

    FormsPage practiceForm = new FormsPage();

    @Given("First Name: {}")
    public void submitFirstName(String firstName) {
        practiceForm.firstName().sendKeys(firstName);
    }
    @Given("Last Name: {}")
    public void submitLastName(String lastName) {
        practiceForm.lastName().sendKeys(lastName);
    }

    @Given("Email: {}")
    public void submitEmail(String eMail) {
        practiceForm.eMail().sendKeys(eMail);
    }
    @Given("Gender: {}")
    public void submitGender(String gender) {
        practiceForm.clickBox(gender);
    }

    @Given("Mobile Number: {}")
    public void submitMobileNumber(String mobileNumber) {
        practiceForm.mobileNumber().sendKeys(mobileNumber);
    }
    @Given("Day: {} Month: {} Year: {}")
    public void datePicker(String day, String month, String year){
        practiceForm.dateOfBirth(day, month, year);
    }
    @Given("Subject: {}")
    public void submitSubject(String subject) {
        practiceForm.subject().sendKeys(subject);
    }
}