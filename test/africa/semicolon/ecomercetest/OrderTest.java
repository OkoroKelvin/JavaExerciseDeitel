package africa.semicolon.ecomercetest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    Order order= new Order();
    @Test
    public void testToCreateOrderCode(){
        order.setTheOrderCode(23467282);
        assertEquals(23467282, order.getTheOrderCode());
    }
    @Test
    public void testToKnowCustomerID(){
        order.setTheCustomerID(6553);
        assertEquals(6553, order.getTheCustomerId());
    }
    @Test
    public void testForOrderDate(){
        order.setTestForOrderDate("12/Dec/2021");
        assertEquals("12/Dec/2021", order.getTheForOrderDate());
    }
    @Test
    public void testForShippingId(){
        order.setTheShippingId("R4534TR");
        assertEquals("R4534TR", order.getTheShippingId());

    }


    }

