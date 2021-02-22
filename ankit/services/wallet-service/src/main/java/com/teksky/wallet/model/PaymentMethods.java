package com.teksky.wallet.model;

public class PaymentMethods {

    private Card card;
    private BankAccount bankAccount;
    private Paypal paypal;


    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Paypal getPaypal() {
        return paypal;
    }

    public void setPaypal(Paypal paypal) {
        this.paypal = paypal;
    }
}


