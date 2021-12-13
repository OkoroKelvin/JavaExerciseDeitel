package semicolon.chapter2;

public class DigicorePractice {

    public String getPrimeNumber(int number) {
        int divisor = 2;
        int remainder;
        String primeFactors = " ";
        while(number!=1){
            remainder = number% divisor;
            if(remainder == 0){
                primeFactors += divisor + " ";
            }else{
                divisor = divisor + remainder;
            }
        }

        return primeFactors;
    }

}
