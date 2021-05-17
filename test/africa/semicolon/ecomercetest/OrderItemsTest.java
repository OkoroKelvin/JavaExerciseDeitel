package africa.semicolon.ecomercetest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderItemsTest {
    OrderItems orderItems = new OrderItems();

    @Test
    public void testToCreateOrderItemId(){
        orderItems.setTheOrderItemId(3456);
        assertEquals(3456, orderItems.getTheOrderItemId());
    }
    @Test
    public void testToCreateProductCode(){
        orderItems.setTheProductCode("335QWE");
        assertEquals("335QWE", orderItems.getTheProductCode());
    }
    @Test
    public void testToCreateProductCartCode(){
        orderItems.setProductCartCode("RT45RT");
        assertEquals("RT45RT", orderItems.getProductCartCode());
    }
    @Test
    public void testToCreateDateManufacture(){
        orderItems.setDateManufacture("24OCT2021");
        assertEquals("24OCT2021", orderItems.getDateManufacture());
    }
    @Test
    public void testToCreateExpiryDate(){
        orderItems.setProductExpiryDate("22OCT2056");

    }
}
