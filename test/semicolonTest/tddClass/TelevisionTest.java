package semicolonTest.tddClass;

import africa.semicolon.tddClass.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelevisionTest {
    Television myTele;
    @BeforeEach
    void setup(){
        myTele = new Television("Sony",0,1);
    }

    @Test
    public void testToPowerOffAndOnTV() {
        myTele.isOn();//TVisOff
        myTele.setOn();//TV is on
        myTele.isOn();//Tv is off

    }
    @Test

    public void testToSetAndGetManufactureName(){
        myTele.setOn();
        myTele.setTvManufactureName("Sony");
        assertEquals("Sony",myTele.getTvManufactureName());
    }
    @Test
    public void testToSetAndGetVolumeOfTv(){
        myTele.setOn();
        myTele.setTvVolume(1);
        assertEquals(1, myTele.getTvVolume());
    }
    @Test
    public void testToSetAndGetChannelStations(){
        myTele.setOn();
        myTele.setTvChannelStation(2);
        assertEquals(2,myTele.getTvChannelStation());

        myTele.setTvChannelStation(3);
        assertEquals(3,myTele.getTvChannelStation());

        myTele.setTvChannelStation(4);
        assertEquals(4,myTele.getTvChannelStation());
    }
    @Test
    public void testToTestIncreaseInVolume(){
        myTele.setOn();
        myTele.volumeUp();//1
        myTele.volumeUp();//2
        myTele.volumeUp();//3
        myTele.volumeUp();//4
        assertEquals(4,myTele.getTvVolume());
    }
    @Test
    public void testToTestDecreaseInVolume(){
        myTele.setOn();
        myTele.setTvVolume(10);
        myTele.volumeDown();//9
        myTele.volumeDown();//8
        myTele.volumeDown();//7
        myTele.volumeDown();//6
        myTele.volumeDown();//5
        assertEquals(5,myTele.getTvVolume());

    }
    @Test
    public void testToSetChannelUp(){
        myTele.setOn();
        myTele.channelUp();//2
        myTele.channelUp();//3
        myTele.channelUp();//4
        myTele.channelUp();//5
        myTele.channelUp();//6
        assertEquals(6, myTele.getTvChannelStation());
    }
    @Test
    public void testToSetChannelDown(){
        myTele.setOn();
        myTele.setTvChannelStation(70);
        myTele.channelDown();
        myTele.channelDown();
        myTele.channelDown();
        myTele.channelDown();
        myTele.channelDown();
        assertEquals(65,myTele.getTvChannelStation());

    }

}
