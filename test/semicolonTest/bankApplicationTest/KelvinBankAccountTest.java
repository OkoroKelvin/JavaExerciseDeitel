package semicolonTest.bankApplicationTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.bankApplication.KelvinBankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class KelvinBankAccountTest {
    KelvinBankAccount myAccount;


    @BeforeEach
    void setUp(){
        myAccount= new KelvinBankAccount("Oko");
    }
    @Test
    public void testThatAccountCanDeposit(){
        myAccount.deposit(1000.00);
        myAccount.deposit(780.00);
        myAccount.deposit(900);
        double bankBalance = myAccount.getAccountBalance();
        assertEquals(3680.00,myAccount.getAccountBalance());
    }
    @Test
    public void testThatUserCanWithdrawAmount(){
        myAccount.withdraw(500);
        assertEquals(500,myAccount.getAccountBalance());
    }
    @Test
    public void testToCreateAccountNumberUponCreationOfAccount(){
        KelvinBankAccount myAccount2 = new KelvinBankAccount("");
        assertNotEquals(myAccount,myAccount2);
    }
    @Test
    public void testToTransferMoneyFromOneAccountToAnotherAccount(){
        KelvinBankAccount myAccount2 = new KelvinBankAccount("");
        myAccount.deposit(3000);
        myAccount.transfer(3000,myAccount2);
        System.out.println(myAccount2.getAccountBalance());
    }
    @Test
    void testThatAccountHasNumber(){
        assertEquals(1, myAccount.getAccountNumber());
    }

}
