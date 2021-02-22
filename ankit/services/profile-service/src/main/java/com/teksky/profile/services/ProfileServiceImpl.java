package com.teksky.profile.services;

import com.teksky.profile.dao.ProfileDao;
import com.teksky.profile.entity.ProfileEntity;
import com.teksky.profile.model.ContactInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    ProfileDao profileDao;

    @Override
    public void saveCustomerProfile(ContactInformation contactInformation) {

        ProfileEntity profileEntity = new ProfileEntity();

        profileEntity.setCustomerId(contactInformation.getCustomerId());
        profileEntity.setName(contactInformation.getName());
        profileEntity.setEmailId(contactInformation.getEmailId());
        profileEntity.setPhoneNumber(contactInformation.getPhoneNumber());
        profileEntity.setUserName(contactInformation.getUserName());
        profileEntity.setPassword(contactInformation.getPassword());
        profileEntity.setCreatedId("Ankit");
        profileEntity.setCreatedDt(new Date());

        profileDao.saveCustomerProfileIntoDb(profileEntity);


    }


    @Override
    public void updateContactInformation(ContactInformation contactInformation, String customerId) {
        profileDao.updateContactInformationIntoDb(contactInformation, customerId);

    }

    @Override
    public List<ProfileEntity> getProfile() {
        return profileDao.getProfile();
    }

//    @Override
//    public List<ContactInformation> getProfileById(String customerId) {
//
//        List<ContactInformation> resp = new ArrayList<>();
//        List<ProfileEntity> listOfEnq = profileDao.getProfileById(customerId);
//
////        List<CustomerEnquiry> ref = new ArrayList<>();
//
//        ContactInformation ce = new ContactInformation();
//        ProfileEntity entity = new ProfileEntity();
//        ce.setUserName(entity.getUserName());
////        ce.setEnquiryText("vfoidsnfginsdljgfnwe");
//        resp.add(ce);
//
//        return resp;
//////        if(listOfEnq.size() > 0) {
//////            resp = new ArrayList<>();
//////            for (ProfileEntity entity : listOfEnq) {
////ProfileEntity entity = new ProfileEntity();
////                ContactInformation enq = new ContactInformation();
////                enq.setCustomerId(entity.getCustomerId());
////                enq.setEmailId(entity.getEmailId());
////                enq.setName(entity.getName());
////                enq.setPassword(entity.getPassword());
////                enq.setPhoneNumber(entity.getPhoneNumber());
////                enq.setUserName(entity.getUserName());
//////                enq.setFirstName(entity.getFirstName());
//////                enq.setEnquiryText(entity.getEnquiryTxt());
////                resp.add(enq);
//////            }
//////        }
////        return resp;
////
//////        List<ContactInformation> listContactInformation = new ArrayList<>();
//////        List<ProfileEntity> profileEntities = profileDao.getProfileById(customerId);
//////        ContactInformation contactInformation = new ContactInformation();
//////        contactInformation.setCustomerId();
//////        contactInformation.setEmailId();
//////
//////        listContactInformation.add(contactInformation);
//////
//////        return listContactInformation;
//
//
//
//    }
}
