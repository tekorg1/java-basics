package com.teksky.payment.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teksky.payment.contactus.service.ContactUsService;
import com.teksky.payment.model.ContactUsRequest;
import com.teksky.payment.model.CustomerEnquiry;

@RestController
@RequestMapping("/contactus/services/")
public class ContactUsController {
	
	Logger logger = LoggerFactory.getLogger(ContactUsController.class);

	@Autowired
	ContactUsService contactUsService;

	@PostMapping("/SaveDetails")
	public void saveDetails(@RequestBody ContactUsRequest contactUs) {
		contactUsService.saveCustomerFeedaback(contactUs);
	}
	
	@GetMapping("/{customerId}/enquiries")
    public List<CustomerEnquiry> findAllEnquiriesByCusomter(@PathVariable String customerId) {
		logger.debug("Get Call statred :: Debug");
		logger.info("Get Call statred :: info");
		logger.warn("Get Call statred :: warn");
		logger.error("Get Call statred :: Error");
        return contactUsService.getAllEnquiriesForCustomer(customerId);
    }

    @PutMapping("/{customerId}/updateEnquiry")
    public void update(@RequestBody ContactUsRequest contactUsReq, @PathVariable String customerId) {
        contactUsService.updateEnquiry(contactUsReq, customerId);
    }

    @DeleteMapping("/delete")
    public long delete(@RequestBody ContactUsRequest contactUsModel) {
        return contactUsService.delete(contactUsModel);
    }
}


