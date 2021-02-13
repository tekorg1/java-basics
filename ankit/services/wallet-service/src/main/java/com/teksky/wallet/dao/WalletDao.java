package com.teksky.wallet.dao;

import com.mongodb.client.result.DeleteResult;
import com.teksky.wallet.entity.WalletEntity;

import java.util.List;

public interface WalletDao {
    void saveWalletCashAndPaymentMethodsIntoDb(WalletEntity walletEntity);

    List<WalletEntity> retrieveWalletCashAndPaymentMethodsFromDb();

    void updateWalletCashAndPaymentMethodsInDb(WalletEntity walletEntity, String walletId);

    void deleteWalletCashAndPaymentMethodsFromDb(String walletId);

    List<WalletEntity> retrieveWalletCashAndPaymentMethodsByIdFromDb(String walletId);
}
