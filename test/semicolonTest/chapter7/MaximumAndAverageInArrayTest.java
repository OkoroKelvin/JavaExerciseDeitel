package semicolonTest.chapter7;

import org.junit.jupiter.api.Test;
import semicolon.chapter7.MaximumAndAverageInArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumAndAverageInArrayTest {
    MaximumAndAverageInArray myArray = new MaximumAndAverageInArray();

    @Test
    void testToKnowArraySumTotal() {
        MaximumAndAverageInArray myArray = new MaximumAndAverageInArray();
        int[] numbers = {2, 3, 5, 6, 7, 8, 9, 5, 4, 3};
        myArray.calculateTheSumOfArray(numbers);
        assertEquals(52, myArray.calculateTheSumOfArray(numbers));
    }

    @Test
    void testToKnowAverageOfArraysValue() {
        MaximumAndAverageInArray myArray = new MaximumAndAverageInArray();
        int[] numbers = {2, 3, 5, 6, 7, 8, 9, 5, 4, 3};
        myArray.calculateTheAverage(numbers);
        assertEquals(5.2, myArray.calculateTheAverage(numbers));
    }

    @Test
    void testToKnowMaximumOfArraysValue() {
        MaximumAndAverageInArray myArray = new MaximumAndAverageInArray();
        int[] numbers = {2, 3, 5, 6, 7, 8, 9, 5, 4, 3};
        myArray.findMaximumNumber(numbers);
        assertEquals(9, myArray.findMaximumNumber(numbers));
    }

    @Test
    void testToKnowMinimumOfArraysValue() {
        MaximumAndAverageInArray myArray = new MaximumAndAverageInArray();
        int[] numbers = {2, 3, 5, 6, 7, 8, 9, 5, 4, 3};
        myArray.findMinimumNumber(numbers);
        assertEquals(2, myArray.findMinimumNumber(numbers));
    }
}
