package semicolonTest.bankApplicationTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.bankApplication.ProjectAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProjectAccountTest {
    ProjectAccount myAccount;

    @BeforeEach
    void setUp(){
        myAccount= new ProjectAccount();
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
        ProjectAccount myAccount2 = new ProjectAccount();
        assertNotEquals(myAccount,myAccount2);
    }
    @Test
    public void testToTransferMoneyFromOneAccountToAnotherAccount(){
        ProjectAccount myAccount2 = new ProjectAccount();
        myAccount.deposit(3000);
        myAccount.transfer(3000,myAccount2);
        System.out.println(myAccount2.getAccountBalance());
    }

}
