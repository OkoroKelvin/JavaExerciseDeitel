package africa.semicolon.ridehailing;

public class Admin {
    private String adminUserName;
    private String passWord;

    public void setAdminUserName(String name) {
        adminUserName=name;

    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminPassword(String pass) {
        passWord=pass;

    }

    public String getAdminPassword() {
        return passWord;
    }
}
