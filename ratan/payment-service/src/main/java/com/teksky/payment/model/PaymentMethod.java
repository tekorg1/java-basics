package com.teksky.payment.model;

public class PaymentMethod {
    private CreditDebit creditDebit;
    private BankAccount bankAcoount;
    private Paypal payPal;

    public CreditDebit getCreditDebit() {
        return creditDebit;
    }

    public void setCreditDebit(CreditDebit creditDebit) {
        this.creditDebit = creditDebit;
    }

    public BankAccount getBankAcoount() {
        return bankAcoount;
    }

    public void setBankAcoount(BankAccount bankAcoount) {
        this.bankAcoount = bankAcoount;
    }

    public Paypal getPayPal() {
        return payPal;
    }

    public void setPayPal(Paypal payPal) {
        this.payPal = payPal;
    }
}
