package semicolon.arrayPractice;
/*1. Create a list of strings.
        2. Read 5 strings from the keyboard and add them to the list.
        3. Using a loop, find the shortest string in the list.
        4. Display the string.
        5. If there is more than one, display each on a new line.

        Requirements:
        •	Declare a string list variable and immediately initialize it.
        •	The program should read 5 strings from the keyboard and write them to the list.
        •	The program should display the shortest string.
        •	If several strings are the shortest, then you need to display each of them on a new line.
*/


import java.util.ArrayList;
import java.util.Scanner;

public class codeGym_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Kindly input string list for " + (1 + i));
            list.add(input.next());
        }
        String minSizeOfElement = list.get(0);


        for (String element : list) {
            if (element.length() < minSizeOfElement.length()) {
                minSizeOfElement = element;
            }
        }

        for (String element : list) {
            if (element.length() == minSizeOfElement.length()) {
                System.out.println("The lowest is " + element);
            }
        }

    }
}