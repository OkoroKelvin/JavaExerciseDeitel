package chapter15;


public class Account15 {
    private String lastName;
    private double balance;
    private int accountNumber;
    private  String firstName;

    public Account15(String firstName, String lastName, double balance, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }


    public void combine(TransactionRecord record){
        this.balance += record.getAmount();
    }
}
