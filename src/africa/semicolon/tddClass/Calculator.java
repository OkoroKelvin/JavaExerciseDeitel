package africa.semicolon.tddClass;

public class Calculator {
    public int add(int firstNumber, int secondNumber) {
        int sumOfArguments = firstNumber + secondNumber;
        return sumOfArguments;

    }

    public int multiply(int firstNumber, int secondNumber) {
        int product= firstNumber*secondNumber;
        return product;
    }

    public int substract(int firstNumber, int secondNumber) {
        int sub= firstNumber-secondNumber;
        return sub;
    }

    public int divide(int firstNumber, int secondNumber) {
        int by= firstNumber/secondNumber;
        return by;
    }
}
