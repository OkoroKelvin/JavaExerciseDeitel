package africa.semicolon.salesApp;

import java.util.Scanner;

public class SalesAppMain {
    public static void main(String[] args) {
        String itemBought;
        int productQuantity;
        double productPrice;
        Cart cart = new Cart();

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
            cart.addItemToCart(item);


            System.out.println(prompt2);
            calculate = input.nextLine();
        }

        displayInvoice(cart);

    }

    public static void displayInvoice(Cart itemCart) {
        Cart items = itemCart;
        System.out.printf("%30s\n\n", "GENERAL INVOICE");
        System.out.printf("%10s%10s%10s%15s%10s\n", "Item Number", "Item", "Price", "Quantity", "Total");
        for (int i = 0; i < items.getItemsCart().size(); i++) {
            Item item = items.getItemsCart().get(i);
            String itemName = item.getItemName();
            double itemPrice = item.getPriceOfItem();
            double itemQuantity = item.getItemQuantity();
            double itemTotal = itemPrice * itemQuantity;

            System.out.printf("%10s%10s%10s%15s%10s\n", i+1,itemName,itemPrice,itemQuantity,itemTotal);
        }

    }
}
