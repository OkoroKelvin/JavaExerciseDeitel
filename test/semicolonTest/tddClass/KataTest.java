package semicolonTest.tddClass;

import org.junit.jupiter.api.Test;
import semicolon.tddClass.Kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
//TestForStudentGradesAndScores
class KataTest {

    @Test
    public void showGrade() {
       // Kata myKata= new Kata();
        assertEquals("A",Kata.showGrade(90));
    }
    @Test
    public void showGrade2(){
       // Kata myKata= new Kata();
        assertEquals("B",Kata.showGrade(82));
    }
    @Test
    public void showGrade3(){
        //Kata myKata = new Kata();
        assertEquals("C",Kata.showGrade(72));
    }
    @Test
    public void showGrade4(){
        //Kata myKata = new Kata();
        assertEquals("D",Kata.showGrade(67));
    }
    @Test
    public void showGrade5(){
        //Kata myKata= new Kata();
        assertEquals("E",Kata.showGrade(50));
    }
    @Test
    public void showGrade6(){
        //Kata myKata= new Kata();
        assertEquals("F",Kata.showGrade(20));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProductOneToFourCopies(){
        //Kata myKata= new Kata();
        assertEquals(3000, Kata.calculateTotalPrice(2));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProductFiveToNineCopies(){
        //Kata myKata= new Kata();
        Kata.calculateTotalPrice(7);
        assertEquals(9800,Kata.calculateTotalPrice(7));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProduct30To49Copies(){
       // Kata myKata= new Kata();
        assertEquals(44000,Kata.calculateTotalPrice(40));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProduct50To99Copies(){
       // Kata myKata=new Kata();
        assertEquals(50000,Kata.calculateTotalPrice(50));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProduct100To200Copies(){
        //Kata myKata=new Kata();
        assertEquals(90000,Kata.calculateTotalPrice(100));
    }
    @Test
    public void testToKnowTotalPriceOfTestDrillerProductAbove200Copies(){
        //Kata myKata= new Kata();
        assertEquals(160800,Kata.calculateTotalPrice(201));
    }
    @Test
    public void testToKnowTheProfitOfTheSeller(){
        //Kata myKata=new Kata();
        assertEquals(1000,Kata.calculateProfit(2));
        assertEquals(1500,Kata.calculateProfit(3));
        assertEquals(3000,Kata.calculateProfit(5));
        assertEquals(36000,Kata.calculateProfit(40));

    }
    @Test
    public void testToKnowTheFactorsOfNumber(){
        //Kata myKata=new Kata();
        assertEquals(4,Kata.calculateAmountOfFactor(10));
    }
    @Test
    public void testToGetTheReverseOfANumber(){
       // Kata myKata=new Kata();
        assertEquals("54721",Kata.reverseNumber(12745));
    }
    @Test
    public void testToGetTheFactorialOfANumber(){
        //Kata myKata = new Kata();
        Kata.findFactorialOf(4);
        assertEquals(24,Kata.findFactorialOf(4));
    }
    @Test
    public void testToConvertBase10ToBase2(){
        //Kata myKata = new Kata();
        //myKata.convertBase10ToBase2(8);
        assertEquals("",Kata.convertBase10ToBase2(139));
    }
    @Test
    public void testToConvertBase10ToAnyBaseBetween2to9(){
        //Kata myKata = new Kata();
       // myKata.convertBase10ToBaseBetween2to9(10,6);
        assertEquals("111",Kata.convertBase10ToBaseBetween2to9(2,2));

    }
    @Test
    public void testToSumUpValuesInArray(){
        int[] numbers= {2, 3, 5, 6, 7, 8, 9, 5, 4, 3};
        Kata.sumOfValuesInArray(numbers);
        assertEquals(52,Kata.sumOfValuesInArray(numbers));
    }
    @Test
    public void testToKnowTheMaximumNumber(){
        int[] numbers= {2, 3, 5, 6, 7, 8, 9, 5, 4, 3};
        Kata.findMaximumNumber(numbers);
        assertEquals(9,Kata.findMaximumNumber(numbers));
    }
    @Test
    public void testToKnowTheMinimumNumber(){
        int[] numbers= {2, 3, 5, 6, 7, 8, 9, 5, 4, 3};
        Kata.findMinimumNumber(numbers);
        assertEquals(2,Kata.findMinimumNumber(numbers));
    }
    @Test
    public void testToKnowTheAverageOfValuesInAnArray(){
        int[] numbers= {2, 3, 5, 6, 7, 8, 9, 5, 4, 3};
        Kata.calculateAverage(numbers);
        assertEquals(5.2,Kata.calculateAverage(numbers));
    }
    @Test
    public void testToKnowTheLargestSumArray(){
        int[] numbers = {2, 3, 5, 6, 7, 8, 9, 5, 4, 3};
        Kata.largestSumOfArray(numbers);
        assertEquals(50,Kata.largestSumOfArray(numbers));
    }
    @Test
    public void testToKnowTheSmallestSumArray(){
        int[] numbers = {2, 3, 5, 6, 7, 8, 9, 5, 4, 3};
        Kata.smallestSumOfArray(numbers);
        assertEquals(43,Kata.smallestSumOfArray(numbers));
    }

}