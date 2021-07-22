package africa.semicolon.estore;

public class Item {
    private int quantityOfProductSelected;
    private Product product;

    public int getQuantityOfProductSelected() {
        return quantityOfProductSelected;
    }

    public void setQuantityOfProductSelected(int quantityOfProductSelected) {
        this.quantityOfProductSelected = quantityOfProductSelected;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
