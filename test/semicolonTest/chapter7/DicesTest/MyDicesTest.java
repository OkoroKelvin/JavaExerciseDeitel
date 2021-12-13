package semicolonTest.chapter7.DicesTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.chapter7.Dices.MyDices;

import static org.junit.jupiter.api.Assertions.*;

class MyDicesTest {
    MyDices dice;

    @BeforeEach
    void setUp() {
        dice = new MyDices();
    }
    @Test
    void testToCreatTheFaceOfDice(){
        dice.setFace(6);
        assertEquals(6,dice.getFace());
    }
}