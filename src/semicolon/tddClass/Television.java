package africa.semicolon.tddClass;

public class Television {
    boolean isOn;
    public String manufactureName;
    public int telVolume;
    public int channelNumber;


    public Television(String manufactureName,int telVolume,int channelNumber) {
        this.manufactureName=manufactureName;
        this.telVolume=telVolume;
        this.channelNumber=channelNumber;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean setOn() {
        isOn=true;
        return true;
    }

    public void setTvManufactureName(String productName) {
        if(isOn==true)
        {manufactureName=productName;}
    }

    public String getTvManufactureName() {
        if(isOn==true) {
            return manufactureName;
        } else {return null;}
    }

    public void setTvVolume(int volTv) {
        if(isOn==true){
        telVolume = volTv;}
    }

    public int getTvVolume() {
        if(isOn==true){
        return telVolume;
        }
        else {return 0;}
    }

    public void setTvChannelStation(int channelNum) {
        if(isOn==true){
        channelNumber=channelNum;}

    }

    public int getTvChannelStation() {
        return channelNumber;
    }

    public void volumeUp() {
        if(isOn==true){
            if(telVolume >=0 && telVolume <10){
            telVolume=telVolume+1;}
        }
    }

    public void volumeDown() {
        if(isOn==true) {
            if (telVolume >0 && telVolume <= 10) {
                telVolume = telVolume - 1;
            }
        }
    }

    public void channelUp() {
        if(isOn==true) {
            if(channelNumber>=1 && channelNumber <100 )
            {
                channelNumber=channelNumber+1;
            }
        }
    }

    public void channelDown() {
        if(isOn==true){
            if(channelNumber>1 && channelNumber <=100 )
            {channelNumber=channelNumber-1;
            }
        }
    }
}

