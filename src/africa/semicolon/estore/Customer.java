package africa.semicolon.estore;

import java.util.ArrayList;

public class Customer extends User {

    private ShoppingCart shoppingCart;

    private ArrayList <BillingInformation> billingInformation = new ArrayList<>();
    public Customer(int age, String email, String name, String password, String phone, Address homeAddress) {
        super(age, email, name, password, phone, homeAddress);
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
