package semicolon.chapter7.exercise7_11;

public class ArrayBonus {
    public static void main(String[] args) {

        int bonus[] = new int[15];

        for(int count = 0; count < bonus.length; count++) {
            bonus[count] = count + 1;
            System.out.println(bonus[count]);
        }
    }

}
