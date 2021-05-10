package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void testThatAccountCanDepositOnce(){
        //given
        Account janetAccount = new Account();

        //when
        janetAccount.deposit(850.00);

        //confirm
        double janetBalance = janetAccount.getAccountBalance();
        assertEquals(850.00, janetBalance);


    }
}
