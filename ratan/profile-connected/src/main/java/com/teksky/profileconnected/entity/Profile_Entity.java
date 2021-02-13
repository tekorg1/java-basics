package com.teksky.profileconnected.entity;

import com.teksky.profileconnected.model.Profile;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "profile_information_ratan")
public class Profile_Entity {
    @Id
    private String id;
    @Field("profile_firstName")
    private String firstName;
    @Field("profile_lastName")
    private String lastName;
    @Field("profile_email")
    private String email;
    @Field("profile_gender")
    private char gender;
    @Field("profile_phoneNumber")
    private long phoneNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void creatingDetailsInProfile(Profile_Entity profile) {

    }
}
