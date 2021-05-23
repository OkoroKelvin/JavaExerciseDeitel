package africa.semicolon.ecomercetest;

public class ShoppingCart {
    private int cartId;
    private int productId;
    private int quantity;
    private String dateAdded;

    public void setTheShoppingCartId(int theId) {
        cartId = theId;
    }

    public int getTheShoppingCartId() {
        return cartId;
    }

    public void setTheProductId(int theProID) {
        productId=theProID;
    }

    public int getTheProductId() {
        return productId;
    }

    public void setTheQuantityID(int quantityId) {
        quantity= quantityId;
    }

    public int getTheQuantityID() {
        return quantity;
    }

    public void setDateOfCart(String cartDate) {
        dateAdded=cartDate;

    }

    public String getDateOfCart() {
        return dateAdded;
    }
}
