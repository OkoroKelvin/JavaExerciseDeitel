package africa.semicolon.ecomercetest;

public class OrderItems {
    private int orderItemId;
    private String productCode;
    private String productCartCode;
    private String dateMgnf;
    private String expiryDate;

    public void setTheOrderItemId(int itemID) {
        orderItemId=itemID;
    }

    public int getTheOrderItemId() {
        return orderItemId;
    }

    public void setTheProductCode(String codeProduct) {
        productCode=codeProduct;

    }

    public String getTheProductCode() {
        return productCode;
    }

    public void setProductCartCode(String cartCode) {
        productCartCode=cartCode;
    }

    public String getProductCartCode() {
        return productCartCode;
    }

    public void setDateManufacture(String manDate) {
        dateMgnf=manDate;

    }

    public String getDateManufacture() {
        return dateMgnf;
    }

    public void setProductExpiryDate(String dateExpire) {
        expiryDate=dateExpire;
    }
}
