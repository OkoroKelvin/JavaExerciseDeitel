package semicolon.chapter7;

public class CommandSum {
    public static void main(String args[]) {
        double[] array = new double[args.length];
        double total = 0;
        double argsValue;

        for(int count = 0; count < args.length; count++) {
            argsValue = Double.parseDouble(args[count]);
            array[count] = argsValue;
        }
        for(double value: array){
            total += value;
        }
        System.out.println("Total is: " + total);

    }
}
