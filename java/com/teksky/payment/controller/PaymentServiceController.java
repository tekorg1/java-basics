package com.teksky.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teksky.payment.model.PaymentRequest;
import com.teksky.payment.service.PaymentService;

@RestController
@RequestMapping("/payment/services/")
public class PaymentServiceController {
	
	@Autowired 
	PaymentService paymentService;

	//Submit Payment --> post 
	
	@PostMapping("/makePayment")
	public void makePayment(@RequestBody PaymentRequest paymenReq) {
	
		//Validation layer
		paymentService.collectPayment(paymenReq);
		//Service layer <--> DAO layer <--> database	
		
	}
}
