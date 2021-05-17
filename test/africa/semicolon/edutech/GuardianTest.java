package africa.semicolon.edutech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuardianTest {
    Guardian guardian = new Guardian();
    @Test
    public void testToCreateFirstName(){
        guardian.setTheFirstName("Pelumi");
        assertEquals("Pelumi", guardian.getTheFirstName());

    }
    @Test
    public void testToCreateSecondName(){
        guardian.setTheSecondName("Thomas");
        assertEquals("Thomas", guardian.getTheSecondName());

    }
    @Test
    public void testToCreateAddressGuardian(){
        guardian.setTheAdress("52,Abu Street");
        assertEquals("52,Abu Street", guardian.getTheAdress());

    }
}
