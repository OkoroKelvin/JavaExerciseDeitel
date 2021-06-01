package semicolonTest.chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {
    Invoice receipt;

    @BeforeEach
    void setUp(){
        receipt= new Invoice(0.0,0,"","");


    }
    @Test
    public void testToSetAndGetPricePerItems(){
        receipt.setPricePerItems(23.00);
        assertEquals(23,receipt.getPricePerItems());
    }
    @Test
    public void toTestSetAndGetQuantityOfItemBeingPurchased(){
        receipt.setQuantityOfItemsPurchased(22);
        assertEquals(22,receipt.getQuantityOfItemsPurchased());
    }
    @Test
    public void toTestSetAndGetSetPartDescription(){
        receipt.setPartDescription("String");
        assertEquals("String", receipt.getPartDescription());
    }
    @Test
    public void toTestSetAndGetPartNumbers(){
        receipt.setPartNumbers("Four");
        assertEquals("Four",receipt.getPartNumbers());

    }
    @Test
    public void toTestGetInvoiceAmount(){
        receipt.getInvoiceAmount();
    }
    @Test
    public void toTestGetI(){
        receipt.setPricePerItems(-23.8);
        receipt.setQuantityOfItemsPurchased(89);
        receipt.getInvoiceAmount();
        assertEquals(0.0, receipt.getInvoiceAmount());

    }




}