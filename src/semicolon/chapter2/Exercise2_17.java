package semicolon.chapter2;
import java.util.Scanner;
//Arithmetic, Smallest and Largest
public class Exercise2_17 {

    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
        int sum;
        int average;
        int product;
        int smallest;
        int largest;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        num1 = input.nextInt();

        System.out.println("Enter Second Integer");
        num2=input.nextInt();

        System.out.println("Enter third Integer");
        num3=input.nextInt();


        sum = num1 + num2 + num3;

        average = (sum) / 3;

        product = num1 * num2 * num3;

        smallest = num1;
        if (num2 <= smallest)
        {smallest = num2;}



        if (num3 <= smallest)
        smallest = num3;
        largest = num1;


        if (num2 >=largest)
        largest = num2;


        if (num3 >= largest)
        {largest = num3;}

        System.out.printf("Sum is %d\n", sum);
        System.out.printf("Average is %d\n", average);
        System.out.printf("Product is %d\n", product);
        System.out.printf("Smallest is %d\n", smallest);
        System.out.printf("Largest is %d\n", largest);
    }

}

