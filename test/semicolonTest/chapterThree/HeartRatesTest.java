package semicolonTest.chapterThree;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeartRatesTest {
    HeartRates myHeart;
    @BeforeEach
    void setup(){
        myHeart=new HeartRates("Tobias","Eze",);
    }
    @Test
    public void testToSetFirstName(){
        myHeart.setFirstName("Tony");
        assertEquals("Tony",myHeart.getFirstName());
    }
    @Test
    public void testToSetLastName(){
        myHeart.setLastName("Phillip");
        assertEquals("Phillip",myHeart.getLastName());
    }
    @Test
    public void testForDateOfBirth(){
        myHeart.setDateOfBirth();
    }

}
