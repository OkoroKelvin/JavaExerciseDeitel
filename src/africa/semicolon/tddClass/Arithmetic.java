package africa.semicolon.tddClass;
import java.util.Scanner;
public class Arithmetic {
    public static void main(String... args){
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("kindly put in first number");
        num1= input.nextInt();
        System.out.println("kindly put second number");
        num2= input.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int divide = num1/num2;

        System.out.println("The Sum is "+ sum);
        System.out.println("The Product is"+ product);
        System.out.println("The division is "+ divide);

    }
}
