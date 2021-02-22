package com.teksky.wallet.entity;

import com.teksky.wallet.model.PaymentMethods;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "wallet-collection-ankit")
public class WalletEntity {

    @Id
    private String id;

    @Field("wallet_id")
    private String walletId;

    @Field("payment_methods")
    private PaymentMethods paymentMethods;

    @Field("amount_in_wallet")
    private String amountInWallet;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

