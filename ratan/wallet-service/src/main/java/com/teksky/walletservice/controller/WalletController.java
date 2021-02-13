package com.teksky.walletservice.controller;

import com.teksky.walletservice.entity.WalletEntity;
import com.teksky.walletservice.model.PaymentMethods;
import com.teksky.walletservice.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wallet/service")
public class WalletController {

    @Autowired
    WalletService walletService;

    @PostMapping("/create")
    public void createWallet(@RequestBody PaymentMethods paymentMethods){
        walletService.createWallet(paymentMethods);
    }

    @GetMapping("/read")
    public List<WalletEntity> findAll(){
        return walletService.findAll();
    }

    @PutMapping("/{Id}/updateWallet")
    public void updateWallet(@RequestBody PaymentMethods paymentMethods,@PathVariable String paymentId){
        walletService.updateWallet(paymentMethods, paymentId);
    }
}
