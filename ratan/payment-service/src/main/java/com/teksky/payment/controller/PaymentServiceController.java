package com.teksky.payment.controller;

import com.teksky.payment.entity.PaymentServiceEntity;
import com.teksky.payment.model.PaymentRequest;
import com.teksky.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paymentrequest")
public class PaymentServiceController {

        @Autowired
        PaymentService paymentService;

        @PostMapping("/create")
        public void createPaymentService(@RequestBody PaymentRequest paymentRequest){
            paymentService.createPaymentService(paymentRequest);
        }

        @GetMapping("/read")
        public List<PaymentServiceEntity> findAllDetails(){
         return paymentService.findAllDetails();
        }

        @PutMapping("/update")
        public void updatePaymentService(@RequestBody PaymentServiceEntity paymentRequest){
        paymentService.updatePaymentService(paymentRequest);
        }

}
