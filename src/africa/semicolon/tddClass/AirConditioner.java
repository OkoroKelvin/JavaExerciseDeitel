package africa.semicolon.tddClass;

public class AirConditioner {
    private boolean isOn;
    private String productName;
    private int temperature = 16;

    public AirConditioner(boolean isOn, String productName, int temperature){
        this.isOn = isOn;
        this.productName = productName;
        this.temperature = temperature;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean setOn() {
        isOn = true;
        return true;
    }

    public String getProductName() {
        if (isOn == true) {
            return productName;
        } else {
            System.out.println("please turn on airConditioner! before you can get name ");
        }
        return null;
    }

    public void setProductName(String newProductName) {
        if( isOn == true) {
            productName = newProductName;
        }else {
            System.out.println("please turn on airConditioner ! before you can set name ");
        }

    }

    public int getTemperature() {
        return temperature;
    }


    public void setTemperature(int newTemperature) {
        if( isOn == true){
        if(newTemperature >= 16 && newTemperature <= 30){
        temperature=newTemperature;
        } else {
            System.out.print("Please set temperature between 16 and 30");
        }
        }
    }



    public void decreaseTemperature() {
        if (isOn == true) {
            if (temperature > 16) {
                temperature= temperature-1;
            } else {
                System.out.println("Temperature cant go below 16");
            }
        }
    }



    public void increaseTemperature() {
        if( isOn == true) {
            if (temperature < 30) {
                temperature= temperature+1;
            } else {
                System.out.println("Temperature cant go above 30");
            }
        }

    }

    public void powerOff() {
        if(isOn)
        {isOn = false;temperature=0;
        }
    }
}