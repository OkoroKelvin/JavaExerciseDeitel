package semicolon.bankApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class BankWinner {

    public static ArrayList<Customer> customersList = new ArrayList<>();
    private static Customer customer;

    Staffs staffs = new Staffs();

    public static void main(String[] args) {
        actionButton();
    }

    public static void actionButton(){
        Scanner input = new Scanner(System.in);
        BankWinner bank = new BankWinner();
        System.out.println("######### WELCOME TO BANK WINNER ############");

        String prompt = """

                Press any of number to access

                Staff
                1.  Staff register
                2.  Staff login
                3.  Staff View Customers
                4.  Staff delete a customer
                
                Customer
                5. register customer
                6. login customer
                7. receive money
                8. send money
                9.  Exit

                """;
        System.out.println(prompt);

        int userInput = input.nextInt();

        switch (userInput) {
            case 1:
                bank.registerStaff();
                break;
            case 2:
                bank.viewStaffs();
                break;

        }

    }

//    public static ArrayList<Customer> createCustomers(Customer customer1) {
//        customer = customer1;
//        for(Customer customer : customersList){
//            if(customer.getAccountNumber()==customer.getAccountNumber())throw new NullPointerException(
//                    "This Account already Exist"
//            );
//        }
//        customersList.add(customer);
//        return customersList;
//    }

    // public static ArrayList<Customer> getCustomersList() {
      //  return customersList;
    //}

    public  void registerStaff(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter staff username");
        String username = input.next();
        System.out.println("Kindly Enter password");
        int password = input.nextInt();
        staffs.registerStaff(username, password);
        actionButton();
    }

    public static void staffLogin(){
        Staffs staffs = new Staffs();
        System.out.println("Enter staff username");
        Scanner input = new Scanner(System.in);
        String username = input.next();
        System.out.println("Kindly Enter password");
        int password = input.nextInt();
        staffs.loginStaff(username,password);

    }

    public void viewStaffs(){
        System.out.println(staffs.allStaffs().size());
    }
}
