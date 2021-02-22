package com.teksky.wallet.controller;

import com.teksky.wallet.entity.WalletEntity;
import com.teksky.wallet.model.Wallet;
import com.teksky.wallet.service.WalletService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service/wallet")
public class WalletController {

    private static final Logger LOGGER = LoggerFactory.getLogger(Wallet.class);

    @Autowired
    private WalletService walletService;


    @PostMapping(value = "/createWalletCashAndPaymentMethods", produces = {}, consumes = {})
    @ApiOperation(value = "Save Wallet Cash And Payment Methods", notes = "This method store's wallet cash and all payment method's detailed information")
    @ApiResponses({@ApiResponse(code = 201, message = "Successfully Saved Wallet Cash And Payment Methods", response = String.class)})
    public HttpStatus saveWalletCashAndPaymentMethods(@RequestBody Wallet wallet) {

        LOGGER.info("Wallet Service Controller:Inside (CREATE) save wallet cash and payment method - start");
        walletService.saveWalletCashAndPaymentMethods(wallet);
        LOGGER.info("Wallet Service Controller:Inside (CREATE) save wallet cash and payment method - end");
        return HttpStatus.OK;

    }

    @GetMapping(value = "/getWalletCashAndPaymentMethods", produces = {})
    @ApiOperation(value = "Retrieve Wallet Cash And Payment Methods", notes = "This method retrieves's wallet cash and all payment method's detailed information")
    @ApiResponses({@ApiResponse(code = 200, message = "Successfully Retrieve Wallet Cash And Payment Methods", response = String.class)})
    private List<WalletEntity> retrieveWalletCashAndPaymentMethods() {

        LOGGER.info("Wallet Service Controller:Inside (GET) wallet cash and payment method");
        return walletService.retrieveWalletCashAndPaymentMethods();
    }

    @GetMapping(value = "/getWalletCashAndPaymentMethods/{walletId}", produces = {})
    @ApiOperation(value = "Retrieve Wallet Cash And Payment Methods", notes = "This method retrieves's wallet cash and all payment method's detailed information")
    @ApiResponses({@ApiResponse(code = 200, message = "Successfully Retrieve Wallet Cash And Payment Methods", response = String.class)})
    private List<WalletEntity> retrieveWalletCashAndPaymentMethodsById(@PathVariable String walletId) {

        LOGGER.info("Wallet Service Controller:Inside (GET) wallet cash and payment method");
        return walletService.retrieveWalletCashAndPaymentMethodsById(walletId);
    }


    @PutMapping(value = "/{walletId}/updateWalletCashAndPaymentMethods", produces = {}, consumes = {})
    @ApiOperation(value = "Update Wallet Cash And Payment Methods", notes = "This method updates's wallet cash and all payment method's (or) saved payment method's information")
    @ApiResponses({@ApiResponse(code = 200, message = "Successfully Updated Wallet Cash And Payment Methods", response = String.class)})
    private void updateWalletCashAndPaymentMethods(@RequestBody WalletEntity walletEntity, @PathVariable String walletId) {

        LOGGER.info("Wallet Service Controller:Inside (PUT) update wallet cash and payment method");
        walletService.updateWalletCashAndPaymentMethods(walletEntity, walletId);
    }

    @DeleteMapping("/deleteWalletCashAndPaymentMethods/{walletId}")
    @ApiOperation(value = "Delete Wallet Cash And Payment Methods", notes = "This method delete's wallet cash and all payment method's information")
    @ApiResponses({@ApiResponse(code = 202, message = "Successfully Deleted Wallet Cash And Payment Methods", response = String.class)})
    @Transactional
    private void deleteWalletCashAndPaymentMethods(@PathVariable String walletId) {

        LOGGER.info("Wallet Service Controller:Inside (GET) delete wallet cash and payment method");
        walletService.deleteWalletCashAndPaymentMethods(walletId);

    }

}
