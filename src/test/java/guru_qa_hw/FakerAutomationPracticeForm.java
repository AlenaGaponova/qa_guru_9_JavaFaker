package guru_qa_hw;

import org.junit.jupiter.api.Test;

public class FakerAutomationPracticeForm extends Base {


    @Test
    void automationPracticeForm() {

        registrationPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.email)
                .setNumber(testData.phone)
                .setAddress(testData.address)
                .setGender(testData.gender)
                .setSubjects(testData.subjects)
                .setHobbies(testData.hobbies)
                .setBirthDate(testData.birthDay, testData.birthMonth, testData.birthYear)
                .setPicture(testData.picture)
                .setState(testData.state)
                .setCity(testData.city)
                .clickSubmitButton();

        registrationPage.verifyResultsModal()
                .verifyResult("Student Name", testData.firstName + " " + testData.lastName)
                .verifyResult("Student Email", testData.email)
                .verifyResult("Gender", testData.gender)
                .verifyResult("Mobile", testData.phone)
                .verifyResult("Date of Birth", testData.birthDay + " " + testData.birthMonth + "," + testData.birthYear)
                .verifyResult("Subjects", testData.subjects)
                .verifyResult("Hobbies", testData.hobbies)
                .verifyResult("Picture", testData.picture)
                .verifyResult("Address", testData.address)
                .verifyResult("State and City", testData.state + " " +testData.city);

    }
}
