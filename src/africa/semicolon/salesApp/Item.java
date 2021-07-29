package africa.semicolon.salesApp;

public class Item {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    public Item(String itemName, double itemPrice, int itemQuantity) {
        this.itemName= itemName;
        this.itemPrice=itemPrice;
        this.itemQuantity= itemQuantity;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setPriceOfItem(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getPriceOfItem() {
        return itemPrice;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }
}
