package com.teksky.contact_us.controller;


import com.teksky.contact_us.entity.ContactUsEntity;
import com.teksky.contact_us.model.ContactUs;
import com.teksky.contact_us.model.CustomerEnquiry;
import com.teksky.contact_us.service.ContactUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contactUs/service")
public class ContactUsController {


    @Autowired
    private ContactUsService contactUsService;


    @PostMapping("/enquiry")
    public void saveCustomerEnquiry(@RequestBody ContactUs contactUsReq) {
        contactUsService.saveEnquiry(contactUsReq);
    }

    @GetMapping("/{customerId}/enquiries")
    public List<CustomerEnquiry> findAllEnquiriesByCusomter(@PathVariable String customerId) {
        return contactUsService.getAllEnquiriesForCustomer(customerId);
    }

    @PutMapping("/{customerId}/updateEnquiry")
    public void update(@RequestBody ContactUs contactUsReq, @PathVariable String customerId) {
        contactUsService.updateEnquiry(contactUsReq, customerId);
    }
}











