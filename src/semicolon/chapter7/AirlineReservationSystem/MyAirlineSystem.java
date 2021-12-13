package semicolon.chapter7.AirlineReservationSystem;

import java.util.Scanner;

public class MyAirlineSystem {

    public static void main(String[] args) {
        boolean[] seats = new boolean[10];
        System.out.println("Welcome to Ark-Airways");
        Scanner input = new Scanner(System.in);
        String keys = """
                press 1 for FirstClass Airline

                press 2 for SecondClass Airline

                """;

        System.out.println(keys);


        int userInput = input.nextInt();
        int occupiedSeats = 0;

        while (true) {

            switch (userInput) {
                case 1:
                    firstClassFlight(seats);
                    occupiedSeats+=1;
                    break;

                case 2:
                    System.out.println("This is economy seat");
                    economyFlight(seats);
                    occupiedSeats+=1;
                    break;
            }
            if(occupiedSeats == seats.length){
                break;
            }
            System.out.println(keys);
            userInput = input.nextInt();
        }
    }


    public static void firstClassFlight(boolean[] seats) {

        for (int seatNumber = 1; seatNumber <= (seats.length / 2); seatNumber++) {
            if (!seats[seatNumber - 1]) {
                seats[seatNumber-1] = true;
                System.out.printf("First Class. Seat# %d\n", (seatNumber-1));
                break;
            }
        }
        
    }



    public static void economyFlight(boolean[] seats) {
        for (int seatNumber = 6; seatNumber <= (seats.length); seatNumber++) {
            if (!seats[seatNumber - 1]) {
                seats[seatNumber-1] = true;
                System.out.printf("Economy. Seat# %d\n", (seatNumber-1));
                break;
            }
        }
    }

}
