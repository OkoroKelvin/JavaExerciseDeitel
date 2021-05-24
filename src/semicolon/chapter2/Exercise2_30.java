package semicolon.chapter2;

import java.util.Scanner;
public class Exercise2_30 {
    public static void main(String...args){
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number with five digits: ");

        num = input.nextInt();

        if ( (num >= 10000) && (num <= 99999) )
        {
            System.out.printf("%d   ", (num / 10000));
            System.out.printf("%d   ", (num / 1000) % 10);
            System.out.printf("%d   ", (num / 100) % 10);
            System.out.printf("%d   ", (num % 100) / 10);
            System.out.printf("%d   ", (num % 10));
        }

        if (num > 99999) {
            System.out.println("Numbers more than five digits.");
        }

        if (num <= 9999){
            System.out.println("Numbers less than five digits.");
        }

    }

}
