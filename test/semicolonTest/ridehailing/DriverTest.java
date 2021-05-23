package semicolonTest.ridehailing;

import africa.semicolon.ridehailing.Driver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DriverTest {
    Driver driver = new Driver();
    @Test
    public void testForDriverId() {
        driver.setDriverId(12345);
        assertEquals(12345, driver.getDriverId());
    }
    @Test
    public void testForDriverName(){
        driver.setDriverName("Chidi Emeka");
        assertEquals("Chidi Emeka", driver.getDriverName());
    }
    @Test
    public void testForCarPlateNum(){
        driver.setDriverPlateNum("RT1234YT");
        assertEquals("RT1234YT",driver.getDriverPlateNum());
    }
}


