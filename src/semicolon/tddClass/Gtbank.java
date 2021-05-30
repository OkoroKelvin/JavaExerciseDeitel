package semicolon.tddClass;

import java.util.Scanner;

public class Gtbank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1;
        while (num != 6) {
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "Enter 1 for deposit", "Enter 2 for withdraw", "Enter 3 to view all account", "Enter 4 to transfer", "Enter 5 to view your details", "Enter 6 to exit", "Enter 7 to logout");
            System.out.println("Enter Number to access functions between 1 to 7, press 6 to exit: ");
            num = input.nextInt();
            if (num == 1) {
                System.out.println("depositing");
            } else if (num == 2) {
                System.out.println("withdraw");
            } else if (num == 3) {
                System.out.println("view all account");
            } else if (num == 4) {
                System.out.println("Transfer to any account");
            } else if (num == 5) {
                System.out.println("view your details");
            } else if (num == 7) {
                System.out.println("logout");
            }
        }
        System.out.println("Exit");
    }
}


