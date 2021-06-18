package semicolonTest.tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.tddClass.AirConditioner;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    AirConditioner scanfrost;

    @BeforeEach
    void setUp() {
        scanfrost = new AirConditioner(false,
                "scanfrostHD", 16);
    }


    @Test
    public void testOnAndOffStateOfTheAirConditioner() {
        boolean response = scanfrost.isOn();
        scanfrost.setOn();
        assertTrue(scanfrost.isOn() == true);

       boolean response3 = scanfrost.isOn();
        scanfrost.setOn();
        assertTrue(scanfrost.isOn() == false);

        boolean response4= scanfrost.isOn();
        System.out.println(response4);
    }
    @Test
    public void testAirConditionHasANameAndCanBeConfigured() {
        testOnAndOffStateOfTheAirConditioner();
       scanfrost.setOn();
        String response = scanfrost.getProductName();
        assertEquals("scanfrostHD", response);


        scanfrost.setProductName("scanfrostUltra");
        String response2 = scanfrost.getProductName();
        assertEquals("scanfrostUltra", response2);


        scanfrost.setProductName("coolestSplit");
        String response3 = scanfrost.getProductName();
        assertEquals("coolestSplit", response3);
        //scanfrost.powerOff();
    }
    @Test
    public void testToSetAndGetTemperature(){
        scanfrost.setOn();
        scanfrost.setOn();
        int response1 = scanfrost.getTemperature();
        assertEquals(16, response1);

        scanfrost.setTemperature(20);
        int response2= scanfrost.getTemperature();
        assertEquals(20,response2);

        scanfrost.setTemperature(30);
        int response3= scanfrost.getTemperature();
        assertEquals(30,response3);
        //scanfrost.powerOff();
    }

    @Test
    public void testToIncreaseTemperature() {
        scanfrost.setOn();
        scanfrost.increaseTemperature();
        assertEquals(17, scanfrost.getTemperature());

        scanfrost.increaseTemperature();
        scanfrost.increaseTemperature();
        scanfrost.increaseTemperature();
        assertEquals(20, scanfrost.getTemperature());

        scanfrost.setTemperature(29);
        scanfrost.increaseTemperature();
        assertEquals(30, scanfrost.getTemperature());
        //scanfrost.powerOff();
    }

    @Test

        public void testToDecreaseTemperature() {
        scanfrost.setOn();
        scanfrost.setTemperature(30);
        assertEquals(30,scanfrost.getTemperature());
        scanfrost.decreaseTemperature();
        assertEquals(29, scanfrost.getTemperature());
        scanfrost.decreaseTemperature();
        scanfrost.decreaseTemperature();
        scanfrost.decreaseTemperature();
        scanfrost.decreaseTemperature();
        assertEquals(25, scanfrost.getTemperature());
        scanfrost.increaseTemperature();
        assertEquals(26,scanfrost.getTemperature());
        scanfrost.setTemperature(16);
        assertEquals(16,scanfrost.getTemperature());
        //scanfrost.powerOff();
    }
    @Test
    public void testToPowerOffAirCondition(){
       scanfrost.setOn();
        scanfrost.setOn();
        assertTrue(scanfrost.isOn() == false);

    }

}