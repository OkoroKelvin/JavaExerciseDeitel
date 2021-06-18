package semicolonTest.tddClass;

import org.junit.jupiter.api.Test;
import semicolon.tddClass.Account;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void testThatAccountCanDepositOnce() {
        //given
        Account janetAccount = new Account();
        //when
        janetAccount.deposit(850.00);
        //confirm
        double janetBalance = janetAccount.getAccountBalance();
        assertEquals(850.00, janetBalance);

    }
    @Test
    public void testThatUserCanDepositTwice(){
        //given
        Account janetAccount = new Account();
        //when
        janetAccount.deposit(580.00);
        janetAccount.deposit(200.00);
        double balance= janetAccount.getAccountBalance();
        assertEquals(780.0, balance);

    }
    @Test
    public void testThatUserCannotDepositNegativeValue(){
        Account janetAccount = new Account();
        janetAccount.deposit(-300.00);
        assertEquals(0,janetAccount.getAccountBalance());
    }
    @Test
    public void testThatUserCanWithdraw(){
        Account janetAccount = new Account();
        janetAccount.deposit(500);
        double Balance = janetAccount.withdraw(1000, 300);
        assertEquals(200,Balance);
    }
    @Test
    public void testThatUserCannotWithdrawNegativeAmount(){
        Account janetAccount = new Account();
        janetAccount.withdraw(1000, -100);
        assertEquals(0, janetAccount.getAccountBalance());
    }
    @Test
    public void testThatUserCannotWithdrawAboveBalance(){
        Account janetAccount = new Account();
        janetAccount.deposit(2000);
        janetAccount.withdraw(1000, 4000);
        assertEquals(3000,janetAccount.getAccountBalance());
    }
    @Test
    public void testThatUserCannotWithdrawWithoutPin(){
        Account janetAccount = new Account();
        janetAccount.deposit(2000);
        janetAccount.withdraw(1999,1000);
        assertEquals(2000,janetAccount.getAccountBalance());
    }
    @Test
    public void testThatUserCanUpdatePin(){
        Account janetAccount = new Account();
        janetAccount.updatePin(2001);
        assertEquals(2001,janetAccount.getUpdatedPin());
    }
    @Test
    public void testThatAccountDetailsCanBeDisplayed(){
        Account janetAccount = new Account("Janet Ishola");
       // Account.getAccountDetails(janetAccount);
        assertEquals("Janet Ishola Balance is: 1000.0", Account.getAccountDetails(janetAccount));
    }

}