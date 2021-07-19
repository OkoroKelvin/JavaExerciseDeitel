package semicolon.chapter7;

import java.util.Scanner;

public class rr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
       int fact = 1;
       for(; count >=1; count--){

           fact*=count;
       }
        System.out.println(fact);

    }
}
