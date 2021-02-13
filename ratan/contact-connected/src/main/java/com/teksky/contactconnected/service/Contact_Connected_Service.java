package com.teksky.contactconnected.service;

import com.teksky.contactconnected.dao.Contact_Connected_Dao;
import com.teksky.contactconnected.entity.Contact_Connected_Entity;
import com.teksky.contactconnected.model.Contact_Connected;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Contact_Connected_Service {
    @Autowired
    Contact_Connected_Dao contact_connected_dao;
    public void createContactConnected(Contact_Connected contact_connected) {
        Contact_Connected_Entity contact_connected_entity = new Contact_Connected_Entity();
        contact_connected_entity.setContactId(contact_connected.getContactId());
        contact_connected_entity.setFirstName(contact_connected.getFirstName());
        contact_connected_entity.setLastName(contact_connected.getLastName());
        contact_connected_entity.setPhoneNumber(contact_connected.getPhoneNumber());
        contact_connected_entity.setAddress(contact_connected.getAddress());

        contact_connected_dao.createContactConnected(contact_connected_entity);
    }


    public List<Contact_Connected_Entity> findAllContactsInfo() {
       return contact_connected_dao.findAllContactsInfo();
    }


    public void updateContactConnected(Contact_Connected_Entity contact_connected) {
        contact_connected_dao.updateContactConnected(contact_connected);
    }

    public void deleteContactConnected(Contact_Connected_Entity contact_connected) {
        contact_connected_dao.deleteContactConnected(contact_connected);
    }
}
