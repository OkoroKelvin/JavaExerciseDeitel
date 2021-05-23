package africa.semicolon.edutech;

public class Learner {
    private String firstName;
    private String surName;
    private String email;

    public void setCreatFirstName(String nameLearner) {
        firstName = nameLearner;

    }

    public String getTheFirstName() {
        return firstName;
    }

    public void setTheSurname(String realName) {
        surName = realName;
    }

    public String getTheSurname() {
        return surName;
    }


    public void setTheLearnerEmail(String mail) {
        email = mail;
    }

    public String getTheLearnerEmail() {
        return email;
    }

}
