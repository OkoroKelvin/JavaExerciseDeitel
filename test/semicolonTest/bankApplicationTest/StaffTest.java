package semicolonTest.bankApplicationTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.bankApplication.Staff;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StaffTest {
    Staff myStaff;


    @BeforeEach
    void setUp() {
        myStaff = new Staff("Admin",1993);

    }

    @Test
    void testToSetPasswordForStaff(){
        myStaff.setPassWordForStaff(1993);
        assertEquals(1993,myStaff.getPassWordForStaff());
    }

    @Test
    void testToSetAndGetUserNameOfAnyStaff(){
        myStaff.setStaffUserName("Admin");
        assertEquals("John",myStaff.getStaffUserName());
    }
    @Test
    void testToViewBankAccounts(){
        myStaff.viewAccounts();

    }
}