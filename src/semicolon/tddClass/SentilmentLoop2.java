package semicolon.tddClass;
import java.util.Scanner;
public class SentilmentLoop2 {
    public static void main(String...args){

        int counter =0;
        int total = 0;
        System.out.println("enter any number or -1 to exit "+counter);
        Scanner input=new Scanner(System.in);
        int userScore = input.nextInt();

        while(userScore!= -1){

            total = total + userScore;
            System.out.println("enter any number or -1 to exit  "+counter);
            userScore = input.nextInt();
            counter++;
        }
        System.out.println("The sum is "+ total);
        System.out.println("Average is : "+total/(counter*1.0));
    }

}
