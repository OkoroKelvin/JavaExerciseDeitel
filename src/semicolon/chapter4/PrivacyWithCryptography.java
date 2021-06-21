package semicolon.chapter4;

import java.util.Scanner;

public class PrivacyWithCryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your 4 digit data");
        int data= input.nextInt();

        int data1 = data/1000;  //1      //0
        int data2 = data/100%10;//2      //1
        int data3 = data/10%10; //3      //8
        int data4 = data%10;    //4      //9

        int newData1= (7+  data1)%10;   //8
        int newData2= (7 + data2)%10;   //9
        int newData3= (7 + data3)%10;   //0
        int newData4= (7 + data4)%10;   //1


        System.out.println(newData3+""+newData4+""+newData1+""+newData2);

    }

}
