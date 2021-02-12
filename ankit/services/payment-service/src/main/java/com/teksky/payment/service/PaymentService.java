package com.teksky.payment.service;

import com.teksky.payment.entity.PaymentEntity;
import com.teksky.payment.model.PaymentRequest;

import java.util.List;

public interface PaymentService {

//    List<PaymentEntity> find();
//
//    PaymentEntity update(PaymentEntity paymentEntity);
//
//    void collect(PaymentRequest paymentRequest);
//
//    long delete(PaymentEntity contactUsEntity);

//    PaymentEntity collectPayment(PaymentEntity paymentEntity);

    List<PaymentEntity> getPayment();

//    void updatePayment(PaymentEntity paymentEntity);

    long delete(PaymentEntity paymentEntity, String paymentId );

    void savePaymentRequest(PaymentRequest paymentRequest);

    void updatePaymentInformation(PaymentRequest paymentRequest, String paymentId);
}
