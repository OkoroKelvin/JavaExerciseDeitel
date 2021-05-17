package africa.semicolon.ridehailing;

public class Driver {
    private int driverId;
    private String driverNAme;
    private String carPlateNumber;

    public void setDriverId(int ID) {
        driverId=ID;

    }

    public int getDriverId() {
        return driverId;
    }


    public void setDriverName(String name) {
        driverNAme= name;
    }

    public String getDriverName() {
        return driverNAme;
    }

    public void setDriverPlateNum(String plateNum) {
        carPlateNumber=plateNum;
    }

    public String getDriverPlateNum() {
        return carPlateNumber;

    }
}

