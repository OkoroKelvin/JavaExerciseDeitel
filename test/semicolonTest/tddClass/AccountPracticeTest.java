package semicolonTest.tddClass;
import semicolon.tddClass.AccountPractice;

import java.util.Scanner;

public class AccountPracticeTest {
    public static void main(String[] args) {
        AccountPractice ourAccount2 = new AccountPractice("Jane Green", 50.00);
        AccountPractice ourAccount3 = new AccountPractice("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n", ourAccount2.getName(), ourAccount2.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", ourAccount2.getName(), ourAccount2.getBalance());


        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to ourAccount2 balance %n%n", depositAmount );
        ourAccount2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", ourAccount2.getName(),ourAccount2.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", ourAccount3.getName(),ourAccount3.getBalance());

        System.out.print("Enter deposit amount for account2 balance");
        depositAmount = input.nextDouble();
        System.out.printf("nadding %.2f to account2 balance%n%n", depositAmount);
        ourAccount2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", ourAccount2.getName(), ourAccount2.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",ourAccount2.getName(),ourAccount2.getBalance());

    }

}
