package semicolonTest.bankApplicationTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.bankApplication.KelvinBankStaff;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KelvinBankStaffTest {
    KelvinBankStaff myKelvinBankStaff;


    @BeforeEach
    void setUp() {
        myKelvinBankStaff = new KelvinBankStaff("Admin",1993);

    }

    @Test
    void testToSetPasswordForStaff(){
        myKelvinBankStaff.setPassWordForStaff(1993);
        assertEquals(1993, myKelvinBankStaff.getPassWordForStaff());
    }

    @Test
    void testToSetAndGetUserNameOfAnyStaff(){
        myKelvinBankStaff.setStaffUserName("Admin");
        assertEquals("John", myKelvinBankStaff.getStaffUserName());
    }
    @Test
    void testToViewBankAccounts(){
//        myKelvinBankStaff.viewAccounts();

    }
}