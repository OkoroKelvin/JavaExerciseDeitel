package semicolon.bankApplication;

import java.util.ArrayList;

public class Customers {
    ArrayList<Customer> bankCustomer = new ArrayList<>();

    public Customers(){

    }

    private Customer registerCustomer(String firstName, String lastName,String UserName,String phoneNumber,int password){
        Customer createCustomer = new Customer(firstName,lastName,UserName,phoneNumber,password);
        bankCustomer.add(createCustomer);
        return createCustomer;
    }
    private String loginCustomer(String UserName, int password){
        Customer loginCustomer = new Customer();
        for(int i = 0; i <= bankCustomer.size();i++){
            Customer existingCustomer =bankCustomer.get(i);
            if (existingCustomer.getUserName().equals(UserName) && existingCustomer.getPassword()==password){
                existingCustomer.setLogin(true);
                loginCustomer = existingCustomer;
                break;
            }
        }
        if(loginCustomer.isLogin()){
            return "You Successfully login";
        }else
            return "Your login detail do not match any of our users";

    }
}



