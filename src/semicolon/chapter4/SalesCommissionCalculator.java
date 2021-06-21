package semicolon.chapter4;
import java.util.Scanner;
public class SalesCommissionCalculator {
    public static void main(String[] args) {
        double NinePerCentSumTotalValue;
        double salesCommission;
        double sumTotalValue = 0;
        int item;
        double value;
        int numberOfItems;
        double totalValue = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("""
                To get Sale's person earnings, type in sales for the week
                and press -1 to exit and see the earnings
                """);
        System.out.println("Kindly input type of item or press -1 to exit calculator: ");
        item = input.nextInt();



        while (item != -1) {

            if (item == 1)  {
                System.out.println("Kindly input the number of item sold for Item 1");
                numberOfItems = input.nextInt();

                if(numberOfItems >0) {
                    value = 239.99;
                totalValue = numberOfItems * value;
                }

            } else
                if (item == 2) {
                System.out.println("Kindly input the number of item sold for Item 2");
                numberOfItems = input.nextInt();

                if(numberOfItems>0){
                    value = 129.75;
                totalValue = numberOfItems * value;}

            } else
                if (item == 3) {
                System.out.println("Kindly input the number of item sold for Item 3");
                numberOfItems = input.nextInt();

                if(numberOfItems>0){value = 99.95;
                totalValue = numberOfItems * value;}

            }else
            if (item == 4) {
                System.out.println("Kindly input the number of item sold for Item 4");
                numberOfItems = input.nextInt();

                if(numberOfItems > 0) {
                    value = 350.89;
                    totalValue = numberOfItems * value;
                }

            }

            sumTotalValue= sumTotalValue+ totalValue;
            System.out.println("Kindly input type of item or press -1 to exit calculator");
            item = input.nextInt();
        }
        NinePerCentSumTotalValue = (9*sumTotalValue)/100 ;

        salesCommission = NinePerCentSumTotalValue + 200;

        System.out.printf("Total value sold is: %.2f%n%n",sumTotalValue);

        System.out.printf("Your Sales Commission is: %.2f%n%n", salesCommission);

    }
}
