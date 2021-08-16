//package semicolon.chapter7;
//
//import java.util.Scanner;
//
//public class CheckSudokuSolution {
//    public static void main(String[] args) {
//
//    }
//
//    public static int[][] readASolution() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a Sudoku puzzle solution: ");
//        int[][] grid = new int [9][9];
//        for (int i=0; i <9;i++){
//            for (int j=0; j<9; j ++){
//                grid[i][j] = input.nextInt();
//            }
//        }
//        return grid;
//    }
//    public static boolean isValid(int[][] grid){
//        for(int i = 0; i<9; i++){
//            for (int j=0;j<9;j++){
//                if(grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j,grid))
//                    return false;
//
//            }
//        }
//    }
//
//}