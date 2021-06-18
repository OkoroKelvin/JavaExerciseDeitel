package semicolon.tddClass;
import java.util.Scanner;
public class BikeApplication {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Scanner inputCollector = new Scanner(System.in);
        int userInput;
        String prompt = """
                Enter 1 for Turn on
                Enter 2 for Accelerate
                Enter 3 for Decelerate
                Enter 4 to Turn Off/Exit Application
                """;
        do
        {
        System.out.println(prompt);
        userInput = inputCollector.nextInt();

            userInput = inputCollector.nextInt();
            System.out.println(prompt);

            switch (userInput) {
                case 1:
                    bike.setOn(true);
                    System.out.println("Bike is on is :" + bike.isOn());
                    break;
                case 2:
                    bike.speedUp();
                    System.out.println("Bike speed is:" + bike.getSpeedInKmPerHour());
                    break;
                case 3:
                    bike.decreaseSpeed();
                    System.out.println("Bike speed is :" + bike.getSpeedInKmPerHour());
                    break;
                case 4:
                    bike.setOn(false);
                    System.out.println("Bike is off is " + bike.isOn());
                default:
                    System.out.println("Kindly put in the Numbers in the range");
            }

        }
        while(userInput!=4);
    }
}
