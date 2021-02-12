package com.teksky.contact_us.service;

import com.teksky.contact_us.entity.ContactUsEntity;
import com.teksky.contact_us.model.ContactUs;
import com.teksky.contact_us.model.CustomerEnquiry;

import java.util.List;

public interface ContactUsService {


    void saveEnquiry(ContactUs contactUsReq);

    List<CustomerEnquiry> getAllEnquiriesForCustomer(String customerId);

    void updateEnquiry(ContactUs contactUsReq, String customerId);
}
