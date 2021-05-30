package semicolon.chapter5;
import java.util.Scanner;

public class TheTwelveDaysOfChristmas {
    public static void main(String[] args) {
        int days;

        Scanner input = new Scanner(System.in);
        System.out.println("Input a day figure between 1-12, press 13 to end lyrics");
        days=input.nextInt();

        while (days <= 12) {


            switch (days) {
                case 1:
                    System.out.println("On the first day of Christmas my true love sent to me");
                    break;
                case 2:
                    System.out.println("On the second day of Christmas my true love sent to me");
                    break;
                case 3:
                    System.out.println("On the third day of Christmas my true love sent to me");
                    break;
                case 4:
                    System.out.println("On the fourth day of Christmas my true love sent to me");
                    break;
                case 5:
                    System.out.println("On the fifth day of Christmas my true love sent to me");
                    break;
                case 6:
                    System.out.println("On the sixth day of Christmas my true love sent to me");
                case 7:
                    System.out.println("On the seventh day of Christmas my true love sent to me");
                    break;
                case 8:
                    System.out.println("On the eight day of Christmas my true love sent to me");
                    break;
                case 9:
                    System.out.println("On the ninth day of Christmas my true love sent to me");
                    break;
                case 10:
                    System.out.println("On the tenth day of Christmas my true love sent to me");
                    break;
                case 11:
                    System.out.println("On the eleventh day of Christmas my true love sent to me");
                    break;
                case 12:
                    System.out.println("On the twelfth day of Christmas my true love sent to me");
                    break;

            }

            switch (days) {
                case 12:
                    System.out.println("Twelve drummers drumming ");

                case 11:
                    System.out.println("Eleven pipers pipping");

                case 10:
                    System.out.println("Ten lords a -leaping");

                case 9:
                    System.out.println("Nine ladies dancing");

                case 8:
                    System.out.println("Eight maids a -milking ");

                case 7:
                    System.out.println("Seven swams a - swimming ");

                case 6:
                    System.out.println("Six geese a  -laying ");

                case 5:
                    System.out.println("Five gold rings ");

                case 4:
                    System.out.println("Four calling birds ");

                case 3:
                    System.out.println("Three french hens ");

                case 2:
                    System.out.println("Two turtle doves and");

                case 1:
                    System.out.println("A patridge in a pear tree");

            }
            System.out.println("Input a day figure between 1-12, press 13 to end lyrics");
            days=input.nextInt();
        }


    }
}