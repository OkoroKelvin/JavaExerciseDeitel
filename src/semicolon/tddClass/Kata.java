package semicolon.tddClass;
import java.util.Scanner;

public class Kata {

    public static void main(String... args) {
        int num1;
        System.out.println("kindly input three numbers");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        int newNum1 = num1 / 100;
        int newNum2 = (num1 / 10) % 10;
        int newNum3 = (num1 % 10);


        if (newNum1 == newNum3) {
            System.out.println("This is a Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }
    }

    public static String showGrade(int score) {
        String grade = null;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80 && score <= 89) {
            grade = "B";
        } else if (score >= 70 && score <= 79) {
            grade = "C";
        } else if (score >= 60 && score <= 69) {
            grade = "D";
        } else if (score >= 40 && score <= 59) {
            grade = "E";
        } else if (score <= 39) {
            grade = "F";
        }
        return grade;
    }

    public static int calculateTotalPrice(int copies) {
        int totalPrice = 0;

        if (copies >= 1 && copies <= 4) {
            totalPrice = copies * 1500;
        } else if (copies >= 5 && copies <= 9) {
            totalPrice = copies * 1400;
        } else if (copies >= 10 && copies <= 29) {
            totalPrice = copies * 1200;
        } else if (copies >= 30 && copies <= 49) {
            totalPrice = copies * 1100;
        } else if (copies >= 50 && copies <= 99) {
            totalPrice = copies * 1000;
        } else if (copies >= 100 && copies <= 199) {
            totalPrice = copies * 900;
        } else if (copies >= 200) {
            totalPrice = copies * 800;
        }
        return totalPrice;
    }

    public static int calculateProfit(int copies) {

        int costPrice;
        int sellerPrice;
        int resellerProfit = 0;

        if (copies >= 1 && copies <= 4) {
            costPrice = 1500;
            sellerPrice = 2000;
            resellerProfit = (sellerPrice * copies) - (costPrice * copies);
        } else if (copies >= 5 && copies <= 9) {
            costPrice = 1400;
            sellerPrice = 2000;
            resellerProfit = (sellerPrice * copies) - (costPrice * copies);
        } else if (copies >= 10 && copies <= 29) {
            costPrice = 1200;
            sellerPrice = 2000;
            resellerProfit = (sellerPrice * copies) - (costPrice * copies);
        } else if (copies >= 30 && copies <= 49) {
            costPrice = 1100;
            sellerPrice = 2000;
            resellerProfit = (sellerPrice * copies) - (costPrice * copies);
        } else if (copies >= 50 && copies <= 99) {
            costPrice = 1000;
            sellerPrice = 2000;
            resellerProfit = (sellerPrice * copies) - (costPrice * copies);
        } else if (copies >= 100 && copies <= 199) {
            costPrice = 900;
            sellerPrice = 2000;
            resellerProfit = (sellerPrice * copies) - (costPrice * copies);
        } else if (copies >= 200) {
            costPrice = 800;
            sellerPrice = 2000;
            resellerProfit = (sellerPrice * copies) - (costPrice * copies);
        }
        return resellerProfit;
    }

    public static int calculateAmountOfFactor(int numberInput) {
        int factor = 1;
        int count = 0;
        while (factor <= numberInput) {
            if (numberInput % factor == 0) {
                count++;
            }
            factor++;
        }
        return count;
    }

    public static String reverseNumber(int realNumber) {
        int num5 = realNumber % 10;
        int num4 = realNumber % 100 / 10;
        int num3 = realNumber / 100 % 10;
        int num2 = realNumber / 1000 % 10;
        int num1 = realNumber / 10000;

        return num5 + "" + num4 + "" + num3 + "" + num2 + "" + num1;
    }

    public static int findFactorialOf(int factorialNumber) {
        int total = 1;
        while (factorialNumber != 0) {
            total = total * factorialNumber;
            factorialNumber--;
        }
        return total;
    }

    public static String convertBase10ToBase2(int baseNumber) {
        //int remainder;
        String baseTwo = "";
        while (baseNumber > 0) {

            int remainder = baseNumber % 2;

            baseNumber = baseNumber / 2;

            baseTwo = remainder + baseTwo;

        }
        return baseTwo;
    }

    public static String convertBase10ToBaseBetween2to9(int baseTen, int otherBase) {
        String newBaseNumber = "";

        while (baseTen > 0) {

            int remainder = baseTen % otherBase;

            baseTen = baseTen / 2;

            newBaseNumber = remainder + newBaseNumber;
        }
        return newBaseNumber;
    }

    public static int sumOfValuesInArray(int[] numbers) {
        int sum = 0;
        for (int count = 0; count < numbers.length; count++) {
            sum += numbers[count];
        }
        return sum;
    }

    public static int findMaximumNumber(int[] numbers) {
        int maximumNumber = numbers[0];
        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] > maximumNumber) {
                maximumNumber = numbers[count];
            }
        }
        return maximumNumber;
    }

    public static int findMinimumNumber(int[] numbers) {
        int minimumNumber = numbers[0];
        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] < minimumNumber) {
                minimumNumber = numbers[count];
            }

        }
        return minimumNumber;
    }

    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        double average;
        for (int count = 0; count < numbers.length; count++) {
            sum += numbers[count];
        }
        average = sum * 1.0 / numbers.length;
        return average;
    }


    public static int largestSumOfArray(int [] numbers) {
//        return sumOfValuesInArray(numbers) - findMinimumNumber(numbers);
        int largestSum = sumOfValuesInArray(numbers) - numbers[0];
        int temporalLargest = 0;
        for (int i = 0; i < numbers.length; i++) {
            temporalLargest = sumOfValuesInArray(numbers) - numbers[i];
            if(temporalLargest > largestSum){
                largestSum = temporalLargest;
            }
        }
        return largestSum;
    }

    public static int smallestSumOfArray(int[] numbers) {
        int smallestSum = sumOfValuesInArray(numbers) - numbers[0];
        int temporalSmallest =0;
        for (int i = 0; i < numbers.length; i++){
            temporalSmallest= sumOfValuesInArray(numbers)-numbers[i];
            if(temporalSmallest < smallestSum){
                smallestSum=temporalSmallest;
            }
        }
        return smallestSum;
    }

}
