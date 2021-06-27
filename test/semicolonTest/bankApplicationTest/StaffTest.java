//package semicolonTest.bankApplicationTest;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import semicolon.bankApplication.Staff;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class StaffTest {
//    Staff myStaff;
//
//
//    @BeforeEach
//    void setUp() {
//        myStaff = new Staff();
//
//    }
//
//    @Test
//    void testToSetPasswordForStaff(){
//        myStaff.setPassWordForStaff(1993);
//        assertEquals(1993,myStaff.getPassWordForStaff());
//    }
//
//    @Test
//    void testToSetAndGetNameOfAnyStaff(){
//        myStaff.setStaffFirstName("John");
//        assertEquals("John",myStaff.getStaffSecondName());
//    }
//
//    @Test
//    void testToSetAndGetLastNameOfAnyStaff(){
//        myStaff.setStaffLastName("Bola");
//        assertEquals("Bola",myStaff.getStaffLastName());
//    }
//    @Test
//    void testToViewAccount(){
//        int accountNumber = myStaff.viewAccounts();
//        assertEquals(123444,accountNumber);
//    }
//    @Test
//    void testToDeleteBankAccounts(){
//         myStaff.deleteBankAccounts();
//
//    }
//}