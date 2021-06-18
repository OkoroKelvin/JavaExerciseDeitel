package semicolon.tddClass;
import java.util.Scanner;
public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);








//        int sum=0;
//        System.out.println("Input numbers between 1 - 30");
//        System.out.println("Input Start number");
//        int startNumber = input.nextInt();
//        System.out.println("Input End number");
//        int endNumber = input.nextInt();
//        while(startNumber<=endNumber){
//            int moduleBy3 = startNumber%3;
//            if (moduleBy3 == 0){
//                System.out.println(startNumber);
//               sum+=startNumber;
//            }
//            startNumber++;
//        }
//        System.out.println("The sum total of number divisible by 3 is:  "+ sum);









//        int userInput = input.nextInt();
//        int highestNumber = userInput;
//        int lowestNumber = userInput;
//
//        while(userInput != -1){
//            if(userInput> highestNumber){
//                highestNumber=userInput;
//            }
//            if(userInput<lowestNumber){
//                lowestNumber=userInput;
//            }
//            System.out.println("Kindly type in your numbers and press -1 to stop");
//            userInput = input.nextInt();
//        }
//        int sum = highestNumber+lowestNumber;
//        System.out.println("The sum of the extremes are: "+ sum);

//        int count =1;
//        for (;count <=10; count ++){
//            if (count ==5){
//                continue;
//            }
//            System.out.printf("%d   ",count);
//        }
//        System.out.printf("%nBroke out of loop at count = %d%n", count);
















//       int total = 0;
//       int gradeCounter = 0;
//       int aCount = 0;
//       int bCount = 0;
//       int cCount = 0;
//       int dCount = 0;
//       int fCount = 0;
//
//       Scanner input = new Scanner(System.in);
//
//        System.out.printf("%s%n%s%n   %s%n   %s%n", "Enter the integer grades in the range 0-100.", "Type the end-of-file indicator to terminate input:","On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter","On windows type <Ctrl> z then press Enter");
//        while (input.hasNext()){
//            int grade = input.nextInt();
//            total += grade;
//            ++gradeCounter;
//
//            switch (grade /10){
//                case 9:
//                case 10:
//                    ++aCount;
//                    break;
//                case 8:
//                    ++bCount;
//                    break;
//                case 7:
//                    ++cCount;
//                    break;
//                case 6:
//                    ++dCount;
//                    break;
//                default:
//                    ++fCount;
//                    break;
//            }
//       }
//        System.out.printf("%nGrade Report: %n");
//
//        if (gradeCounter!=0) {
//            double average = (double) total / gradeCounter;
//
//            System.out.printf("Total of the %.2f%n", average);
//            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
//                    "Number of student who received each grade:",
//                    "A: ", aCount,
//                    "B: ", bCount,
//                    "C: ", cCount,
//                    "D: ", dCount,
//                    "F: ", fCount);
//        }
//        else
//            System.out.println("No grade were entered");
        }
    }
