package com.teksky.walletservice.model;

public class Wallet {

    private String amount;
    private PaymentMethods paymentmethods;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public PaymentMethods getPaymentmethods() {
        return paymentmethods;
    }

    public void setPaymentmethods(PaymentMethods paymentmethods) {
        this.paymentmethods = paymentmethods;
    }
}
