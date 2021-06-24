package semicolon.bankApplication;

public class Staff {

    private int passWord;
    private String StaffFirstName;
    private String staffLastName;

    public void setPassWordForStaff(int passWord) {
        this.passWord = passWord;
    }

    public int getPassWordForStaff() {
        return passWord;
    }

    public void setStaffFirstName(String fname) {
        StaffFirstName = fname;
    }

    public String getStaffSecondName() {
        return StaffFirstName;
    }

    public void setStaffLastName(String lName) {
        staffLastName = lName;

    }

    public String getStaffLastName() {
        return staffLastName;
    }
}
