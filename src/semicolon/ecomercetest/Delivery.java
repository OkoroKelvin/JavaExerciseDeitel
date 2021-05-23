package africa.semicolon.ecomercetest;

public class Delivery {
    private int deliveryRef;
    private int orderId;
    private int dateShipped;
    private int dateDelivered;
    private int trackingId;

    public void setTheDeliveryReferencesId(int refID) {
        deliveryRef= refID;
    }

    public int getTheDeliveryReferncesId() {
        return deliveryRef;
    }
}


