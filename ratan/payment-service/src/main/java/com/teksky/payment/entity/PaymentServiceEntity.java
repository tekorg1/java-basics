package com.teksky.payment.entity;

import com.teksky.payment.model.BillingINfo;
import com.teksky.payment.model.CardInfo;
import com.teksky.payment.model.PaymentMethod;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "payment_service_ratan")
public class PaymentServiceEntity {

    @Id
    private String Id;
    @Field("payment_service_billingInfo")
    private BillingINfo billingINfo;
    @Field("payment_service_cardInfo")
    private CardInfo cardInfo;
    @Field("payment_service_paymentMethod")
    private PaymentMethod paymentMethod;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

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
