package com.teksky.contactus.service;

import com.teksky.contactus.entity.ContactUsEntity;
import com.teksky.contactus.model.ContactUs;
import com.teksky.contactus.model.CustomerEnquiry;
import com.teksky.contactus.repository.ContactUsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ContactUsService {

    @Autowired
    ContactUsRepository contactusRepository;

    public void saveEnquiry(ContactUs contactUsReq) {
        //populate entity
        ContactUsEntity entity = new ContactUsEntity();
        entity.setCustomerId(contactUsReq.getCustomerId());
        entity.setFirstName(contactUsReq.getfName());
        entity.setLastName(contactUsReq.getlName());
        entity.setEmailId(contactUsReq.getEmId());
        entity.setEnquiryTxt(contactUsReq.getRequestTxt());
        entity.setCreatedId("Rathan");
        entity.setCreatedDt(new Date());

        contactusRepository.saveCustomerEnquiryIntoDb(entity);
    }

    public List<CustomerEnquiry> getAllEnquiriesForCustomer(String customerId) {
        List<CustomerEnquiry> resp = null;
        List<ContactUsEntity> listOfEnq = contactusRepository.getAllCustomerEnquiresFromDb(customerId);
        if(listOfEnq.size() > 0) {
            resp = new ArrayList<>();
            for (ContactUsEntity entity : listOfEnq) {
                CustomerEnquiry enq = new CustomerEnquiry();
                enq.setFirstName(entity.getFirstName());
                enq.setEnquiryText(entity.getEnquiryTxt());
                resp.add(enq);
            }
        }
        return resp;
    }

    public void updateEnquiry(ContactUs req, String customerId) {
        contactusRepository.updateCustomerEnqInDb(req, customerId);
    }

    public List<ContactUs> findall() {
        return contactusRepository.findall();
    }


    public ContactUs update(ContactUs contactUsModel) {
        return contactusRepository.update(contactUsModel);
    }

    public long  delete(ContactUs contactUsModel) {
        return contactusRepository.delete(contactUsModel);
    }
}
