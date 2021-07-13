package semicolon.arrayPractice;
/*
1. Create a list of strings in the main method.
2. Add 10 strings to it from the keyboard, but only add them to the beginning of the list, not the end.
3. Use a loop to display the contents, each value on a new line.

Requirements:
•	Declare a string list variable and immediately initialize it.
•	The program should read 10 strings from the keyboard and add them to the list.
•	The program should add lines to the beginning of the list.
•	The program should display the list, each value on a new line.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class codeGym_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<10;i++) {
            String string2 = input.next();
            list.add(0,(string2));
        }
        for (String str : list ){
            System.out.println(str);
        }


    }

}
