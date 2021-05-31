package semicolonTest.chapter3;

import semicolon.chapter3.Date;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;
    private int heightInInches;
    private int weightInPound;

    public HealthProfile(String firstName,String lastName, String gender, Date dateOfBirth,int heightInInches,int weightInPound) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
    }


    public void setFirstName(String fname) {
        firstName=fname;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lName) {
        lastName = lName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String sex) {
        gender=sex;

    }

    public String getGender() {
        return gender;
    }

    public void setHeightInInches(int height) {
        heightInInches=height;
    }


    public int getHeightInInches() {
        return heightInInches;
    }

    public void setWeightInPound(int weight) {
        weightInPound=weight;
    }

    public int getWeightInPound() {
        return weightInPound;
    }
}
