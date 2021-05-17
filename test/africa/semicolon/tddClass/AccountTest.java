package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

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

}