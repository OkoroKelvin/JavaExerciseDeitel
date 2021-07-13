package semicolon.chapter5;

public class Factorials {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        long totalNumber = 1;

        for (int factorialNumber = 1; factorialNumber <=20; factorialNumber++) {
            totalNumber *= factorialNumber;
            System.out.printf("%d! -  %d%n", factorialNumber, totalNumber);
            }
        }
    }