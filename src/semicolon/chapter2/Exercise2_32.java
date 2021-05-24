package semicolon.chapter2;
//Negative, Positive and Zero Values
import java.util.Scanner;
public class Exercise2_32 {
    public static void main(String...args) {
        int inputValue;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number from 0 to 10 : ");
        inputValue = input.nextInt();

        if (inputValue == -inputValue) {
            System.out.println("Number is negative");
        } else
            if (inputValue == inputValue) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is zero");

        }
    }
}
