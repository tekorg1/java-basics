package com.teksky.contactus.repository;

import com.teksky.contactus.entity.ContactUsEntity;
import com.teksky.contactus.model.ContactUs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactUsRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    public void saveCustomerEnquiryIntoDb(ContactUsEntity contactUsEnt) {
        mongoTemplate.save(contactUsEnt);
    }

    public List<ContactUsEntity> getAllCustomerEnquiresFromDb(String customerId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("customer_id").is(customerId));
        return mongoTemplate.find(query, ContactUsEntity.class);
    }

    public List<ContactUs> findall() {
        return mongoTemplate.findAll(ContactUs.class);
    }

    public void updateCustomerEnqInDb(ContactUs req, String customerId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("customer_id").is(customerId));
        Update up = new Update();
        up.set("enquiry_text", req.getRequestTxt());
        //mongoTemplate.findAndModify(query, up, ContactUsEntity.class);
        mongoTemplate.updateMulti(query, up, ContactUsEntity.class);
    }


    public ContactUs update(ContactUs contactUsModel) {
        return mongoTemplate.save(contactUsModel);
    }

    public long delete(ContactUs contactUsModel) {
        return mongoTemplate.remove(contactUsModel).getDeletedCount();
    }
}
