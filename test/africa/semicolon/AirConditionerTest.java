package africa.semicolon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {

    AirConditioner scanfrost;
    @BeforeEach
    void setUp() {
     scanfrost = new AirConditioner(false, "scanfrostHD", 16);
    }

    @AfterEach
    void tearDown() {
        scanfrost = null;
    }


    @Test
    void testThePresentStateOfTheAirConditioner(){
        boolean response = scanfrost.isOn();
        assertFalse(response);

        boolean response2 = scanfrost.setOn();
        assertTrue(response2);

        boolean response3 = scanfrost.isOn();
        assertTrue(response3);
    }

    @Test
    void testAirConditionHasANameAndCanBeConfigured(){
        testThePresentStateOfTheAirConditioner();
        String response = scanfrost.getProductName();
        assertEquals("scanfrostHD",response );


        scanfrost.setProductName("scanfrostUltra");

        String response2 = scanfrost.getProductName();
        assertEquals("scanfrostUltra",response2 );

        scanfrost.setProductName("bedRoomAC");

    }

    @Test
//    TUTORIAL TEST
    void testEssenceOfBeforeAndAfterEachOfJUnit5(){
      String response =  scanfrost.getProductName();
      assertEquals("scanfrostHD", response);
    }


    @Test
    void testTemperatureAccess(){
        int response = scanfrost.getTemperature();
        assertEquals(16, response);

        scanfrost.setTemperature(20);
        assertEquals(20,scanfrost.getTemperature());

        scanfrost.setTemperature(30);
        assertEquals(30,scanfrost.getTemperature());

//        scanfrost.setTemperature(150);
//        assertEquals(150,scanfrost.getTemperature());

//        scanfrost.setTemperature(15);
//        assertEquals(15,scanfrost.getTemperature());

        scanfrost.decreaseTemperature();
        assertEquals(29,scanfrost.getTemperature());
        scanfrost.decreaseTemperature();
        assertEquals(28,scanfrost.getTemperature());

        scanfrost.setTemperature(16);
        scanfrost.decreaseTemperature();
       // assertEquals(15,scanfrost.getTemperature());
        scanfrost.setTemperature(30);
        scanfrost.decreaseTemperature();
        scanfrost.decreaseTemperature();

        scanfrost.increaseTemperature();
        assertEquals(29, scanfrost.getTemperature());

        scanfrost.increaseTemperature();
        scanfrost.increaseTemperature();



    }





}