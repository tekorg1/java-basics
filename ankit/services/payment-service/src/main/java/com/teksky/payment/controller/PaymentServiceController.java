package com.teksky.payment.controller;

import com.teksky.payment.entity.PaymentEntity;
import com.teksky.payment.model.PaymentRequest;
import com.teksky.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/payment/services/")
public class PaymentServiceController {

    @Autowired
    PaymentService paymentService;

//    @PostMapping("/makePayment")
//    public void collectPayment(@RequestBody PaymentEntity paymentEntity) {
//
//        //Validation layer
//        paymentService.collectPayment(paymentEntity);
//        //Service layer <--> DAO layer <--> database
//    }

    @PostMapping("/makePayment")
    public void savePaymentRequest(@RequestBody PaymentRequest paymentRequest) {
        paymentService.savePaymentRequest(paymentRequest);
    }

    @GetMapping("/getPayment")
    public List<PaymentEntity> getPayment(){

      return  paymentService.getPayment();
    }

//    @PutMapping("/updatePayment")
//    public void updatePayment(@RequestBody PaymentEntity paymentEntity){
//
//        paymentService.updatePayment(paymentEntity);
//    }

    @PutMapping("/{Id}/updateProfile")
    public void updatePayment(@RequestBody PaymentRequest paymentRequest, @PathVariable String paymentId) {
        paymentService.updatePaymentInformation(paymentRequest, paymentId);
    }

    @DeleteMapping(path = "/{Id}/deleteRequest")
    public long deletePayment(@RequestBody PaymentEntity paymentEntity, @PathVariable String paymentId){
        return paymentService.delete(paymentEntity, paymentId);

    }




}



