package com.teksky.walletservice.entity;

import com.teksky.walletservice.model.Bank;
import com.teksky.walletservice.model.Card;
import com.teksky.walletservice.model.Paypal;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "wallet_collection_ratan")
public class WalletEntity {

    @Id
    private String txnId;

    @Field("payment_id")
    private String paymentId;
    @Field("card")
    private Card card;
    @Field("bank")
    private Bank bank;
    @Field("paypal")
    private Paypal paypal;
    @Field("created_id")
    private String createdId;
    @Field("created_date")
    private Date createDate;
    @Field("updated_id")
    private String updatedId;
    @Field("updated_date")
    private Date updatedDate;

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Paypal getPaypal() {
        return paypal;
    }

    public void setPaypal(Paypal paypal) {
        this.paypal = paypal;
    }

    public String getCreatedId() {
        return createdId;
    }

    public void setCreatedId(String createdId) {
        this.createdId = createdId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdatedId() {
        return updatedId;
    }

    public void setUpdatedId(String updatedId) {
        this.updatedId = updatedId;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
