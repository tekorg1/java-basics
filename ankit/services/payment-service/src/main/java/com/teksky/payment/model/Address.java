package com.teksky.payment.model;

public class Address {

    private BillingAddress billingAddress;
    private ShippingAddress shippingAddres;

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public ShippingAddress getShippingAddres() {
        return shippingAddres;
    }

    public void setShippingAddres(ShippingAddress shippingAddress) {
        this.shippingAddres = shippingAddress;
    }
}
