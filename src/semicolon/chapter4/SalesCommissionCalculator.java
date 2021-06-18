package semicolon.chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salesValue = input.nextDouble();
        double commission = (6/100 * salesValue) + 200;
        double totalSalesValue = salesValue+commission;
        System.out.println("Your Sales Earnings for this week is: "+ totalSalesValue);

    }
}
