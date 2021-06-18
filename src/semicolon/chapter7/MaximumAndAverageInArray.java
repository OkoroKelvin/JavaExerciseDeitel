package semicolon.chapter7;

public class MaximumAndAverageInArray {

    public int calculateTheSumOfArray(int[] numbers) {
        int sum = 0;
        for (int count = 0; count < numbers.length; count++) {
            sum += numbers[count];
        }
        return sum;
    }

    public double calculateTheAverage(int[] numbers) {
        int sum = 0;
        double average;
        for (int count = 0; count < numbers.length; count++) {
            sum += numbers[count];
        }
        average = sum * 1.0 / numbers.length;
        return average;
    }

    public int findMaximumNumber(int[] numbers) {
        int maximumNumber = numbers[0];
        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] > maximumNumber) {
                maximumNumber = numbers[count];
            }
        }
        return maximumNumber;
    }

    public int findMinimumNumber(int[] numbers) {
        int minimumNumber = numbers[0];
        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] < minimumNumber) {
                minimumNumber = numbers[count];
            }

        }
        return minimumNumber;
    }
}
