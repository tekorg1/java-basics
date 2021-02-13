package com.teksky.contactconnected.controller;

import com.teksky.contactconnected.dao.Contact_Connected_Dao;
import com.teksky.contactconnected.entity.Contact_Connected_Entity;
import com.teksky.contactconnected.model.Contact_Connected;
import com.teksky.contactconnected.service.Contact_Connected_Service;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact_connected/service")
public class Contact_Connected_Controller {

    Logger logger = LoggerFactory.getLogger(Contact_Connected.class);
    @Autowired
    Contact_Connected_Service contact_connected_service;


    @PostMapping("/create")
    @ApiOperation(value = "Get Contact Connected Method", notes = "This method will store all Contact-Connected Details")
    public void createContactConnected(@RequestBody Contact_Connected contact_connected){
        logger.error("This is Error");
        logger.info("Contact-Connected Controller : Inside post, createContactConnected Method - start");
        contact_connected_service.createContactConnected(contact_connected);
    }

    @GetMapping("/Read")
    @ApiOperation(value = "Get findAllContactsInfo", notes = "This method will get all data which us stored in database")
    public List<Contact_Connected_Entity> findAllContactsInfo(){
        logger.error("Error is in GetMapping");
        logger.info("Contact-Connected Controller : Inside get, findAllContactsInfo Method - start ");
        return contact_connected_service.findAllContactsInfo();
    }

    @PutMapping("/update")
    @ApiOperation(value = "Put updateContactConnected", notes = "This method will update the data which was is in database")
    public void updateContactConnected(@RequestBody Contact_Connected_Entity contact_connected){
        logger.error("Error is in PutMapping");
        logger.info("Contact-Connected Controller : Inside Put, updateContactConnected Method - start");
        contact_connected_service.updateContactConnected(contact_connected);
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "Delete deleteContactConnected", notes = "This method can delete the data which was is in database")
    public void deleteContactConnected(@RequestBody Contact_Connected_Entity contact_connected){
        logger.error("Error is in DeleteMapping");
        logger.info("Contact-Connected Controller : Inside Delete, deleteContactConnected Method - start");
        contact_connected_service.deleteContactConnected(contact_connected);
    }
}
