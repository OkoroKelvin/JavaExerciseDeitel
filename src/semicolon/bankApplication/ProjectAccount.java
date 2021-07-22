package semicolon.bankApplication;

import java.util.Scanner;

public class ProjectAccount {
    Scanner input = new Scanner(System.in);
    private String accountName;
    private double myAccountBalance = 0.0;
    private static int accountNumberProvider = 0;
    private final int accountNumber;

    public ProjectAccount(String accountName) {
        accountNumberProvider++;
        accountNumber = accountNumberProvider;
        this.accountName = accountName;
    }


    public void deposit(double amountToDeposit) {
        if (amountToDeposit > 0)
            myAccountBalance = myAccountBalance + amountToDeposit;
    }

    public double getAccountBalance() {
        return myAccountBalance;
    }

    public double withdraw(double money) {
        if (money > 0 && money <= myAccountBalance) {
                myAccountBalance = myAccountBalance - money;
            } else {
                System.out.println("invalid withdrawAmount");;
            }
        return myAccountBalance;
    }

    public void transfer(int amountToTransfer, ProjectAccount nameOfAccount) {
        if (amountToTransfer >= 0.00) {
            if (amountToTransfer < myAccountBalance) {
                myAccountBalance -= amountToTransfer;
                nameOfAccount.deposit(amountToTransfer);
            } else {
                System.out.println("Account balance is low");
            }
        } else {
            System.out.println("Kindly enter valid amount");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName(){
        return this.accountName;
    }

    public void setAccountName(String name){
        this.accountName =name;
    }
}
