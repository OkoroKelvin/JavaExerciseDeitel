package africa.semicolon.salesApp;

import java.util.Scanner;

public class SalesAppMain {
    public static void main(String[] args) {
        String itemBought;
        int productQuantity;
        double productPrice;

        Scanner input = new Scanner(System.in);
        String prompt = """
                Welcome to Cred Store
                Type YES to Calculate
                Type NO to stop
                """;
        String prompt2 = """
                Type YES to continue
                Type NO to stop 
                """;
        System.out.println(prompt);
        String calculate = input.nextLine();

        while (!calculate.equalsIgnoreCase("No")) {

            System.out.println("What did the customer buy ?");
            itemBought = input.nextLine();

            System.out.println("Whats the price of the single one");
            productPrice = input.nextDouble();

            System.out.println("How many product did you buy");
            productQuantity = input.nextInt();
            input.nextLine();


            Item item = new Item(itemBought, productPrice, productQuantity);
            Cart cart = new Cart();
            cart.addItemToCart(item);


            System.out.println(prompt2);
            calculate = input.nextLine();
        }

        public void displayInvoice(Cart)
    }
}
