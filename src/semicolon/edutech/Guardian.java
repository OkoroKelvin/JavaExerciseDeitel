package africa.semicolon.edutech;

public class Guardian {
    private String firstName;
    private String surName;
    private String address;
    private String telephone;

    public void setTheFirstName(String rName) {
        firstName= rName;

    }

    public String getTheFirstName() {
        return firstName;
    }

    public void setTheSecondName(String secName) {
        surName= secName;

    }

    public String getTheSecondName() {
        return surName;
    }

    public void setTheAdress(String houseAddress) {
        address=houseAddress;
    }

    public String getTheAdress() {
        return address;

    }
}
