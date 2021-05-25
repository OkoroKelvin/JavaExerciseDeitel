package semicolon.tddClass;
import java.util.Scanner;

public class Kata {
    public String grade;
    public int totalPrice;
    public int costPrice;
    public int sellerPrice;
    public int resellerProfit;


    public static void main(String... args) {
        int num1;
        System.out.println("kindly input three numbers");
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        int newNum1 = num1 / 100;
        int newNum2 = (num1 / 10) % 10;
        int newNum3 = (num1 % 10);


        if (newNum1 == newNum3) {
            System.out.println("This is a Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }
    }

    public String showGrade(int score) {
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80 && score <= 89) {
            grade = "B";
        } else if (score >= 70 && score <= 79) {
            grade = "C";
        } else if (score >= 60 && score <= 69) {
            grade = "D";
        } else if (score >= 40 && score <= 59) {
            grade = "E";
        } else if (score <= 39) {
            grade = "F";
        }
        return grade;
    }

    public int calculateTotalPrice(int copies) {
        if (copies >= 1 && copies <= 4) {
            totalPrice = copies * 1500;
        } else if (copies >= 5 && copies <= 9) {
            totalPrice = copies * 1400;
        } else if (copies >= 10 && copies <= 29) {
            totalPrice = copies * 1200;
        } else if (copies >= 30 && copies <= 49) {
            totalPrice = copies * 1100;
        } else if (copies >= 50 && copies <= 99) {
            totalPrice = copies * 1000;
        } else if (copies >= 100 && copies <= 199) {
            totalPrice = copies * 900;
        } else if (copies >= 200) {
            totalPrice = copies * 800;
        }
        return totalPrice;
    }

    public int calculateProfit(int copies) {
        if (copies >= 1 && copies <= 4) {
            costPrice = 1500;
            sellerPrice = 2000;
            resellerProfit = (sellerPrice * copies) - (costPrice * copies);
        }else
            if (copies >= 5 && copies <= 9) {
                costPrice = 1400;
                sellerPrice = 2000;
                resellerProfit = (sellerPrice * copies) - (costPrice * copies);
            }
        else
            if(copies >= 10 && copies <= 29){
                costPrice=1200;
                sellerPrice = 2000;
                resellerProfit = (sellerPrice * copies) - (costPrice * copies);
            }
        else
            if(copies >= 30 && copies <= 49){
                costPrice=1100;
                sellerPrice = 2000;
                resellerProfit = (sellerPrice * copies) - (costPrice * copies);
            }
        else
            if(copies>=50 && copies <=99){
                costPrice=1000;
                sellerPrice=2000;
                resellerProfit = (sellerPrice * copies) - (costPrice * copies);
            }
        else
            if (copies>=100 && copies<=199){
                costPrice=900;
                sellerPrice=2000;
                resellerProfit = (sellerPrice * copies) - (costPrice * copies);
            }
        else
            if (copies>=200){
                costPrice=800;
                sellerPrice=2000;
                resellerProfit = (sellerPrice * copies) - (costPrice * copies);
            }
        return resellerProfit;
    }
    public int calculateAmountOfFactor(int numberInput) {
        int factor = 1;
        int count = 0;
        while (factor <= numberInput) {
            if (numberInput % factor == 0) {
                count++;
            }
            factor++;
        }
        return count;
    }

}
