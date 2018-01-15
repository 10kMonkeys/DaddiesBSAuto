package DaddiesBoardShop.Model;

public class Customer {

    private String firstName;
    private String lastName;
    private String emailAddress = "kuduk@youzend.net";
    private String password = "qwerty1";

    public Customer() {
    }

    Customer(String firstName,
             String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public static Customer newEntity() {
        String firstName = "FirstName" + System.currentTimeMillis();
        String lastName = "LastName" + System.currentTimeMillis();

        return new Customer(firstName, lastName);
    }
}
