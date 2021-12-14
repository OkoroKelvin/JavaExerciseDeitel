package semicolon.chapter7;

import java.security.SecureRandom;

public class SalesCommission {
    static SecureRandom random = new SecureRandom();

    public static void fillArray(double[] array) {
        double grossSales;
        double totalEarnings;
        for (int count = 0; count < array.length; count++) {
            grossSales = 500 + random.nextInt(10_000);
            totalEarnings = grossSales * 0.09 + 200;
            array[count] = totalEarnings;
        }
    }

    public static void main(String[] args) {
        double[] earnings = new double[100];
        int[] frequency = new int[11];

        fillArray(earnings);
        for (double value : earnings) {
            if ((int) value / 100 < 10) {
                ++frequency[((int) value / 100)];
            } else {
                ++frequency[10];
            }
        }

        System.out.printf("%s%21s%n%n", "Salaries", "Salespeople");
        for (int count = 2; count < frequency.length; count++) {
            if(count<10){
                System.out.printf("$%3d-%3d", count * 100, count * 100 + 99);
                System.out.printf("%21d%n", frequency[count]);
            }else {
                System.out.printf("$%s  ", "1000 and over");
                System.out.printf("%13d%n", frequency[count]);
            }
        }
    }
}