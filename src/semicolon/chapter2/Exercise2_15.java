package semicolon.chapter2;
import java.util.Scanner;
//Arithmetic
public class Exercise2_15 {
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int sum;
        int product;
        int difference;
        int division;

        System.out.print("Type in first number: ");
        num1 = input.nextInt();
        System.out.print("Type in second number: ");
        num2 = input.nextInt();


        sum = num1 + num2;
        System.out.printf("%s%d%n", "The sum is: ", sum);


        product = num1 * num2;
        System.out.printf("%s%d%n", "The product is: ", product);


        difference = num1 - num2;
        System.out.printf("%s%d%n", "The difference is: ", difference);

        division = num1 / num2;
        System.out.printf("%s%d%n", "The division is: ", division);
    }

}
