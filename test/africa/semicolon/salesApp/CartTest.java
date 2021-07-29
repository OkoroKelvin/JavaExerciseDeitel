package africa.semicolon.salesApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CartTest {
    @Test
    void cartCanBeCreated(){
        Cart cart = new Cart();
    }
    @Test
    void cartCanAddItemToList(){
        Cart cart = new Cart();
        Item item = new Item("Null",0,0);
        cart.addItemToCart(item);
        assertNotNull(cart);
    }
}
