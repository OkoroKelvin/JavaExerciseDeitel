package semicolon.chapter6;

public class ConversionOfDecimalToBinaryOctaHexa {
    public static String convertDecimalToBinary(int decimal, int baseNumber){
        String newBaseNumber = "";

        for (int baseTen = decimal; baseTen != 0; baseTen = baseTen / baseNumber) {
            int remainder = baseTen % baseNumber;
            newBaseNumber = remainder + newBaseNumber;
        }

        return newBaseNumber;
    }
    public static String convertDecimalToHexadecimal (int decimal) {
            String newBaseNumber = "";

            char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

            for (int numberInBase10 = decimal; numberInBase10 != 0; ) {

                int remainder = numberInBase10 % 16;

                numberInBase10 = numberInBase10 / 16;

                newBaseNumber = hex[remainder] + newBaseNumber;

            }
            return newBaseNumber;
        }


    public static void main(String[] args) {
        System.out.printf("%10s %10s %10s %10s%n", "Number", "Binary", "Octal", "Hexadecimal");
        for (int count=1;count<=256;count++){
            System.out.printf("%10d %10s %10s %10s%n", count, convertDecimalToBinary(count,2),
                    convertDecimalToBinary(count,8), convertDecimalToHexadecimal(count));
        }
    }
}
