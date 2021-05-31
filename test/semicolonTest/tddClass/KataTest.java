package semicolonTest.tddClass;

import org.junit.jupiter.api.Test;
import semicolon.tddClass.Kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        assertEquals(3000, myKata.calculateTotalPrice(2));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProductFiveToNineCopies(){
        Kata myKata= new Kata();
        myKata.calculateTotalPrice(7);
        assertEquals(9800,myKata.calculateTotalPrice(7));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProduct30To49Copies(){
        Kata myKata= new Kata();
        assertEquals(44000,myKata.calculateTotalPrice(40));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProduct50To99Copies(){
        Kata myKata=new Kata();
        assertEquals(50000,myKata.calculateTotalPrice(50));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProduct100To200Copies(){
        Kata myKata=new Kata();
        assertEquals(90000,myKata.calculateTotalPrice(100));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProductAbove200Copies(){
        Kata myKata= new Kata();
        assertEquals(160800,myKata.calculateTotalPrice(201));
    }
    @Test
    public void testToKnowTheProfitOfTheSeller(){
        Kata myKata=new Kata();
        assertEquals(1000,myKata.calculateProfit(2));
        assertEquals(1500,myKata.calculateProfit(3));
        assertEquals(3000,myKata.calculateProfit(5));
        assertEquals(36000,myKata.calculateProfit(40));

    }
    @Test
    public void testToKnowTheFactorsOfNumber(){
        Kata myKata=new Kata();
        assertEquals(4,myKata.calculateAmountOfFactor(10));
    }
    @Test
    public void testToGetTheReverseOfANumber(){
        Kata myKata=new Kata();
        assertEquals("54721",myKata.reverseNumber(12745));
    }
}