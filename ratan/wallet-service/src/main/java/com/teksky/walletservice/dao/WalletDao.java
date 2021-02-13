package com.teksky.walletservice.dao;

import com.teksky.walletservice.entity.WalletEntity;
import com.teksky.walletservice.model.PaymentMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WalletDao {

    @Autowired
    MongoTemplate mongoTemplate;

    public void createWallet(WalletEntity entity) {
        mongoTemplate.save(entity);
    }

    public void updateWallet(PaymentMethods paymentMethods, String paymentId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("payment_id").is(paymentId));
        Update up = new Update();
        up.set("card", paymentMethods.getCard());
        up.set("bank", paymentMethods.getCard());
        up.set("paypal", paymentMethods.getCard());
        mongoTemplate.updateMulti(query, up, WalletEntity.class);
    }

    public List<WalletEntity> findAll() {
        return mongoTemplate.findAll(WalletEntity.class);
    }

}
