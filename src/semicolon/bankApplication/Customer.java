package semicolon.bankApplication;

public class Customer {


    private ProjectAccount account;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Customer(String firstName, String lastName, String phoneNumber, ProjectAccount account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.account = account;
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPhoneNumber(String pNumber) {
        phoneNumber = pNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void transfer(double amountToTransfer,ProjectAccount transferAccount) {
        account.withdraw(amountToTransfer);
        transferAccount.deposit(amountToTransfer);
    }

    public void deposit(int amountToDeposit) {
        account.deposit(amountToDeposit);
    }

    public double getBalance() {
        return account.getAccountBalance();
    }

    public void withdraw(double amountToWithdraw) {
        account.withdraw(amountToWithdraw);
    }
}
