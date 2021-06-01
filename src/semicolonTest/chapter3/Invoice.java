package semicolonTest.chapter3;

public class Invoice {
    private double pricePerItem;
    private int quantityPurchased;
    private String partDescription;
    private String partNumbers;
    private double invoiceAmount;


    public Invoice(double pricePerItem, int quantityPurchased, String partDescription, String partNumber) {
    }

    public void setPricePerItems(double price) {
        pricePerItem = price;

    }

    public double getPricePerItems() {
        return pricePerItem;
    }

    public void setQuantityOfItemsPurchased(int itemsPurchased) {
        quantityPurchased = itemsPurchased;
    }

    public int getQuantityOfItemsPurchased() {
        return quantityPurchased;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;

    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartNumbers(String partNumbers) {
        this.partNumbers = partNumbers;
    }

    public String getPartNumbers() {
        return partNumbers;
    }

    public double getInvoiceAmount() {
        if (quantityPurchased < 1 || pricePerItem < 1) {
            quantityPurchased = 0;
            pricePerItem = 0.00;
            return invoiceAmount=pricePerItem*quantityPurchased;
        } else {
            return invoiceAmount = pricePerItem * quantityPurchased;

        }
    }
}
