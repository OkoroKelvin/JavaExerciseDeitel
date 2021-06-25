package semicolon.bankApplication;

import java.util.Scanner;

public class BankPhb {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        System.out.println("######### WELCOME TO BANK PHB ############");


        String prompt = """
                                
                Press any of number to access
                                
                1.  Staff Login
                2.  Customer
                3.  Exit
                                    
                """;

        switch (userInput){
            case 1:
                StaffLogin;
        }
    }
}