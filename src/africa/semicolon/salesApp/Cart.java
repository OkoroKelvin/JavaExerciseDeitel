package africa.semicolon.salesApp;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> items = new ArrayList<>();
    public void addItemToCart(Item item) {
        items.add(item);
    }

    public List getItemsCart() {
        return items;
    }
}
