package com.teksky.payment.dao;

import com.teksky.payment.entity.PaymentEntity;

public interface PaymentDao {

	void savePayment(PaymentEntity entity);
}
