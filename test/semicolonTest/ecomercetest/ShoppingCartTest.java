package semicolonTest.ecomercetest;

import africa.semicolon.ecomercetest.ShoppingCart;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {
    ShoppingCart shopping = new ShoppingCart();
    @Test
    public void toCreateShoppingCartId(){
        shopping.setTheShoppingCartId(12345);
        assertEquals(12345, shopping.getTheShoppingCartId());
    }
    @Test
    public void toCreateProductId(){
        shopping.setTheProductId(45454);
        assertEquals(45454,shopping.getTheProductId());

    }
    @Test
    public void toCreateQuantity(){
        shopping.setTheQuantityID(4);
        assertEquals(4, shopping.getTheQuantityID());
    }
    @Test
    public void toCreateDateAdded(){
        shopping.setDateOfCart("02DEC2021");
        assertEquals("02DEC2021", shopping.getDateOfCart());

    }
}
