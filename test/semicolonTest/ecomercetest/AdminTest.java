package semicolonTest.ecomercetest;

import africa.semicolon.ecomercetest.Admin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdminTest {
    Admin admin = new Admin();
    @Test
    public void testForAdminName(){
      admin.setTheAdminName("Rooney");
      assertEquals("Rooney", admin.getTheAdminName());

    }

    @Test
    public void testForAdminEmail(){
        admin.setTheAdminEmail("Rooney@yahoo.com");
        assertEquals("Rooney@yahoo.com",admin.getTheAdminEmail());
    }

}
