package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testThatCalculatorCanAddTest(){
        //given
    Calculator myCalculator= new Calculator();
        //when
    int result = myCalculator.add(2,6);
        //check/assert
    assertEquals(8, result);

    }

    @Test
    public void testThatCalculatorCanMultiply(){
        //given
        Calculator calculator = new Calculator ();
        //when
        int result = calculator.multiply(3,4);
        //confirm
        assertEquals(12, result);


    }

    @Test
    public void testThatCalculatorCanSub(){
        Calculator theCalculator=new Calculator ();
        int result= theCalculator.substract(7,3);
        assertEquals(4, result);

    }
    @Test
    public void testThatCalculatorCanDivide(){
        Calculator byCalculator = new Calculator();
        int result= byCalculator.divide(20,2);
        assertEquals(10, result);
    }
}


