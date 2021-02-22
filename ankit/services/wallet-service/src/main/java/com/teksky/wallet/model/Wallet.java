package com.teksky.wallet.model;

public class Wallet {

    private String amountInWallet;
    private String walletId;
    private PaymentMethods paymentMethods;


    public String getAmountInWallet() {
        return amountInWallet;
    }

    public void setAmountInWallet(String amountInWallet) {
        this.amountInWallet = amountInWallet;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public PaymentMethods getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(PaymentMethods paymentMethods) {
        this.paymentMethods = paymentMethods;
    }
}
