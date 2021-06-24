package semicolon.chapter8;
//Exception practice
public class TimeClient {
    public static void main(String[] args) {
        Time time = new Time();
        try {
            time.setTimeWith(13, 48, 2039);
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
       }
    }
}
