package semicolon.chapter14;

public class Testing {
    public static void main(String[] args) {
        char[] chat = new char[27];
        String you = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int count = you.length()-1; count >= 0; count--){
            //System.out.println(you.charAt(count));
        }
        you.getChars(0,10,chat,0);
        System.out.println(chat);
    }
}