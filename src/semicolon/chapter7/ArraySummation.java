package semicolon.chapter7;

public class ArraySummation {
    public static void main(String[] args) {
        //int [] numbers = new int[5]
        int[] numbers = {2, 3, 5, 6, 7, 8, 9, 5, 4, 3};
        int sum = 0;
        for (int count = 0; count < numbers.length; count++) {
            sum += numbers[count];
        }
        System.out.println("The sum of the array numbers is: "+sum);
    }
}
