package com.teksky.payment.service;

import com.teksky.payment.dao.PaymentServiceDao;
import com.teksky.payment.entity.PaymentServiceEntity;
import com.teksky.payment.model.PaymentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentServiceDao paymentServiceDao;

    public void createPaymentService(PaymentRequest paymentRequest) {
        PaymentServiceEntity paymentServiceEntity = new PaymentServiceEntity();

        paymentServiceEntity.setPaymentMethod(paymentRequest.getPaymentMethod());
        paymentServiceEntity.setBillingINfo(paymentRequest.getBillingINfo());
        paymentServiceEntity.setCardInfo(paymentRequest.getCardInfo());
        paymentServiceDao.createPaymentService(paymentServiceEntity);

    }

    public List<PaymentServiceEntity> findAllDetails() {
    return paymentServiceDao.findAllDetails();
    }

    public void updatePaymentService(PaymentServiceEntity paymentRequest) {
        paymentServiceDao.updatePaymentService(paymentRequest);
    }
}
