package com.teksky.payment.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.teksky.payment.dao.PaymentDao;
import com.teksky.payment.entity.PaymentEntity;

@Repository
public class PaymentDaoImpl implements PaymentDao {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public void savePayment(PaymentEntity entity) {
		mongoTemplate.save(entity);
	}

}
