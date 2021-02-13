package com.teksky.contactconnected.dao;

import com.teksky.contactconnected.entity.Contact_Connected_Entity;
import com.teksky.contactconnected.model.Contact_Connected;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Contact_Connected_Dao {

    @Autowired
    MongoTemplate mongoTemplate;
    public void createContactConnected(Contact_Connected_Entity contact_connected_entity) {
        mongoTemplate.save(contact_connected_entity);
    }


    public List<Contact_Connected_Entity> findAllContactsInfo() {
        return mongoTemplate.findAll(Contact_Connected_Entity.class);
    }


    public void updateContactConnected(Contact_Connected_Entity contact_connected) {
        mongoTemplate.save(contact_connected);
    }

    public void deleteContactConnected(Contact_Connected_Entity contact_connected) {
        mongoTemplate.remove(contact_connected);
    }
}
