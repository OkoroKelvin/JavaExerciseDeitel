package semicolon.chapter2;
//Body Mass Index Calculator
import java.util.Scanner;
public class Exercise2_33 {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pound : ");
        double userWeight = input.nextInt();

        System.out.print("Enter your height in inches : ");
        double userHeight = input.nextInt();

        System.out.println();
        System.out.println("BMI VALUES");

        double BMI = (userWeight * 703) / (userHeight * userHeight);
        if (BMI < 18.5) {
            System.out.println("Underweight : less than 18.5");
        } else if (BMI > 18.5 && BMI <= 24.9) {
            System.out.println("Normal :  between 18.5 and 24.9");
        } else if (BMI > 24.9 && BMI <= 29.9) {
            System.out.println("Overweight : between 25 and 29.9");
        } else {
            System.out.println("Obese: 30 or greater");


        }
    }
}