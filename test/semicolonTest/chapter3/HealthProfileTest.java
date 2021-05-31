package semicolonTest.chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.chapter3.Date;
import semicolon.chapter3.HealthProfile;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthProfileTest {

    HealthProfile myHealthProfile;


    @BeforeEach
    void setup(){
        myHealthProfile = new HealthProfile("Okum","Love","Female",new Date(5,25,1994),61,110);
    }
@Test
    public void testToSetAndGetFirstName(){
        myHealthProfile.setFirstName("Ade");
        assertEquals("Ade", myHealthProfile.getFirstName());
}
@Test
    public void testToSetAndGetLastName(){
        myHealthProfile.setLastName("Obey");
        assertEquals("Obey",myHealthProfile.getLastName());
}
@Test
    public void testToSetAndGetGender(){
        myHealthProfile.setGender("Male");
        assertEquals("Male",myHealthProfile.getGender());
}
@Test
    public void testToSetAndGetHeightInInches(){
        myHealthProfile.setHeightInInches(61);
        assertEquals(61,myHealthProfile.getHeightInInches());
}
@Test
    public void testToSetAndGetWeightInPound(){
        myHealthProfile.setWeightInPound(2);
        assertEquals(2,myHealthProfile.getWeightInPound());

}
@Test
    public void testToGetDateOfBirth(){
        myHealthProfile.getDateOfBirth();
        assertEquals(27,myHealthProfile.getDateOfBirth());
}



}
