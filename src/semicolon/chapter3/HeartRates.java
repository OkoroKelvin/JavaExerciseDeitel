package semicolon.chapter3;

import java.time.LocalDate;

public class HeartRates {
    private Date dateOfBirth;
    private String firstName;
    private String lastName;


    public HeartRates(String firstName, String lastName, Date dateOfBirth) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfBirth=dateOfBirth;

    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lName) {
        lastName=lName;

    }

    public String getLastName() {
        return lastName;

    }

    public int getAgeInYears() {
        int currentDay= LocalDate.now().getDayOfMonth();
        int currentMonth=LocalDate.now().getMonthValue();
        int currentYear=LocalDate.now().getYear();
        int ageInYears = 0;

        if(currentMonth>dateOfBirth.getDateMonth()||currentDay> dateOfBirth.getDateDay())

        {return currentYear-dateOfBirth.getYearOfDate()-1 ;}
        else{
            return currentYear- dateOfBirth.getYearOfDate();
        }
    }
}
