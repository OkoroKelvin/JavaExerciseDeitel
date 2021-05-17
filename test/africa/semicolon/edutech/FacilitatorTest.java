package africa.semicolon.edutech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacilitatorTest {
    Facilitator facilitator = new Facilitator();

    @Test
    public void testToCreateFacilitator(){
        facilitator.setTheFirstName("Zee");
        assertEquals("Zee", facilitator.getTheFirstName());
    }
    @Test
    public void testToCreateSecondNameFacilitator(){
        facilitator.setTheSecondName("Tee");
        assertEquals("Tee", facilitator.getTheLastName());
    }
}
