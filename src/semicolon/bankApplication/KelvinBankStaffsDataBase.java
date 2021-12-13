package semicolon.bankApplication;

import java.util.ArrayList;

public class KelvinBankStaffsDataBase {

    private ArrayList<KelvinBankStaff> kelvinBankStaffs = new ArrayList<>();

    public KelvinBankStaffsDataBase() {

    }

    public void registerStaff(String username, int password) {
        KelvinBankStaff kelvinBankStaff = new KelvinBankStaff(username, password);
        ArrayList<KelvinBankStaff> kelvinBankStaffs = new ArrayList<>();
        kelvinBankStaffs.add(kelvinBankStaff);
        setStaffs(kelvinBankStaffs);
        System.out.println("KelvinBankStaff with username "+username+ "was registered successfully");
//        System.out.println("Total kelvinBankStaffsDataBase "+ Arrays.stream(kelvinBankStaffsDataBase.toArray()).count());

    }

    public String loginStaff(String username, int password) {
        System.out.println(kelvinBankStaffs.size());
        KelvinBankStaff loginKelvinBankStaff = new KelvinBankStaff();
        for(int i = 0; i <= kelvinBankStaffs.size(); i++){
           KelvinBankStaff existingKelvinBankStaff = kelvinBankStaffs.get(i);
            if(existingKelvinBankStaff.getStaffUserName().equals(username) && existingKelvinBankStaff.getPassWordForStaff() ==password){
                existingKelvinBankStaff.setIsLogin(true);
                loginKelvinBankStaff = existingKelvinBankStaff;
                break;
            }
        }
        if(loginKelvinBankStaff.getIsLogin()){
            return "You have login in successfully";
        }
        return "Your login detail do not match any of our users";
    }

    public void setStaffs(ArrayList<KelvinBankStaff> kelvinBankStaffs){
        this.kelvinBankStaffs = kelvinBankStaffs;
    }

    public ArrayList<KelvinBankStaff> allStaffs(){
        return kelvinBankStaffs;
    }
}