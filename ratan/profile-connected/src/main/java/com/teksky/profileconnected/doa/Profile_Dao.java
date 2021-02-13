package com.teksky.profileconnected.doa;

import com.teksky.profileconnected.entity.Profile_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.awt.image.CropImageFilter;
import java.util.List;

@Repository
public class Profile_Dao {

    @Autowired
    MongoTemplate mongoTemplate;

    public void creatingDetailsInProfile(Profile_Entity profile_entity) {
        mongoTemplate.save(profile_entity);
    }

    public List<Profile_Entity> findAllDetails() {

        Query que = new Query();
        que.addCriteria(Criteria.where("profile_lastName").is(""));

        mongoTemplate.find(que, Profile_Entity.class);

        return mongoTemplate.findAll(Profile_Entity.class);
    }

    public void updatingDetails(Profile_Entity profile_entity) {
        Query q = new Query();
        q.addCriteria(Criteria.where("email_id").is(profile_entity.getEmail()));

        Update u = new Update();
        u.set("first_name", profile_entity.getFirstName());

        mongoTemplate.upsert(q, u, Profile_Entity.class);
    }
}
