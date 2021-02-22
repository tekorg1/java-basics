package com.teksky.wallet.service;

import com.mongodb.client.result.DeleteResult;
import com.teksky.wallet.entity.WalletEntity;
import com.teksky.wallet.model.Wallet;

import java.util.List;

public interface WalletService {

    void saveWalletCashAndPaymentMethods(Wallet wallet);

    List<WalletEntity> retrieveWalletCashAndPaymentMethods();

    void updateWalletCashAndPaymentMethods(WalletEntity walletEntity, String walletId);

    void deleteWalletCashAndPaymentMethods(String walletId);

    List<WalletEntity> retrieveWalletCashAndPaymentMethodsById(String walletId);
}
