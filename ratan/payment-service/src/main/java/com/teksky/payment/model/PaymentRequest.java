package com.teksky.payment.model;

public class PaymentRequest {

    private BillingINfo billingINfo;
    private CardInfo cardInfo;
    private PaymentMethod paymentMethod;

    public BillingINfo getBillingINfo() {
        return billingINfo;
    }

    public void setBillingINfo(BillingINfo billingINfo) {
        this.billingINfo = billingINfo;
    }

    public CardInfo getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(CardInfo cardInfo) {
        this.cardInfo = cardInfo;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
