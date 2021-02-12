package com.teksky.contact_us.dao;

import com.teksky.contact_us.entity.ContactUsEntity;
import com.teksky.contact_us.model.ContactUs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactUsDaoImpl implements ContactUsDao {

    @Autowired
    private MongoTemplate mongoTemplate;


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
        //mongoTemplate.findAndModify(query, update, Entity.class);
        mongoTemplate.updateMulti(query, up, ContactUsEntity.class);
    }
}
