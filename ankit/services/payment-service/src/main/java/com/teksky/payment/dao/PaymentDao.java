package com.teksky.payment.dao;

import com.teksky.payment.entity.PaymentEntity;
import com.teksky.payment.model.PaymentRequest;

import java.util.List;

public interface PaymentDao {

//    void savePayment(PaymentEntity paymentEntity);

//    PaymentEntity collectPayment(PaymentEntity paymentEntity);

    List<PaymentEntity> getPayment();

//    void updatePayment(PaymentEntity paymentEntity);

    long delete(PaymentEntity paymentEntity, String paymentId);

    void savePaymentRequestIntoDb(PaymentEntity entity);

    void updatePaymentInformationIntoDb(PaymentRequest paymentRequest, String paymentId);
}
