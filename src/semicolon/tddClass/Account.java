package semicolon.tddClass;

public class Account {

    private double myAccountBalance = 1000.0;
    private int pin;
    private String name;

    public Account(String name) {
        this.name = name;
        pin = 1999;
    }

    public Account() {
        pin = 1999;


    }

    public static String getAccountDetails(Account accountInfo) {
        return accountInfo.getName() + " Balance is: " + accountInfo.getAccountBalance();
    }

    private String getName() {
        return name;
    }

    public void deposit(double amountToDeposit) {
        if (amountToDeposit > 0) {
            myAccountBalance = myAccountBalance + amountToDeposit;
        }
    }

    public double getAccountBalance() {

        return myAccountBalance;
    }

    public double withdraw(int pin, int money) {
        if (money > 0) {
            if (myAccountBalance > money && myAccountBalance >= 1000 && this.pin == pin) {
                double balance = myAccountBalance - money;
                myAccountBalance = balance;
                return myAccountBalance;
            } else {
                return myAccountBalance;
            }
        }
        return myAccountBalance;
    }

    public void updatePin(int pinUpdate) {
        this.pin = pinUpdate;
    }

    public int getUpdatedPin() {
        return pin;
    }

}