package semicolon.bankApplication;

import java.util.ArrayList;

public class KelvinCustomersDataBase {
    ArrayList<KelvinBankCustomer> bankKelvinBankCustomer = new ArrayList<>();

    public KelvinCustomersDataBase(){

    }

    private KelvinBankCustomer registerCustomer(String firstName, String lastName, String UserName, String phoneNumber, int password){
        KelvinBankCustomer createKelvinBankCustomer = new KelvinBankCustomer(firstName,lastName,UserName,phoneNumber,password);
        bankKelvinBankCustomer.add(createKelvinBankCustomer);
        return createKelvinBankCustomer;
    }
    private String loginCustomer(String UserName, int password){
        KelvinBankCustomer loginKelvinBankCustomer = new KelvinBankCustomer();
        for(int i = 0; i <= bankKelvinBankCustomer.size(); i++){
            KelvinBankCustomer existingKelvinBankCustomer = bankKelvinBankCustomer.get(i);
            if (existingKelvinBankCustomer.getUserName().equals(UserName) && existingKelvinBankCustomer.getPassword()==password){
                existingKelvinBankCustomer.setLogin(true);
                loginKelvinBankCustomer = existingKelvinBankCustomer;
                break;
            }
        }
        if(loginKelvinBankCustomer.isLogin()){
            return "You Successfully login";
        }else
            return "Your login detail do not match any of our users";

    }
}



