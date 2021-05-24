package semicolon.chapter2;
import java.util.Scanner;
//Comparing Integers
public class Exercise2_16 {
    public static void main(String... args) {
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.printf("%d is larger than %d\n",num1,num2);}


        if (num1 < num2) {
            System.out.printf("%d is larger than %d\n", num2, num1);}

            if (num1 == num2){
                System.out.println("These numbers are equal");}

    }

}
