//package semicolon.bankApplication;
//
//import java.util.Scanner;
//
//import static semicolon.bankApplication.Staff.*;
//
//public class BankPhb {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("######### WELCOME TO BANK WINNER ############");
//
//        String prompt = """
//
//                Press any of number to access
//
//                1.  Staff login
//                2.  Customer
//                3.  Exit
//
//                """;
//        System.out.println(prompt);
//
//        int userInput = input.nextInt();
//
//        switch (userInput){
//
//            case 1:
//                staffMenu();
//                break;
//            case 2:
//                viewAccounts();
//                break;
//            case 3:
//                deleteBankAccounts();
//                break;
//
//        }
//
//    }
//}