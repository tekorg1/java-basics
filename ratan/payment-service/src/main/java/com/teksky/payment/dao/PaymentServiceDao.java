package com.teksky.payment.dao;

import com.teksky.payment.entity.PaymentServiceEntity;
import com.teksky.payment.model.PaymentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentServiceDao {

    @Autowired
    MongoTemplate mongoTemplate;

    public void createPaymentService(PaymentServiceEntity paymentServiceEntity) {
    mongoTemplate.save(paymentServiceEntity);
    }

    public List<PaymentServiceEntity> findAllDetails() {
    return mongoTemplate.findAll(PaymentServiceEntity.class);
    }

    public void updatePaymentService(PaymentServiceEntity paymentRequest) {
    mongoTemplate.save(paymentRequest);
    }
}
