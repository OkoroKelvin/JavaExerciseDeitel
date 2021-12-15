package semicolon.chapter7;

public class VariableLengthArgument {

    public static void main(String[] args) {

        System.out.printf("The product of 5 * 5 is: %d %n", product(5, 5));
        System.out.printf("The product of 2 * 2 * 2 is: %d %n", product(2, 2, 2));
        System.out.printf("The product of 5 * 10 is: %d %n", product(5, 10));

    }

    public static int  product(int...numbers){
        int total = 1;
        for(int num : numbers ){
            total *= num;
        }
        return total;
    }

}
