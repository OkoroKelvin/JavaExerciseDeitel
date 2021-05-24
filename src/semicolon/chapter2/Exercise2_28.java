package semicolon.chapter2;
//Diameter, Circumference and Area of a Circle
import java.util.Scanner;
public class Exercise2_28 {
    public static void main(String...args){
        int radius;
        double diameter;
        double circumference;
        double area;

        Scanner input=new Scanner(System.in);

        System.out.println("Application to calculate the diameter,circumference and area of a circle");
        System.out.println("Kindly enter your radius: ");
        radius = input.nextInt();

        diameter = 2*radius;
        circumference=3.14159*2*radius;
        area=3.14159*radius*radius;

        System.out.println("Diameter is "+diameter);

        System.out.println("Area is "+area);

        System.out.println("Circumference is "+ circumference);

    }
}
