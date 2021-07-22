package africa.semicolon.estore;

public class BillingInformation{
    private Customer customer;
    private CreditCardInformation creditCardInformation;

    public String getPhoneNumber (){
        return customer.getPhone();
    }
    public Address getDeliveryAddress(){
        return customer.getHomeAddress();
    }

}
