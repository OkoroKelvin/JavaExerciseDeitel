package semicolon.bankApplication;

public class Staff {

    public int pinCode;
    private String userName;

    public Staff(String uName, int password) {
        userName = uName;
        pinCode  = password;
    }


    public static void staffMenu() {


        String format = """
                press from number 1 to 3 to proceed

                1.View Bank Accounts
                2.Delete Bank Accounts
                3.Log Out..
                """;

        System.out.println(format);
    }

    public void setPassWordForStaff(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getPassWordForStaff() {

        return pinCode;
    }

    public void setStaffUserName(String uName) {
        userName = uName;
    }

    public String getStaffUserName() {
        return userName;
    }

    public void viewAccounts() {
        System.out.println("These are the");
        for(int i=0; i<BankWinner.getCustomersList().size(); i++){
            Customer customer = BankWinner.getCustomersList().get(i);

            String firstName = customer.getFirstName();
            String lastName = customer.getLastName();
            String phoneNumber = customer.getPhoneNumber();
            int accountNumber = customer.getAccountNumber();
            double balance = customer.getBalance();

            System.out.println("Account Name: " );
        }
        //System.out.println(BankWinner.customersList);
    }































//        for(Customer cust :BankWinner.customersList){
//            String fstName = cust.getFirstName();
//            String lstName = cust.getLastName();
//            String phone = cust.getPhoneNumber();
//            ProjectAccount acc = new ProjectAccount();
//            System.out.println("Acc Name = "+fstName+" "+lstName);
//            System.out.println("Phone Number = "+phone);
//            System.out.println("________________________________");
//        }
//    }
}

