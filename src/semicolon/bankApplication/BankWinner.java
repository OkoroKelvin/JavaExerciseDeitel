package semicolon.bankApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class BankWinner {
    public static ArrayList<Customer> customersList = new ArrayList<>();
    private static Customer customer;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("######### WELCOME TO BANK WINNER ############");

        String prompt = """

                Press any of number to access

                1.  Staff login
                2.  Customer
                3.  Exit

                """;
        System.out.println(prompt);

        int userInput = input.nextInt();

        switch (userInput) {

//            case 1:
//                staffMenu();
//                break;
//            case 2:
//                viewAccounts();
//                break;
//            case 3:
//                deleteBankAccounts();
//                break;

        }

    }

    public static ArrayList<Customer> createCustomers(Customer customer1) {
        customer = customer1;
        for(Customer customer : customersList){
            if(customer.getAccountNumber()==customer.getAccountNumber())throw new NullPointerException(
                    "This Account already Exist"
            );
        }
        customersList.add(customer);
        return customersList;
    }

    public static ArrayList<Customer> getCustomersList() {
        return customersList;
    }
}
