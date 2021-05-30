package semicolon.tddClass;

import java.util.Scanner;
public class SentinelLoop {
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);
        int usersNumber = 0;
        int count = 0;
        int total = 0;
        double average;


        while (usersNumber != -1) {
            System.out.println("Kindly input your number ");
            usersNumber = input.nextInt();
            if(usersNumber != -1) {
                total += usersNumber;
                count += 1;
            }
            }
        average = total * 1.0 / count;
        System.out.println("The average number " + average);
        System.out.println("The Sum of The number " + total);

        }



    }

