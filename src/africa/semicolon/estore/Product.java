package africa.semicolon.estore;

public class Product {
    private int productId;
    private String productName;
    private int price;
    private String productDescription;
    private  ProductCategory productCategory;

    public Product(int productId, String productName, int price, String productDescription, ProductCategory productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
    }
}

