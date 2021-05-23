package africa.semicolon.ecomercetest;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String customerAddress;
    private int telephone;
    private int password;

    public void setFirstName(String fName) {
        firstName=fName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lName) {
        lastName=lName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmailAddress(String mailAddress) {
        email= mailAddress;
    }

    public String getEmailAddress() {
        return email;
    }

    public void setCustomerAddress(String address) {
        customerAddress=address;

    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerTelephoneNumber(int phoneNumber) {
        telephone = phoneNumber;
    }

    public int getCustomerTelephoneNumber() {
        return telephone;
    }

    public void setLoginPassword(int pass) {
        password=pass;

    }

    public int getLoginPassword() {
        return password;
    }
}
