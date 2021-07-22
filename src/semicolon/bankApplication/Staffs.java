package semicolon.bankApplication;

import java.util.ArrayList;

public class Staffs {

    private ArrayList<Staff> staffs = new ArrayList<>();

    public Staffs() {

    }

    public void registerStaff(String username, int password) {
        Staff staff = new Staff(username, password);
        ArrayList<Staff> staffs = new ArrayList<>();
        staffs.add(staff);
        setStaffs(staffs);
        System.out.println("Staff with username "+username+ "was registered successfully");
//        System.out.println("Total staffs "+ Arrays.stream(staffs.toArray()).count());

    }

    public String loginStaff(String username, int password) {
        System.out.println(staffs.size());
        Staff loginStaff = new Staff();
        for(int i =0; i <= staffs.size(); i++){
           Staff existingStaff = staffs.get(i);
            if(existingStaff.getStaffUserName().equals(username) && existingStaff.getPassWordForStaff() ==password){
                existingStaff.setIsLogin(true);
                loginStaff = existingStaff;
                break;
            }
        }
        if(loginStaff.getIsLogin()){
            return "You have login in successfully";
        }
        return "Your login detail do not match any of our users";
    }

    public void setStaffs(ArrayList<Staff> staffs){
        this.staffs = staffs;
    }

    public ArrayList<Staff> allStaffs(){
        return staffs;
    }
}