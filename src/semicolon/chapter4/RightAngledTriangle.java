package semicolon.chapter4;

import java.util.Scanner;


public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in your base length");
     int baseOfTriangle= input.nextInt();

        for(int length =1; length<=baseOfTriangle;length++){
            for (baseOfTriangle=length;baseOfTriangle<=length;baseOfTriangle++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
