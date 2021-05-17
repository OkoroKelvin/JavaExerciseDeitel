package africa.semicolon.ridehailing;

public class Passenger {
private int passengerId;
private String passengerName;
private String passengerEmail;
private String passengerAddress;
private int mobileNumber;


    public void setThePassengerId(int passId) {
        passengerId=passId;
    }

    public int getThePassengerId() {
        return passengerId;
    }

    public void setThePassengerName(String passengerName) {
        this.passengerName=passengerName;
    }

    public String getThePassengerName() {
        return this.passengerName;
    }

    public void setTheEmail(String theEmail) {
        passengerEmail=theEmail;
    }

    public String getThePassengerEmail() {
        return passengerEmail;
    }

    public void setAddressPass(String street) {
        passengerAddress= street;

    }

    public String getPassengerAddress() {
        return passengerAddress;
    }

    public void setPhoneNumber(int num) {
        mobileNumber=num;

    }

    public int getPhoneNum() {
        return mobileNumber;
    }
}


