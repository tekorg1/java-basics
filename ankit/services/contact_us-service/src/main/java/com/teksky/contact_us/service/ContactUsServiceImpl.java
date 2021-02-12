package com.teksky.contact_us.service;



import com.teksky.contact_us.dao.ContactUsDao;
import com.teksky.contact_us.entity.ContactUsEntity;
import com.teksky.contact_us.model.ContactUs;
import com.teksky.contact_us.model.CustomerEnquiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ContactUsServiceImpl implements ContactUsService {

    @Autowired
    private ContactUsDao contactusRepository;

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

//        List<CustomerEnquiry> ref = new ArrayList<>();
//
//        CustomerEnquiry ce = new CustomerEnquiry();
//        ce.setFirstName("some");
//        ce.setEnquiryText("vfoidsnfginsdljgfnwe");
//        ref.add(ce);
//
//        return ref;
    }

    public void updateEnquiry(ContactUs req, String customerId) {
        contactusRepository.updateCustomerEnqInDb(req, customerId);
    }
}
