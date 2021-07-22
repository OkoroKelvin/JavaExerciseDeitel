package africa.semicolon.estore;

public class CreditCardInformation {
    private int Cvv;
    private int cardExpiration;
    private String creditCardNumber;
    private String nameOnCard;
    private CardType cardType;

    public int getCvv() {
        return Cvv;
    }

    public void setCvv(int cvv) {
        Cvv = cvv;
    }

    public int getCardExpiration() {
        return cardExpiration;
    }

    public void setCardExpiration(int cardExpiration) {
        this.cardExpiration = cardExpiration;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
