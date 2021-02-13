package com.teksky.wallet.dao;

import com.mongodb.client.result.DeleteResult;
import com.teksky.wallet.entity.WalletEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WalletDaoImpl implements WalletDao {

    @Autowired
  private   MongoTemplate mongoTemplate;
    @Override
    public void saveWalletCashAndPaymentMethodsIntoDb(WalletEntity walletEntity) {
        mongoTemplate.save(walletEntity);
    }

    @Override
    public List<WalletEntity> retrieveWalletCashAndPaymentMethodsFromDb() {
        return mongoTemplate.findAll(WalletEntity.class);
    }

    @Override
    public void updateWalletCashAndPaymentMethodsInDb(WalletEntity walletEntity, String walletId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("wallet_id").is(walletId));
        Update update = new Update();
        update.set("amount_in_wallet", walletEntity.getAmountInWallet());
        update.set("payment_methods", walletEntity.getPaymentMethods());
        //mongoTemplate.findAndModify(query, update, Entity.class);
        mongoTemplate.updateMulti(query, update, WalletEntity.class);    }

    @Override
    public void deleteWalletCashAndPaymentMethodsFromDb(String walletId) {
//        Query query = new Query();
////        mongoTemplate.remove(walletId, WalletEntity.class);
//    mongoTemplate.findAndRemove(query,WalletEntity.class,walletId);

//    mongoTemplate.findById(walletId,WalletEntity.class);
//    mongoTemplate.remove(WalletEntity.class);
//        mongoTemplate.remove(walletEntity,walletId);
//        mongoTemplate.remove(new Query(Criteria.where("wallet_id").is(walletEntity.getWalletId())), WalletEntity.class);
//        mongoTemplate.remove(new Query(Criteria.where("wallet_id").is(walletId)))
     Query query = new Query();
     query.addCriteria(Criteria.where("wallet_id").is(walletId));
     mongoTemplate.remove(query, WalletEntity.class);


    }

    @Override
    public List<WalletEntity> retrieveWalletCashAndPaymentMethodsByIdFromDb(String walletId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("wallet_id").is(walletId));
        return mongoTemplate.find(query, WalletEntity.class);
    }
}
