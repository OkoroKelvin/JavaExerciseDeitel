package semicolonTest.bankApplicationTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.bankApplication.KelvinBankAccount;
import semicolon.bankApplication.KelvinBankCustomer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
KelvinBankCustomer kelvinBankCustomer1;
KelvinBankAccount account1;
    @BeforeEach
    void setUp() {
        account1 = new KelvinBankAccount("");
        kelvinBankCustomer1 = new KelvinBankCustomer();
    }
    @Test
    void testThatSetAndGetNameOfCustomer(){
        kelvinBankCustomer1.setFirstName("Ade");
        assertEquals("Ade", kelvinBankCustomer1.getFirstName());
        kelvinBankCustomer1.setLastName("Royce");
        assertEquals("Royce", kelvinBankCustomer1.getLastName());
    }
    @Test
    void testForCustomerPhoneNumber(){
        kelvinBankCustomer1.setPhoneNumber("08163091749");
        assertEquals("08163091749", kelvinBankCustomer1.getPhoneNumber());
    }

    @Test
    void testThatCustomerCanDeposit(){
        double amountToDeposit = 500.00;
        kelvinBankCustomer1.deposit(amountToDeposit);
        assertEquals(500,kelvinBankCustomer1.getBalance());
    }

//    @Test
//    void testThatCustomerCanTransfer(){
//        //KelvinBankAccount secondAccount = new KelvinBankAccount("Chorizo Felix");
//        kelvinBankCustomer1.deposit(1000);
//        assertEquals(1000,kelvinBankCustomer1.getBalance());
////        double amountToTransfer = 500;
////        kelvinBankCustomer1.transfer(amountToTransfer,secondAccount);
////        assertEquals(500.0,kelvinBankCustomer1.getBalance());
////        assertEquals(500.0,secondAccount.getAccountBalance());
//    }
//
//
//    @Test
//    void testThatCustomerCanWithdraw(){
//        kelvinBankCustomer1.deposit(500);
//        double amountToWithdraw = 200;
//        kelvinBankCustomer1.withdraw(amountToWithdraw);
//        assertEquals(300,kelvinBankCustomer1.getBalance());
//    }
//
//
//
//    @Test
//    void testThatCustomerHasAccountNumber(){
////        kelvinBankCustomer1.getAccountNumber();
////        assertEquals(1,kelvinBankCustomer1.getAccountNumber());
//    }

}