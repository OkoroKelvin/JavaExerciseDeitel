package semicolon.chapter6;

import java.util.ArrayList;

public class Exercise6_21{
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add(0,"Yellow");
        items.add("Black");
        items.add("Purple");
        items.add(1,"Sexier");

       // for (int i =0;i < items.size();i++){
        items.remove(1);
        for(int i=0; i<items.size();i++){
            System.out.println(items.get(i));
        }
        }
    }

