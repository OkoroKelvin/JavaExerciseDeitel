package semicolonTest.tddClass;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

            System.out.println("what is" + number1 + "-" + number2 + "?" );
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();

            if (number1 - number2 == answer) {
                System.out.println("You are correct!" );
            } else {
                System.out.println("Your answer is wrong" );
                System.out.println(number1 + "-" + number2 + "should be" + (number1 - number2));
            }
        }
    }


    /*
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salesValue = input.nextDouble();
        double commission = (6/100 * salesValue) + 200;
        double totalSalesValue = salesValue+commission;
        System.out.println("Your Sales Earnings for this week is: "+ totalSalesValue);

    }
     */