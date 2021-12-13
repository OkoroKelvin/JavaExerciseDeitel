package chapter15;

public class TransactionRecord {
    private int amount;
    private int accountNumber;

    public TransactionRecord(int accountNumber , int amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
