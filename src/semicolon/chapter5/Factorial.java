package semicolon.chapter5;

public class Factorial {

        public static void main(String[] args) {

            String str = "123";
            System.out.println(turn(str));
        }


        public static String turn(String words) {
            if (words == null) {
                throw new IllegalArgumentException("Null is not valid input");
            }

            StringBuilder builder = new StringBuilder();

            char[] chars = words.toCharArray();


            for (int i = chars.length - 1; i >= 0; i--)
                builder.append(chars[i]);

            return builder.toString();
        }
    }
