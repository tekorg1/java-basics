package com.teksky.contactus.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document (collection = "contact_us_collection")
public class ContactUsEntity {

    @Id
    private String Id;

    @Field("customer_id")
    private String customerId;

    @Field("first_name")
    private String firstName;

    @Field("last_name")
    private String lastName;

    @Field("email_id")
    private String emailId;

    @Field("enquiry_text")
    private String enquiryTxt;

    @Field("created_id")
    private String createdId;

    @Field("created_date")
    private Date createdDt;

    @Field("updated_id")
    private String updatedId;

    @Field("updated_date")
    private Date updatedDt;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public String getEnquiryTxt() {
        return enquiryTxt;
    }

    public void setEnquiryTxt(String enquiryTxt) {
        this.enquiryTxt = enquiryTxt;
    }

    public String getCreatedId() {
        return createdId;
    }

    public void setCreatedId(String createdId) {
        this.createdId = createdId;
    }

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public String getUpdatedId() {
        return updatedId;
    }

    public void setUpdatedId(String updatedId) {
        this.updatedId = updatedId;
    }

    public Date getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(Date updatedDt) {
        this.updatedDt = updatedDt;
    }
}
