package africa.semicolon.estore;

public class User {
    private int age;
    private String email;
    private String name;
    private String password;
    private String phone;
    private Address homeAddress;

    public User(int age, String email, String name, String password, String phone, Address homeAddress) {
        this.age = age;
        this.email = email;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.homeAddress = homeAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

}
