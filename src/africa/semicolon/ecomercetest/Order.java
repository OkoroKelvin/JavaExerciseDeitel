package africa.semicolon.ecomercesrc;

public class Order {
    private int orderCode;
    private int customerID;
    private String orderDate;
    private String shippingId;

    public void setTheOrderCode(int codeNum) {
        orderCode = codeNum;

    }

    public int getTheOrderCode() {
        return orderCode;
    }

    public void setTheCustomerID(int userID) {
        customerID = userID;
    }

    public int getTheCustomerId() {
        return customerID;
    }

    public void setTestForOrderDate(String dateOfOrder) {
        orderDate= dateOfOrder;

    }

    public String getTheForOrderDate() {
        return orderDate;
    }

    public void setTheShippingId(String theShipID) {
        shippingId=theShipID;

    }

    public String getTheShippingId() {
        return shippingId;
    }
}
