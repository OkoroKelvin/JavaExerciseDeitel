package semicolon.chapter7;

import java.util.Scanner;

public class DuplicateElimination {

    public static void main(String[] args) {
        displayArray();
    }

    public static boolean checkDuplicate(int[] array, int number) {
        for (int value : array) {
            if (value == number) {
                return true;
            }
        }
        return false;
    }

    public static void displayArray() {
        Scanner input = new Scanner(System.in);
        int[] arrayValue = new int[5];
        int userInput;
        for(int count = 0; count < arrayValue.length; count++) {
            System.out.println("Enter number: ");
            userInput = input.nextInt();

            if((checkDuplicate(arrayValue,userInput) == false)){
                arrayValue[count] = userInput;
                for(int eachValue : arrayValue){
                    if(eachValue != 0){
                        System.out.printf("%d", eachValue);
                    }
                    System.out.println();

                }
            }
        }
    }
}


