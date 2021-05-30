package semicolon.chapter3;

import java.time.LocalDate;

public class Date {
    private int month;
    private int day;
    private int year;
    private String date;


    public Date(int month, int day, int year){
        if(month>=1 && month <=12)
        this.month=month;

        if(day>=1 && day<=31)
        this.day=day;

        if(year>=1950 && year <= LocalDate.now().getYear()-1)
        this.year=year;
    }

    public void setDateMonth(int dateMonth) {
        if(month>=1 && month<=12)
        month=dateMonth;

    }
    public int getDateMonth() {
        return month;
    }

    public void setDateDay(int dateDay) {
        if(day>=1 && day <=31)
        day=dateDay;
    }

    public int getDateDay() {
        return day;
    }

    public void setYearOfDate(int dateYear) {
        if (year>=1950 && year<= LocalDate.now().getYear()-1)
        year=dateYear;
    }

    public int getYearOfDate() {
        return year;
    }

    public String displayDate() {
        date = month+"/"+day+"/"+year;
        return date;
    }
}
