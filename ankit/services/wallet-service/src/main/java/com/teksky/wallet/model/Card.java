package com.teksky.wallet.model;

public class Card {
    private String name;
    private long cardNumber;
    private int expiration;
    private int cvv;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
