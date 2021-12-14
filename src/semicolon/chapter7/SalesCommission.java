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
        int[] frequency = new int[9];
        String[]rangeMoney = new String[9];
        rangeMoney[0] = "value<=299";
        rangeMoney[1] = "value>=300&&value<=399";
        rangeMoney[2] = "value>=400 && value <=499";
        rangeMoney[3] = "value>=500 && value <=599";
        rangeMoney[4] = "value>=600 && value <=699";
        rangeMoney[5] = "value>=700 && value <=799";
        rangeMoney[6] = "value>=800 && value <=899";
        rangeMoney[7] = "value>=900 && value <=999";
        rangeMoney[8] = " value 1,000 and over";

        fillArray(earnings);
        for (double value : earnings) {
            if(value<=299){
                ++frequency[0];
            }
            if(value>=300&&value<=399){
                ++frequency[1];
            }
            if(value>=400 && value <=499){
                ++frequency[2];
            }
            if(value>=500 && value <=599){
                ++frequency[3];
            }
            if(value>=600 && value <=699){
                ++frequency[4];
            }
            if(value>=700 && value <=799){
                ++frequency[5];
            }
            if(value>=800 && value <=899){
                ++frequency[6];
            }
            if(value>=900 && value <=999){
                ++frequency[7];
            }if(value>=1000){
                ++frequency[8];
            }
        }

        System.out.printf("%s%21s%n%n", "Salaries", "Salespeople");
        for(int i = 0; i < frequency.length; i++){
            System.out.printf("%s%21s%n%n", rangeMoney[i], frequency[i]);
        }
    }
}