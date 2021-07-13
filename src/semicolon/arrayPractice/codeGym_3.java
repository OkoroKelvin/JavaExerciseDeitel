package semicolon.arrayPractice;

import java.util.ArrayList;
import java.util.Scanner;

/*
1. Create a list of strings.
2. Add 5 strings from the keyboard.
3. Do the following 13 times: remove the last string and insert it at the beginning.
4. Use a loop to display the resulting list, each value on a new line.

Requirements:
•	Declare a string list variable and immediately initialize it.
•	The program should read 5 strings from the keyboard.
•	Remove the last string and insert it at the beginning. Rinse and repeat 13 times.
•	The program should display the list, each value on a new line.
 */
public class codeGym_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = input.next();
            list.add(s);
        }

        for (int i = 0; i < 13; i++) {
            String s = list.remove(4);//5-1
            list.add(0, s);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
