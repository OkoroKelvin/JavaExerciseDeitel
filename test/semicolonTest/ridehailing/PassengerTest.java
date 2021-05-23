package semicolonTest.ridehailing;

import africa.semicolon.ridehailing.Passenger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengerTest {
    Passenger passenger = new Passenger();
    @Test
    public void testToCreateThePassengerId(){
        passenger.setThePassengerId(112233);
        assertEquals(112233, passenger.getThePassengerId());
    }
    @Test
    public void testToCreatePassengerName(){
        passenger.setThePassengerName("Timothy Adebayor");
        assertEquals("Timothy Adebayor",passenger.getThePassengerName());
    }
@Test
    public void testForPassengerEmail(){
      passenger.setTheEmail("tim@gmail.com");
      assertEquals("tim@gmail.com", passenger.getThePassengerEmail());
    }
    @Test
    public void testForAddress(){
        passenger.setAddressPass("Abu street");
        assertEquals("Abu street", passenger.getPassengerAddress());
    }
    @Test
    public void testPhoneNumber(){
        passenger.setPhoneNumber(1234567);
        assertEquals(1234567, passenger.getPhoneNum());
    }
}
