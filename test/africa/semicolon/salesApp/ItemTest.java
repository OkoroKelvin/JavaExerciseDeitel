package africa.semicolon.salesApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ItemTest {
    @Test
    void itemCanBeCreated(){
        Item salesItem = new Item("Null",0,0);
        assertNotNull(salesItem);
    }
    @Test
    void itemHasNameOfItem(){
        Item salesItem = new Item("Null",0,0);
        salesItem.setItemName("Maggi");
        assertEquals("Maggi",salesItem.getItemName());
    }
    @Test
    void itemsHasPrice(){
        Item priceOfItem = new Item("Null",0,0);
        priceOfItem.setPriceOfItem(500);
        assertEquals(500,priceOfItem.getPriceOfItem());
    }
    @Test
    void itemHasQuantity(){
        Item quantity = new Item("Null",0,0);
        quantity.setItemQuantity(2);
        assertEquals(2,quantity.getItemQuantity());
    }
    @Test
    void itemVariablesAreEstablishedOnCreation(){
        Item item = new Item("Television",5000,3);
        assertNotNull(item);
    }



}
