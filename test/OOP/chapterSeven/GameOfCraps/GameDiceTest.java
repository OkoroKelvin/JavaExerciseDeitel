package OOP.chapterSeven.GameOfCraps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameDiceTest {
    GameDice dice;

    @BeforeEach
    void setUp() {
       dice = new GameDice();
    }
    @Test
    void testToCreatTheFaceOfDice(){
        dice.setFace(6);
        assertEquals(6,dice.getFace());
    }

}