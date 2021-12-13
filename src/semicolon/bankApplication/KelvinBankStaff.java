package semicolon.bankApplication;

public class KelvinBankStaff {

    public int pinCode;
    private String userName;
    private boolean isLogin;

    public KelvinBankStaff(String uName, int password) {
        userName = uName;
        pinCode = password;
    }
    public KelvinBankStaff(){}


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

    public void setIsLogin(boolean isLogin){
        this.isLogin = isLogin;
    }
    public boolean getIsLogin(){return this.isLogin;};

//    public void viewAccounts() {
//        System.out.println("These are the");
//        for (int i = 0; i < KelvinBank.getCustomersList().size(); i++) {
//            KelvinBankCustomer customer = KelvinBank.getCustomersList().get(i);
//
//            String firstName = customer.getFirstName();
//            String lastName = customer.getLastName();
//            String phoneNumber = customer.getPhoneNumber();
//
//
//            System.out.println("Account Name: " + firstName + " " + lastName);
//            System.out.println("Phone Number: " + phoneNumber);
//
//        }
//
//
//    }
//    public void deleteAccount(String phoneNumber) {
//      for (int i = 0; 1 < KelvinBank.getCustomersList().size();i++){
//          KelvinBankCustomer customer = KelvinBank.getCustomersList().get(i);
//          if(customer.getPhoneNumber().equals(phoneNumber)){
//              KelvinBank.getCustomersList().remove(customer);
//          }
//
//    }
//}

//        for(KelvinBankCustomer cust :KelvinBank.customersList){
//            String fstName = cust.getFirstName();
//            String lstName = cust.getLastName();
//            String phone = cust.getPhoneNumber();
//            KelvinBankAccount acc = new KelvinBankAccount();
//            System.out.println("Acc Name = "+fstName+" "+lstName);
//            System.out.println("Phone Number = "+phone);
//            System.out.println("________________________________");
//        }
//    }
}

