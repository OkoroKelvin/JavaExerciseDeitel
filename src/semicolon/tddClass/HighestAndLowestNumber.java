package semicolon.tddClass;

import java.util.Scanner;
public class HighestAndLowestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Numbers to check of");
        int currentNumber=input.nextInt();
        int lowestNumber=currentNumber;
        int highestNumber=currentNumber;
        int count=1;
        while (count<10)
        {
            System.out.println("Enter the Numbers to check of");
            currentNumber=input.nextInt();

            if(currentNumber>highestNumber)
            {highestNumber=currentNumber;}

            if (currentNumber<lowestNumber)
        {lowestNumber=currentNumber;}

            count++;
    }
        System.out.println("This is the lowest Number"+ highestNumber);
        System.out.println("This is the highest Number"+ lowestNumber);
    }
}
