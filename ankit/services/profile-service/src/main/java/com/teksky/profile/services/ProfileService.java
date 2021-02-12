package com.teksky.profile.services;

import com.teksky.profile.entity.ProfileEntity;
import com.teksky.profile.model.ContactInformation;

import java.util.List;

public interface ProfileService {
    void saveCustomerProfile(ContactInformation contactInformation);


    void updateContactInformation(ContactInformation contactInformation, String customerId);

    List<ProfileEntity> getProfile();

//    List<ContactInformation> getProfileById(String customerId);
}
