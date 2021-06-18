package semicolon.tddClass;
import java.util.Scanner;
public class AirConditionerApplication {
    public static void main(String[] args) {
        AirConditioner breeze =new AirConditioner(false,"scanfrostHD",16);
        Scanner input = new Scanner(System.in);

        int remoteNumber = 1;
        String prompt = """
                Enter 1 to Power On Ac
                Enter 2 to Increase temperature
                Enter 3 to Decrease temperature
                Enter 4 to Turnoff Ac
                """;


        System.out.println(prompt);
        System.out.println("Choose an option");

        while (remoteNumber>0 && remoteNumber<=4){

            remoteNumber=input.nextInt();

            switch(remoteNumber){
                case 1:
                    breeze.setOn();
                    System.out.println("Welcome to scanfrostHD, AC is On, Temperature is: "+breeze.getTemperature());
                    break;
                case 2:
                    breeze.increaseTemperature();
                    System.out.println("Current temperature is: "+breeze.getTemperature());
                    break;
                case 3:
                    breeze.decreaseTemperature();
                    System.out.println("Current temperature is: "+breeze.getTemperature());
                    break;
                case 4:
                    breeze.setOn();
                    breeze.setOn();
                    breeze.isOn();
                    System.out.println("Ac is off");
                    break;

                    default:
                    System.out.println("Kindly use number key in range of 1-4");


            }
            System.out.println("Choose an option");
        }
    }
}
