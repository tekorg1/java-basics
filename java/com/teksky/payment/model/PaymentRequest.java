package com.teksky.payment.model;

public class PaymentRequest {
	
	private String firstName;
	
	private String lastName;
	
	private String emailId;
	
	private Address billingAddr;
	
	private Address shippingAddr;
	
	private PaymentMethod paymentMethod;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Address getBillingAddr() {
		return billingAddr;
	}

	public void setBillingAddr(Address billingAddr) {
		this.billingAddr = billingAddr;
	}

	public Address getShippingAddr() {
		return shippingAddr;
	}

	public void setShippingAddr(Address shippingAddr) {
		this.shippingAddr = shippingAddr;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
