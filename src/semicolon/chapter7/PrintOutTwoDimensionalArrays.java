package semicolon.chapter7;

public class PrintOutTwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] numbers = {{2,3,5},{0,5,9},{1,2,1}};

        for(int count=0; count <numbers.length;count++ ){
            for(int counter=0; counter<numbers.length;counter++) {
                System.out.print(numbers[count][counter]);
            }
            System.out.println();
        }
    }
}
