package semicolon.bankApplication;

public class ProjectAccount {
    private double myAccountBalance = 1000.0;


    public void deposit(double amountToDeposit) {
       if(amountToDeposit >0)
        myAccountBalance = myAccountBalance + amountToDeposit;

    }

    public double getAccountBalance() {
        return myAccountBalance;
    }

    public double withdraw(int money) {
        if(money > 0){
            if (myAccountBalance> money && myAccountBalance>=1000){
                double balance = myAccountBalance - money;
                myAccountBalance = balance;
            }else {
                return myAccountBalance;
            }
        }
        return myAccountBalance;
    }
}
