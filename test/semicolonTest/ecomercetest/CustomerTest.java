package semicolonTest.ecomercetest;

import africa.semicolon.ecomercetest.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    public void testCustomerCreationName() {
        Customer customer = new Customer();
        customer.setFirstName("Kelvin");
        String customerFirstName4 = customer.getFirstName();
        assertEquals("Kelvin",customerFirstName4);
    }
    @Test
    public void testCustomerLastNameCreation() {
        Customer customer = new Customer();
        customer.setLastName("Henry");
        assertEquals("Henry", customer.getLastName());

    }
    @Test
    public void testCustomerEmail(){
        Customer customer = new Customer();
        customer.setEmailAddress("okorokelvin@yahoo.com");
        assertEquals("okorokelvin@yahoo.com", customer.getEmailAddress());
    }
    @Test
    public void testCustomerAddress(){
        Customer customer = new Customer ();
        customer.setCustomerAddress("321,Herbert Road");
        assertEquals("321,Herbert Road", customer.getCustomerAddress());


    }
    @Test
    public void testCustomerTelephoneNumber(){
        Customer customer = new Customer();
        customer.setCustomerTelephoneNumber(234567198);
        assertEquals(234567198,customer.getCustomerTelephoneNumber());
    }
    @Test
    public void testLoginPassword(){
        Customer customer = new Customer ();
        customer.setLoginPassword(1234);
        assertEquals(1234, customer.getLoginPassword());

    }
}
