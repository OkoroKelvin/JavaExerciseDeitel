package africa.semicolon;

public class Bike {
    private int speedInKmPerHour;
    private boolean isOn;
    private int currentGearNumber;

    public void setSpeedInKmPerHour(int newSpeedInKmPerHour) {
        if (isOn == true) {
            speedInKmPerHour = newSpeedInKmPerHour;
        }
    }


    public int getSpeedInKmPerHour() {
        return speedInKmPerHour;
    }


    public void setOn(boolean isOn) {
        this.isOn = isOn;

        if (isOn ==true) {
            currentGearNumber = 1;
        } else currentGearNumber = 0;
    }


    public boolean isOn() {
        return isOn;
    }


    public int getCurrentGearNumber() {
        return currentGearNumber;
    }

    public void speedUp() {
        if (isOn == true) ;
        if (speedInKmPerHour >= 0 && speedInKmPerHour < 20) {
            currentGearNumber = 1;
        }

        if (speedInKmPerHour >= 20 && speedInKmPerHour < 35) {
            currentGearNumber = 2;
        }

        if (speedInKmPerHour >= 35 && speedInKmPerHour < 75) {
            currentGearNumber = 3;
        }
        if (speedInKmPerHour >= 75 && speedInKmPerHour < 100) {
            currentGearNumber = 4;
        }
        speedInKmPerHour = speedInKmPerHour + currentGearNumber;
    }


    public void decreaseSpeed() {
        if (isOn == true) ;
        if (speedInKmPerHour > 75 && speedInKmPerHour <= 100) {
            currentGearNumber = 4;
        }
        if (speedInKmPerHour > 35 && speedInKmPerHour <= 75) {
            currentGearNumber = 3;
        }
        if (speedInKmPerHour > 20 && speedInKmPerHour <= 35) {
            currentGearNumber = 2;
        }
        if (speedInKmPerHour >= 1 && speedInKmPerHour <= 20) {
            currentGearNumber = 1;
        }
        speedInKmPerHour = speedInKmPerHour - currentGearNumber;
    }
}



