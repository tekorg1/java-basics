package com.teksky.payment.service;

import com.teksky.payment.dao.PaymentDao;
import com.teksky.payment.entity.PaymentEntity;
import com.teksky.payment.model.BillingAddress;
import com.teksky.payment.model.PaymentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

//    @Override
//    public PaymentEntity collectPayment(PaymentEntity paymentEntity) {
//       return paymentDao.collectPayment(paymentEntity);
//    }

    @Override
    public List<PaymentEntity> getPayment() {
        return paymentDao.getPayment();
    }

//    @Override
//    public void updatePayment(PaymentEntity paymentEntity) {
//        paymentDao.updatePayment(paymentEntity);
//    }

    @Override
    public long delete(PaymentEntity paymentEntity, String paymentId) {
        return paymentDao.delete(paymentEntity, paymentId);
    }

    @Override
    public void savePaymentRequest(PaymentRequest paymentRequest) {

        PaymentEntity entity = new PaymentEntity();

        entity.setTxnId("123456789");
        entity.setPaymentId(paymentRequest.getPaymentId());
        entity.setFirstName(paymentRequest.getFirstName());
        entity.setLastName(paymentRequest.getLastName());
        entity.setEmailId(paymentRequest.getEmailId());

//        List<BillingAddress> addressList = new ArrayList();
//
//        addressList.add(paymentRequest.getAddress().getBillingAddress());
//        if (paymentRequest.getAddress().getBillingAddress() != null) {
//            addressList.add(paymentRequest.getAddress().getBillingAddress());
//        }

//        entity.setAddress(addressList);
        entity.setCreatedId("Ankit");
        entity.setCreatedDate(new Date());

        paymentDao.savePaymentRequestIntoDb(entity);

    }

    @Override
    public void updatePaymentInformation(PaymentRequest paymentRequest, String paymentId) {
        paymentDao.updatePaymentInformationIntoDb(paymentRequest, paymentId);
    }


}
