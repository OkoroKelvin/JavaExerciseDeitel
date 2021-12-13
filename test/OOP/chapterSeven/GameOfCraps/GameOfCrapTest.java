//package OOP.chapterSeven.GameOfCraps;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class GameOfCrapTest {
//    GameOfCrap gameOfCrap = new GameOfCrap();
//
//    @Test()
//    void testThatGameOfCrapHasTwoDice(){
//        GameDice firstDice = new GameDice();
//        gameOfCrap.setDice1(firstDice);
//        assertEquals(firstDice,gameOfCrap.getDice1());
//        GameDice secondDice = new GameDice();
//        gameOfCrap.setDice2(secondDice);
//    }
//    @Test()
//    void testThatGameOfCanSumTwoDiceUponTwoDifferentRoll(){
//        int x = 5;
//        int y = 6;
//        GameDice firstDice = new GameDice();
//        GameDice secondDice = new GameDice();
//        firstDice.setFace(5);
//        secondDice.setFace(6);
//        assertEquals(11,gameOfCrap.showSumOfDice());
//    }
//
//}
