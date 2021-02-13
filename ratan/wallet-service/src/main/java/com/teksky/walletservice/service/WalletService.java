package com.teksky.walletservice.service;

import com.teksky.walletservice.dao.WalletDao;
import com.teksky.walletservice.entity.WalletEntity;
import com.teksky.walletservice.model.Bank;
import com.teksky.walletservice.model.Card;
import com.teksky.walletservice.model.PaymentMethods;
import com.teksky.walletservice.model.Paypal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WalletService {

    @Autowired
    WalletDao walletDao;

    public void createWallet(PaymentMethods paymentMethods) {
        WalletEntity entity = new WalletEntity();

        entity.setTxnId("123132");
        entity.setPaymentId(paymentMethods.getPaymentId());
        entity.setCard(paymentMethods.getCard());
        entity.setBank(paymentMethods.getBank());
        entity.setPaypal(paymentMethods.getPaypal());
        entity.setCreatedId("ratan");
        entity.setCreateDate(new Date());

        walletDao.createWallet(entity);

    }

    public List<WalletEntity> findAll() {
        return walletDao.findAll();
    }

    public void updateWallet(PaymentMethods paymentMethods, String paymentId) {

        walletDao.updateWallet(paymentMethods, paymentId);
    }


}
