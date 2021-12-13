package semicolon.chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstoreAppSales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> goods = new ArrayList<String>();
        List<Integer> priceOfItems = new ArrayList<Integer>();
        List<Integer> quantities = new ArrayList<>();
        List<Integer> priceOfGoods =new ArrayList<>();
        //int products = input.nextInt();
        int price;
        int amountOfProduct;
        int total;
        String prompt = """
                Welcome to Cred Store
                Press 1 to Calculate
                Press 2 to stop
                """;

        System.out.println(prompt);

        int guage = input.nextInt();
        input.nextLine();
        while (guage != 0) {


            System.out.println("What did the customer buy ?");
            String purchase = input.nextLine();
            goods.add(purchase);



            System.out.println("How many product did you buy");
            amountOfProduct = input.nextInt();
            quantities.add(amountOfProduct);


            System.out.println("Whats the price of the single one");
            price = input.nextInt();
            priceOfGoods.add(price);

            total = price * amountOfProduct;

            priceOfItems.add(total);

            System.out.println("Any thing else?? if YES press 1, if No press 0");
            guage = input.nextInt();
            input.nextLine();

        }

        for(int i=0; i < goods.size();i++){
            printInvoice(i+1, goods.get(i),priceOfGoods.get(i),quantities.get(i),priceOfItems.get(i));
        }

    }
    public static void printInvoice(int serailNumber, String item,int price, int quantity, int total ){
        System.out.printf("%d%10s%10d%10d%10d\n",serailNumber,item,price,quantity,total);
    }
}
