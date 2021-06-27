package semicolon.bankApplication;

import java.util.Scanner;

public class ProjectAccount {
    Scanner input = new Scanner(System.in);

    private double myAccountBalance = 0.0;
    private static int accountNumberProvider = 0;
    private final int accountNumber;

    public ProjectAccount() {
        accountNumberProvider++;
        accountNumber = accountNumberProvider;
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

    @Override
    public String toString() {
        return "ProjectAccount{" +
                "myAccountBalance=" + myAccountBalance +
                ", accountNumber=" + accountNumber +
                '}';
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
}
