package com.teksky.contact_us.dao;

import com.teksky.contact_us.entity.ContactUsEntity;
import com.teksky.contact_us.model.ContactUs;

import java.util.List;

public interface ContactUsDao {


    void saveCustomerEnquiryIntoDb(ContactUsEntity entity);

    List<ContactUsEntity> getAllCustomerEnquiresFromDb(String customerId);

    void updateCustomerEnqInDb(ContactUs req, String customerId);
}
