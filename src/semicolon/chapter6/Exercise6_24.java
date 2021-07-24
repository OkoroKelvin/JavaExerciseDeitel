package semicolon.chapter6;
/*
(Perfect Numbers) An integer number is said to be a perfect number if its factors, including
1 (but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 =
1 + 2 + 3. Write a method isPerfect that determines whether parameter number is a perfect number.
Use this method in an application that displays all the perfect numbers between 1 and 1000. Display
the factors of each perfect number to confirm that the number is indeed perfect. Challenge the computing
power of your computer by testing numbers much larger than 1000. Display the results.
 */


import java.util.Scanner;

public class Exercise6_24 {

    public static void isPerfect(int numbers) {
        int total = 0;
        String factor = "";
        for (int count = 1; count < numbers; count++) {
            int remiander = numbers % count;
            if (remiander == 0) {
                total = total + count;
                factor= factor+ " " + count;
            }
        }
        if (total == numbers){
            System.out.println(numbers + " is a perfect Number");
            System.out.println("The factors are" + factor);
        }
        else {

            System.out.println(numbers+ " is not a perfect number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly input the numbers to know if its Perfect or not");
        int numbers = input.nextInt();
        isPerfect(numbers);
    }
}