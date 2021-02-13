package com.teksky.profileconnected.service;

import com.teksky.profileconnected.doa.Profile_Dao;
import com.teksky.profileconnected.entity.Profile_Entity;
import com.teksky.profileconnected.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Profile_Service {

    @Autowired
    Profile_Dao profile_dao;


    public void creatingDetailsInProfile(Profile profile) {
        Profile_Entity profile_entity = new Profile_Entity();

        profile_entity.setFirstName(profile.getFirstName());
        profile_entity.setLastName(profile.getLastName());
        profile_entity.setEmail(profile.getEmail());
        profile_entity.setGender(profile.getGender());
        profile_entity.setPhoneNumber(profile.getPhoneNumber());

        profile_dao.creatingDetailsInProfile(profile_entity);
    }

    public List<Profile_Entity> findAllDetails() {
        return profile_dao.findAllDetails();
    }

    public void updatingDetails(Profile_Entity profile_entity) {
        profile_dao.updatingDetails(profile_entity);
    }
}
