package africa.semicolon.estore;

import java.util.ArrayList;

public class Customer extends Users{
    private ShoppingCart shoppingCart;

    private ArrayList <BillingInformation> billingInformation = new ArrayList<>();
    public Customer(int age, String email, String name, String password, String phone, Address homeAddress) {
        super(age, email, name, password, phone, homeAddress);
    }
}
