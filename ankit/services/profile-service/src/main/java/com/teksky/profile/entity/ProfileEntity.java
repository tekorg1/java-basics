package com.teksky.profile.entity;

import com.teksky.profile.model.Password;
import com.teksky.profile.model.UserName;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "profile-collection")
public class ProfileEntity {

    @Id
    private String Id;

    @Field("customer_id")
    private String customerId;

    @Field("name")
    private String name;

    @Field("email_id")
    private String emailId;

    @Field("phone_number")
    private String phoneNumber;

    @Field("password")
    private Password password;

    @Field("user_name")
    private UserName userName;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public UserName getUserName() {
        return userName;
    }

    public void setUserName(UserName userName) {
        this.userName = userName;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
}
