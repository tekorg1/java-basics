package com.teksky.profile.dao;

import com.teksky.profile.entity.ProfileEntity;
import com.teksky.profile.model.ContactInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProfileDaoImpl implements ProfileDao{

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void saveCustomerProfileIntoDb(ProfileEntity profileEntity) {
        mongoTemplate.save(profileEntity);
    }

//    @Override
//    public List<ProfileEntity> saveContactInformationIntoDao(String customerId) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("customer_id").is(customerId));
//        return mongoTemplate.find(query, ProfileEntity.class);
////        return  mongoTemplate.findAll(ProfileEntity.class);
//    }

    @Override
    public void updateContactInformationIntoDb(ContactInformation contactInformation, String customerId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("customer_id").is(customerId));
        Update update = new Update();
        update.set("name", contactInformation.getName());
        update.set("email_id", contactInformation.getEmailId());
        update.set("phone_number", contactInformation.getPhoneNumber());
        update.set("password", contactInformation.getPassword());
        update.set("user_name", contactInformation.getUserName());

        //mongoTemplate.findAndModify(query, up, ContactUsEntity.class);
        mongoTemplate.updateMulti(query, update, ProfileEntity.class);
    }

    @Override
    public List<ProfileEntity> getProfile() {
        return mongoTemplate.findAll(ProfileEntity.class);
    }

//    @Override
//    public List<ProfileEntity> getProfileById(String customerId) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("customer_id").is(customerId));
//        return mongoTemplate.find(query, ProfileEntity.class);    }
}
