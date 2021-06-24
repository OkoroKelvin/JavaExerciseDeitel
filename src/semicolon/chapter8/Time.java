package semicolon.chapter8;
//Exception practical
public class Time {
    private int hour;
    private int minute;
    private int second;

    public void setTimeWith(int hour, int minute, int second) {

        boolean hourIsInvalid = hour < 0 || hour >= 24;
        if (hourIsInvalid) throw new IllegalArgumentException("Invalid hour,\n Enter hour between 0 and 23");


        boolean minuteIsInvalid = minute < 0 || minute >= 60;
        if (minuteIsInvalid) throw new IllegalArgumentException("Invalid minute,\n Enter minute between 0 and 60");

        boolean secondIsInvalid = second < 0 || second >= 60;
        if (secondIsInvalid) throw new IllegalArgumentException("Invalid second,\n Enter second between 0 and 60");


        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
}
