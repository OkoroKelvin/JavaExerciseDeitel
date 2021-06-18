//package semicolon.chapter6;
//public class BinaryOctalHexadecimalNumbers {
//
//    public static void main(String[] args) {
//
//        for (int count = 1; count <= 256; count++) {
//
////            String newBaseNumber = "";
////
////            for (int baseTen = count; baseTen != 0; ) {
////
////
////                int remainder = baseTen % 2;
////
////                baseTen = baseTen / 2;
////
////                newBaseNumber = remainder + newBaseNumber;
////
////            }
//            System.out.println(count +" "+ convertDecimalToBinary(count));
//        }
//
////
////        for (int count = 1; count <= 256; count++) {
////
////            String newBaseNumber = "";
////
////            for (int numberInBase10 = count; numberInBase10 != 0; ) {
////
////                int remainder = numberInBase10 % 8;
////
////                numberInBase10 = numberInBase10 / 8;
////
////                newBaseNumber = remainder + newBaseNumber;
////
////            }
////            System.out.println(count +" "+ newBaseNumber);
////        }
////
////
////
////        for (int count = 1; count <= 256; count++) {
////            String newBaseNumber = "";
////            char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
////
////            for (int numberInBase10 = count; numberInBase10 != 0; ) {
////
////                int remainder = numberInBase10 % 16;
////
////                numberInBase10 = numberInBase10 / 16;
////
////                newBaseNumber = hex[remainder] + newBaseNumber;
////
////            }
////            System.out.println(newBaseNumber);
////        }
//    }
//
//   // public static String convertDecimalToBinary(int decimal){
//        String newBaseNumber = "";
//
//        for (int baseTen = decimal; baseTen != 0; baseTen = baseTen / 2) {
//            int remainder = baseTen % 2;
//            newBaseNumber = remainder + newBaseNumber;
//        }
//
//        return newBaseNumber;
//    }
//
//    public static String convertDecimalToOcta(int decimal){
//
//    }
//
//}