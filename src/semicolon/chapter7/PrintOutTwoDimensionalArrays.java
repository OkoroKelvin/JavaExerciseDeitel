package semicolon.chapter7;

public class PrintOutTwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int [][] array2 = {{1, 2}, {3}, {4, 5, 6}};
        for(int row = 0; row < array1.length;row++){
            for (int column = 0;column < array1[row].length;column++ ){
                System.out.print(array1[row][column]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for(int row = 0; row < array2.length;row++){
            for (int column = 0;column < array2[row].length;column++ ){
                System.out.print(array2[row][column]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
