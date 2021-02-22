package com.teksky.profile.dao;

import com.teksky.profile.entity.ProfileEntity;
import com.teksky.profile.model.ContactInformation;

import java.util.List;

public interface ProfileDao {
    void saveCustomerProfileIntoDb(ProfileEntity profileEntity);


    void updateContactInformationIntoDb(ContactInformation contactInformation, String customerId);

    List<ProfileEntity> getProfile();

//    List<ProfileEntity> getProfileById(String customerId);
}
