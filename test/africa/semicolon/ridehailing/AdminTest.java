package africa.semicolon.ridehailing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdminTest {
    Admin admin = new Admin();
    @Test
    public void testForAdminUserName(){
        admin.setAdminUserName("Ride1405");
        assertEquals("Ride1405", admin.getAdminUserName());
    }
@Test
    public void testForAdminPassword(){
        admin.setAdminPassword("YES123");
        assertEquals("YES123", admin.getAdminPassword());

    }
}
