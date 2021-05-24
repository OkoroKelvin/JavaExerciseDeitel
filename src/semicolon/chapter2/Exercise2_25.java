package semicolon.chapter2;
//Odd or Even Exercise
import java.util.Scanner;
public class Exercise2_25 {
    public static void main (String...args){
        Scanner input= new Scanner(System.in);

        int inputNumber;

        System.out.println("Application to know Odd or Even numbers");
        System.out.println("Kinldy put in any number of your choice");

        inputNumber =input.nextInt();

        if (inputNumber % 2 == 0){
            System.out.println(inputNumber + " is an Even Number");}

        if (inputNumber % 2 != 0){
            System.out.println(inputNumber + " is an Odd Number");}

    }
}
