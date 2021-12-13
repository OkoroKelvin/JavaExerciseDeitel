//package semicolon.chapter7.AirlineReservationSystem;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class AirlineTicketSystemTest {
//    AirlineTicketSystem airlineSystem;
//
//    @BeforeEach
//    void setUp() {
//        airlineSystem = new AirlineTicketSystem();
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
//
//    @Test
//    @DisplayName("Test that AirlineSystemHasSeat")
//    void testThatAirlineHas10Seats(){
//        boolean[]seats = new boolean[10];
//        airlineSystem.setAirlineSeat(seats);
//        assertEquals(10,seats.length);
//    }
//    @Test
//    @DisplayName("FirstClass Seat is 5")
//    void testThatFirstClassSeatIs5(){
//        airlineSystem.setFirstClassSeat();
//    }
//
//}