package semicolonTest.tddClass;

import africa.semicolon.tddClass.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//TestForStudentGradesAndScores
class KataTest {

    @Test
    public void showGrade() {
        Kata myKata= new Kata();
        assertEquals("A",myKata.showGrade(90));
    }
    @Test
    public void showGrade2(){
        Kata myKata= new Kata();
        assertEquals("B",myKata.showGrade(82));
    }
    @Test
    public void showGrade3(){
        Kata myKata = new Kata();
        assertEquals("C",myKata.showGrade(72));
    }
    @Test
    public void showGrade4(){
        Kata myKata = new Kata();
        assertEquals("D",myKata.showGrade(67));
    }
    @Test
    public void showGrade5(){
        Kata myKata= new Kata();
        assertEquals("E",myKata.showGrade(50));
    }
    @Test
    public void showGrade6(){
        Kata myKata= new Kata();
        assertEquals("F",myKata.showGrade(20));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProductOneToFourCopies(){
        Kata myKata= new Kata();
        assertEquals(3000, myKata.totalPriceTestDriller(2));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProductFiveToNineCopies(){
        Kata myKata= new Kata();
        myKata.totalPriceTestDriller(7);
        assertEquals(9800,myKata.totalPriceTestDriller(7));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProduct30To49Copies(){
        Kata myKata= new Kata();
        assertEquals(44000,myKata.totalPriceTestDriller(40));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProduct50To99Copies(){
        Kata myKata=new Kata();
        assertEquals(50000,myKata.totalPriceTestDriller(50));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProduct100To200Copies(){
        Kata myKata=new Kata();
        assertEquals(90000,myKata.totalPriceTestDriller(100));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProductAbove200Copies(){
        Kata myKata= new Kata();
        assertEquals(160800,myKata.totalPriceTestDriller(201));
    }
    @Test
    public void testToKnowTheProfitOfTheSeller(){
        Kata myKata=new Kata();
        assertEquals(1000,myKata.displayProfit(2));
        assertEquals(1500,myKata.displayProfit(3));
        assertEquals(3000,myKata.displayProfit(5));
        assertEquals(36000,myKata.displayProfit(40));

    }
}