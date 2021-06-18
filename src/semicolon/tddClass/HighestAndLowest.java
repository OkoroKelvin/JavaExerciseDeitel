package semicolon.tddClass;
import java.util.Scanner;
public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println("Enter the number88 ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int largest = number;
        int smallest = number;
        int counter = 1;
        while (counter < 10) {
            System.out.println("Enter the number: ");
            number = input.nextInt();
            if (number > largest)//If largest is small, set current number as largest
                largest = number;
            if (number < smallest)
                smallest=number;
            counter++;
        }
        System.out.println("The largest number is "+largest);
        System.out.println("The Smallest number is "+smallest );
    }
}