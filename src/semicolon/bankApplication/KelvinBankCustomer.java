package semicolon.bankApplication;

public class KelvinBankCustomer {
    private KelvinBankAccount account = new KelvinBankAccount();
    private String firstName;
    private String lastName;
    private String UserName;
    private String phoneNumber;
    private int password;


    private boolean isLogin;

    public KelvinBankCustomer(){

    }
    public KelvinBankCustomer(String firstName, String lastName, String UserName, String phoneNumber, int password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.UserName = UserName;
    }

    public KelvinBankCustomer(String firstName, String lastName, String phoneNumber, KelvinBankAccount account, int password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.account = account;
        this.password = password;
    }



    public KelvinBankAccount getAccount() {
        return account;
    }

    public void setAccount(KelvinBankAccount account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public KelvinBankCustomer(String lastName, String firstName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public void transfer(double amountToTransfer,KelvinBankAccount secondAccount) {
        account.withdraw(amountToTransfer);
        secondAccount.deposit(amountToTransfer);
    }

    @Override
    public String toString() {
        System.out.println("--------------------------------------------------------------------------------------");
        return "First Name-> " + firstName + "  Last Name-> "+ lastName + "  Account Number-> " + account.getAccountNumber() + "  Phone Number-> " + phoneNumber;


    }

    public void deposit(double amountToDeposit) {
        account.deposit(amountToDeposit);
    }

    public double getBalance() {
        return account.getAccountBalance();
    }

    public void withdraw(double amountToWithdraw) {
        account.withdraw(amountToWithdraw);
    }

    public int getAccountNumber() {
        int accountNumber= account.getAccountNumber();
        return accountNumber;
    }
}

