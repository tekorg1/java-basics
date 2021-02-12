package com.teksky.payment.entity;

import com.teksky.payment.model.BillingAddress;
import com.teksky.payment.model.PaymentMethod;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Document(collection = "payment-collection")
public class PaymentEntity {

    @Id
    private String txnId;

    @Field("payment_id")
    private String paymentId;

    @Field("first_name")
    private String firstName;

    @Field("last_name")
    private String lastName;

    @Field("email_id")
    private String emailId;

    @Field("address")
    private List<BillingAddress> address;

    @Field("payment_method")
    private PaymentMethod paymentMethod;

    @Field("created_id")
    private String createdId;

    @Field("created_date")
    private Date createdDate;

    @Field("updated_id")
    private String updatedId;

    @Field("update_date")
    private Date updatedDate;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<BillingAddress> getAddress() {
        return address;
    }

    public void setAddress(List<BillingAddress> address) {
        this.address = address;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCreatedId(String ankit) {
        return createdId;
    }

    public void setCreatedId(String createdId) {
        this.createdId = createdId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedId() {
        return updatedId;
    }

    public void setUpdatedId(String updatedId) {
        this.updatedId = updatedId;
    }


//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public String getCreatedId() {
        return createdId;
    }
}
