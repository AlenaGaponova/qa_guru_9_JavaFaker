package guru_qa_hw;

import com.github.javafaker.Faker;

import static utils.RandomUtils.randomString;

public class TestData {

    Faker faker = new Faker();

    String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            address = faker.address().secondaryAddress();

    String
            phone = randomString(10),
            gender = "Male",
            subjects = "Physics",
            hobbies = "Music",
            birthDay = "10",
            birthMonth = "April",
            birthYear = "2000",
            picture = "33.jpg",
            state = "NCR",
            city = "Noida";
}
