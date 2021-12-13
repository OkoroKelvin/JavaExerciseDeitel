package semicolon.bankApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class KelvinBank {

    public static ArrayList<KelvinBankCustomer> customersList = new ArrayList<>();
    private static KelvinBankCustomer kelvinBankCustomer;

    KelvinBankStaffsDataBase kelvinBankStaffsDataBase = new KelvinBankStaffsDataBase();

    public static void main(String[] args) {
        actionButton();
    }

    public static void actionButton(){
        Scanner input = new Scanner(System.in);
        KelvinBank bank = new KelvinBank();
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

//    public static ArrayList<KelvinBankCustomer> createCustomers(KelvinBankCustomer customer1) {
//        kelvinBankCustomer = customer1;
//        for(KelvinBankCustomer kelvinBankCustomer : customersList){
//            if(kelvinBankCustomer.getAccountNumber()==kelvinBankCustomer.getAccountNumber())throw new NullPointerException(
//                    "This Account already Exist"
//            );
//        }
//        customersList.add(kelvinBankCustomer);
//        return customersList;
//    }

    // public static ArrayList<KelvinBankCustomer> getCustomersList() {
      //  return customersList;
    //}

    public  void registerStaff(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter kelvinBankStaff username");
        String username = input.next();
        System.out.println("Kindly Enter password");
        int password = input.nextInt();
        kelvinBankStaffsDataBase.registerStaff(username, password);
        actionButton();
    }

    public static void staffLogin(){
        KelvinBankStaffsDataBase kelvinBankStaffsDataBase = new KelvinBankStaffsDataBase();
        System.out.println("Enter kelvinBankStaff username");
        Scanner input = new Scanner(System.in);
        String username = input.next();
        System.out.println("Kindly Enter password");
        int password = input.nextInt();
        kelvinBankStaffsDataBase.loginStaff(username,password);

    }

    public void viewStaffs(){
        System.out.println(kelvinBankStaffsDataBase.allStaffs().size());
    }
}
