package com.teksky.payment.service;

import com.teksky.payment.model.PaymentRequest;

public interface PaymentService {
	
	public void collectPayment(PaymentRequest paymentReq);
	
	public void cancelPayment(String transactionId);
	
	public void refundPayment(String transactionId);

}
