package semicolon.chapter4;
import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gallonsUsed;
        int milesDriven;
        float milesPerGallon;
        float totalMilesPerGallon = 0;
        int trips=1;


        System.out.println("Kindly input number gallons Used for Trip "+trips+", or Press -1 to Exit");
        gallonsUsed=input.nextInt();

        while(gallonsUsed!=-1){

            System.out.println("Kindly input number Miles Driven for Trip "+trips);
            milesDriven=input.nextInt();

            milesPerGallon=(milesDriven)/gallonsUsed;
            System.out.println("The milesPerGallon for Trip "+trips+" is: "+milesPerGallon);


            totalMilesPerGallon=totalMilesPerGallon+milesPerGallon;

            trips++;


            System.out.println("Kindly input number gallons Used for Trip "+trips+", or Press -1 to Exit");
            gallonsUsed=input.nextInt();

        }
        System.out.println("The Total Miles Per Gallon is for all Trips : "+ totalMilesPerGallon);
    }
}
