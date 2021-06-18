package semicolon.chapter5;

public class PrimeFactorsOfNumber {

    public String findPrimeFactor(int number) {
        int divisor = 2;
        int remainder;
        String primeFactors = "";
        while (number != 1) {
            remainder = number % divisor;
            if (remainder == 0) {
                number = number / divisor;
                primeFactors += divisor + ",";
            } else {
                divisor = divisor + remainder;
            }
        }

        return primeFactors.substring(0, primeFactors.length()-1);

    }

}
