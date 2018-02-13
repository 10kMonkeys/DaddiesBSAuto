package DaddiesBoardShop.Model;

import DaddiesBoardShop.helper.UsersProperties;
import com.github.javafaker.Faker;

public class NewCustomer {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;

    public NewCustomer() {
        Faker fkr = new Faker();

        firstName = fkr.name().firstName();
        lastName = fkr.name().lastName();
        emailAddress = fkr.internet().emailAddress();
        password = fkr.number().digits(6);

        setDataToUsersProperities();
    }

    private void setDataToUsersProperities() {
        UsersProperties.INSTANCE.setProperty("NewUserFirstName", firstName);
        UsersProperties.INSTANCE.setProperty("NewUserLastName", lastName);
        UsersProperties.INSTANCE.setProperty("NewUserEmail", emailAddress);
        UsersProperties.INSTANCE.setProperty("NewUserPassword", password);
    }
}
