package com.teksky.profile.controller;

import com.teksky.profile.entity.ProfileEntity;
import com.teksky.profile.model.ContactInformation;
import com.teksky.profile.services.ProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service/profile")
public class ProfileController {


    Logger logger = LoggerFactory.getLogger(ContactInformation.class);

    @Autowired
    ProfileService profileService;


    @PostMapping("/createProfile")
    public void saveCustomerProfile(@RequestBody ContactInformation contactInformation) {
        profileService.saveCustomerProfile(contactInformation);
    }

    @GetMapping("/getProfiles")
    public List<ProfileEntity> getProfile() {

        logger.error("FATAL ERROR");

        return profileService.getProfile();
    }



//    @GetMapping("/{customerId}/getProfile")
//    public List<ContactInformation> getProfileById(String customerId){
//
//
//        return  profileService.getProfileById(customerId);
//    }


    @PutMapping("/{customerId}/updateProfile")
    public void updateCusomterProfile(@RequestBody ContactInformation contactInformation, @PathVariable String customerId) {
        logger.error("FATAL ERROR");

        profileService.updateContactInformation(contactInformation, customerId);
    }
}
