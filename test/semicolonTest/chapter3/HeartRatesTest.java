package semicolonTest.chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.chapter3.Date;
import semicolon.chapter3.HeartRates;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeartRatesTest {
    HeartRates myHeart;
    @BeforeEach
    void setup(){
        myHeart=new HeartRates("Tobias","Eze",new Date(5,28,1998));
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
    public void testToGetThePersonsAgeInYear(){
        assertEquals(23, myHeart.getAgeInYears());

    }

}
