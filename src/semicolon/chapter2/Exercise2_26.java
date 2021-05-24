package semicolon.chapter2;
//Multiples
import java.util.Scanner;
public class Exercise2_26 {
    public static void main(String...args){
        Scanner input = new Scanner(System.in);

        System.out.println("Application to determine multiples of integers");

        int firstInteger;
        int secondInteger;


        System.out.print("Kindly input First Integer: ");
        firstInteger = input.nextInt();

        System.out.print("Kindly input Second Integer: ");
        secondInteger = input.nextInt();

        if (secondInteger % firstInteger == 0)
            System.out.println(firstInteger + " is a multiple of "+secondInteger);

        if (secondInteger %  firstInteger != 0)
            System.out.println(firstInteger + " is not a multiple of "+secondInteger);

    }
}
