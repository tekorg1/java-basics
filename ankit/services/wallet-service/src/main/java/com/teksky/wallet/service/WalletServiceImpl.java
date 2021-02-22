package com.teksky.wallet.service;

import com.mongodb.client.result.DeleteResult;
import com.teksky.wallet.dao.WalletDao;
import com.teksky.wallet.entity.WalletEntity;
import com.teksky.wallet.model.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletServiceImpl implements WalletService {

    @Autowired
    private WalletDao walletDao;


    @Override
    public void saveWalletCashAndPaymentMethods(Wallet wallet) {

        WalletEntity walletEntity = new WalletEntity();
        walletEntity.setWalletId(wallet.getWalletId());
        walletEntity.setAmountInWallet(wallet.getAmountInWallet());
        walletEntity.setPaymentMethods(wallet.getPaymentMethods());
        walletDao.saveWalletCashAndPaymentMethodsIntoDb(walletEntity);
    }

    @Override
    public List<WalletEntity> retrieveWalletCashAndPaymentMethods() {
        return walletDao.retrieveWalletCashAndPaymentMethodsFromDb();
    }

    @Override
    public void updateWalletCashAndPaymentMethods(WalletEntity walletEntity, String walletId) {
        walletDao.updateWalletCashAndPaymentMethodsInDb(walletEntity, walletId);
    }

    @Override
    public void deleteWalletCashAndPaymentMethods(String walletId) {
        walletDao.deleteWalletCashAndPaymentMethodsFromDb(walletId);
    }

    @Override
    public List<WalletEntity> retrieveWalletCashAndPaymentMethodsById(String walletId) {
        return walletDao.retrieveWalletCashAndPaymentMethodsByIdFromDb(walletId);
    }
}
