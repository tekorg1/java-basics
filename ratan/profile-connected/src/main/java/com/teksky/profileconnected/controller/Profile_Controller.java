package com.teksky.profileconnected.controller;

import com.teksky.profileconnected.entity.Profile_Entity;
import com.teksky.profileconnected.model.Profile;
import com.teksky.profileconnected.service.Profile_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile/service")
public class Profile_Controller {

    @Autowired
    Profile_Service profile_service;

    @PostMapping("/create")
    public void creatingDetailsInProfile(@RequestBody Profile profile){
        profile_service.creatingDetailsInProfile(profile);
    }

    @GetMapping("/read")
    public List<Profile_Entity> findAllDetails(){
        return profile_service.findAllDetails();
    }

    @PutMapping("/update")
    public void updatingDetails(@RequestBody Profile_Entity profile_entity){
        profile_service.updatingDetails(profile_entity);
    }
}
