package semicolon.tddClass;
import java.util.Scanner;
public class AlmightyFomular {
    public static void main(String[] args) {
        //Discriminant is represented as D
        System.out.println("Input your variable of b,c,a");
        Scanner input = new Scanner(System.in);
        System.out.println("Input digits for a");
        double a=input.nextDouble();
        System.out.println("Input digits for b");
        double b=input.nextDouble();
        System.out.println("Input digits for c");
        double c=input.nextDouble();


        double D =b*b-4*a*c;

        if (D<0){
            System.out.println("The discriminant is negative, thus produces no real solutions ");


        }else
            if(D==0){
                System.out.println("The discriminant is zero, therefore gives out only one real solution");
                double root3=-b/2*a;
                System.out.printf("The one real solution is %.2f ",root3);


        }else
            if(D>0){
                System.out.println("The discriminant is positive, therefore produces 2 roots(real solutions)");
                double root1=(-b+Math.sqrt(D) )/2*a;
                double root2=(-b-Math.sqrt(D) )/2*a;
                System.out.println("The roots are :"+"root1= "+root1+" "+"root2= "+root2);

            }


    }
}
