package semicolon.chapter7;

public class CommandLineArguments {
    public static void main(String[] args) {
        if (args.length == 3) {

            int argsLenght = Integer.parseInt(args[0]);
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            int[] array = new int[argsLenght];
            for (int count = 0; count < array.length; count++) {
                array[count] = initialValue + increment * count;
            }
            System.out.printf("%s%10s%n", "Index", "Values");
            for (int count = 0; count < array.length; count++)
                System.out.printf("%02d%13s%n", count, array[count]);
        } else if (args.length != 3) {
            System.out.printf("%s%n%n%s%10s%n", "No argument, default lenght is 10", "Index", "Values");
            int[] array = new int[10];

            for (int count = 0; count < array.length; count++) {
                System.out.printf("%02d%13s%n", count, array[count]);
            }

        }
    }
}

