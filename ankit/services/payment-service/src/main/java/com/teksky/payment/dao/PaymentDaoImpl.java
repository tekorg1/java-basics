package com.teksky.payment.dao;

import com.teksky.payment.entity.PaymentEntity;
import com.teksky.payment.model.PaymentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentDaoImpl implements PaymentDao {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<PaymentEntity> getPayment() {
        return mongoTemplate.findAll(PaymentEntity.class);
    }

    @Override
    public long delete(PaymentEntity paymentEntity, String paymentId) {
        return mongoTemplate.remove(paymentEntity).getDeletedCount();
    }

    @Override
    public void savePaymentRequestIntoDb(PaymentEntity entity) {
        mongoTemplate.save(entity);
    }

    @Override
    public void updatePaymentInformationIntoDb(PaymentRequest paymentRequest, String paymentId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("payment_id").is(paymentId));
        Update update = new Update();
        update.set("first_name", paymentRequest.getFirstName());
        update.set("last_name", paymentRequest.getLastName());
        update.set("email_id", paymentRequest.getEmailId());
        update.set("address", paymentRequest.getAddress());
        update.set("payment_method", paymentRequest.getPaymentMethod());
        mongoTemplate.updateMulti(query, update, PaymentEntity.class);
    }


//    @Override
//    public void savePayment(PaymentEntity paymentEntity) {
//        mongoTemplate.save(paymentEntity);
//
//    }
}
