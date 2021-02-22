package com.teksky.payment.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teksky.payment.dao.PaymentDao;
import com.teksky.payment.entity.PaymentEntity;
import com.teksky.payment.model.Address;
import com.teksky.payment.model.PaymentRequest;
import com.teksky.payment.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentDao paymentDao;

	@Override
	public void collectPayment(PaymentRequest paymentReq) {
		
		//Business processing 
		//We will be populating Entity/DTO
		
		PaymentEntity entity = new PaymentEntity();
		
		entity.setTxnId("10001");
		entity.setFirstName(paymentReq.getFirstName());
		entity.setLastName(paymentReq.getLastName());
		
		List<Address> addrList = new ArrayList();
		
		addrList.add(paymentReq.getBillingAddr());
		if(paymentReq.getShippingAddr() != null) {
			addrList.add(paymentReq.getShippingAddr());
		}
		entity.setAddress(addrList);
		entity.setCreatedId("Indu");
		entity.setCreatedDt(new Date());
		
		paymentDao.savePayment(entity);
	}

	@Override
	public void cancelPayment(String transactionId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refundPayment(String transactionId) {
		// TODO Auto-generated method stub
		
	}

}
