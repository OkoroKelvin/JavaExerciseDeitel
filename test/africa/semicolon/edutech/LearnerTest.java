package africa.semicolon.edutech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LearnerTest {
    Learner leaner = new Learner();
    @Test
    public void testToCreateFirstName(){
        leaner.setCreatFirstName("Tolutope");
        assertEquals("Tolutope", leaner.getTheFirstName());
    }
    @Test
    public void testToCreateTheSurname(){
        leaner.setTheSurname("Tola");
        assertEquals("Tola",leaner.getTheSurname());
    }
    @Test
    public void testToCreatTheEmail(){
        leaner.setTheLearnerEmail("tolatope@yahoo.com");
        assertEquals("tolatope@yahoo.com", leaner.getTheLearnerEmail());
    }


}

