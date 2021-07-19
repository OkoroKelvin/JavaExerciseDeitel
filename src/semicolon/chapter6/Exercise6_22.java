package semicolon.chapter6;

import java.util.Scanner;

public class Exercise6_22 {
    public static double celsius(double fahrenheit) {

        double celsius = 5.0 / 9.0 * (fahrenheit - 32);

        return celsius;
    }
    public static double fahrenheitCon(double celsiusTemp){

        double fahrenheitTemp = 9.0 /5.0 * celsiusTemp + 32;

        return fahrenheitTemp;
    }

    public static void main(String[] args) {
        String prompt = """
                Welcome to TemPConvertApp
                To convert from Fahrenheit to Celsius press 1
                
                To convert from Celsius to Fahrenheit press 2
                                            
                """;
        System.out.println(prompt);

        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if(userInput ==1){
            System.out.println("To convert Fahrenheit to Celsius");

            System.out.println("Kindly input the figure of Fahrenheit");

            double fahrenheit = input.nextDouble();
            System.out.println("The value of "+fahrenheit +"fahrenheit to Celsius is :"+ fahrenheitCon(fahrenheit));


        }
        else if(userInput==2){
            System.out.println("To convert Celsius to Fahrenheit");

            System.out.println("Kindly input the figure of Celsius");

            double celsius = input.nextDouble();

            System.out.println("The value of "+celsius +"Celsius to fahrenheit is :"+ celsius(celsius));

        }
    }
}
