package semicolonTest.ecomercetest;

import africa.semicolon.ecomercetest.Delivery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryTest {
    Delivery delivery = new Delivery();

    @Test
    public void testForDeliveryReferences(){
        delivery.setTheDeliveryReferencesId(1122334);
        assertEquals(1122334, delivery.getTheDeliveryReferncesId());




    }

}
