package DaddiesBoardShop.Model;

public class MyRegisteredCustomer extends Customer {

    private String firstName = "Aliaksei";
    private String lastName = "Yarmalchuk";
    private String emailAddress = "aliakseiyarmalchuk@gmail.com";
    private String password = "zoo170888";

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
