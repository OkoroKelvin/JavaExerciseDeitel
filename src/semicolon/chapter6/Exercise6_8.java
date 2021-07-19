package semicolon.chapter6;

import java.util.Scanner;

/*
A parking garage charges a $2.00 minimum fee to park for up to three
hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
longer than 24 hours at a time. Write an application that calculates and displays the parking charges
for each customer who parked in the garage yesterday. You should enter the hours parked for each
customer. The program should display the charge for the current customer and should calculate and
display the running total of yesterday’s receipts. It should use the method calculateCharges to determine
the charge for each customer.
 */
public class Exercise6_8 {
    public static void main(String[] args) {
        calculateCharges();

    }
    public static double calculateCharges() {
        Scanner input = new Scanner(System.in);
        double parkCharge = 0;
        System.out.println("Kindly input the parked hour for yesterday and press -1 to calculate for present charge:");

        int hours = input.nextInt();
            if (hours >= 4 && hours <= 23) {
                parkCharge = 2.00 * hours +(0.50 * (hours - 3));
            } else if (hours >= 1 && hours <= 3) {
                parkCharge = 2.00 * hours;
            } else if (hours == 24) {
                parkCharge = 10.00;
            }
        System.out.printf("The park charge is %.2f ", parkCharge);
        return parkCharge;
        }

}