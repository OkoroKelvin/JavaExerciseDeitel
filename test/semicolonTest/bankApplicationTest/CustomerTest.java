package semicolonTest.bankApplicationTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.bankApplication.Customer;
import semicolon.bankApplication.ProjectAccount;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
Customer customer1;
ProjectAccount account1;
    @BeforeEach
    void setUp() {
        account1 = new ProjectAccount();
        customer1 = new Customer("Ade","Tolu","08163091749",account1);
    }
    @Test
    void testThatSetAndGetNameOfCustomer(){
        customer1.setFirstName("Ade");
        assertEquals("Ade",customer1.getFirstName());
        customer1.setLastName("Royce");
        assertEquals("Royce",customer1.getLastName());
    }
    @Test
    void testForCustomerPhoneNumber(){
        customer1.setPhoneNumber("08163091749");
        assertEquals("08163091749",customer1.getPhoneNumber());
    }
    @Test
    void testThatCustomerCanTransfer(){
        ProjectAccount account2 = new ProjectAccount();
        customer1.deposit(1000);
        double amountToTransfer = 500;
        customer1.transfer(amountToTransfer,account2);
        assertEquals(500.0,customer1.getBalance());
        assertEquals(500.0,account2.getAccountBalance());
    }
    @Test
    void testThatCustomerCanDeposit(){
        int amountToDeposit = 500;
        customer1.deposit(amountToDeposit);
        assertEquals(500,customer1.getBalance());
    }
    @Test
    void testThatCustomerCanWithdraw(){
        customer1.deposit(500);
        double amountToWithdraw = 200;
        customer1.withdraw(amountToWithdraw);
        assertEquals(300,customer1.getBalance());
    }

}