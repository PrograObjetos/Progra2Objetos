package progra2objetos;

import java.util.Date;


public class Card {
    private  String name;
    private  String lastName;
    private  String type;
    private  int cardNumber;
    private  int securityCode;
    private  Date expirationDate;

    public Card(String name, String lastName, String type, int cardNumber, int securityCode, Date expirationDate) {
        this.name = name;
        this.lastName = lastName;
        this.type = type;
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpiraionDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
    
}
