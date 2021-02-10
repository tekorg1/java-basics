package com.teksky.contactus.controller;

import com.teksky.contactus.model.ContactUs;
import com.teksky.contactus.model.CustomerEnquiry;
import com.teksky.contactus.service.ContactUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contactus/service")
public class ContactUsController {

    @Autowired
    ContactUsService contactUsService;

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

    @DeleteMapping("/delete")
    public long delete(@RequestBody ContactUs contactUsModel) {
        return contactUsService.delete(contactUsModel);
    }
}
