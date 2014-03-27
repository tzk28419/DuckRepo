package com.duck.domain;

import java.util.Date;

public class CreditCard {

	private Integer creditCardId;
	private String type;
	private String cardholder;
	private String cardNo;
	private String validateNo;
	private java.util.Date expireDate;
	
	public CreditCard() {}

	public Integer getCreditCardId() {
		return creditCardId;
	}
	public void setCreditCardId(Integer creditCardId) {
		this.creditCardId = creditCardId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCardholder() {
		return cardholder;
	}
	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getValidateNo() {
		return validateNo;
	}
	public void setValidateNo(String validateNo) {
		this.validateNo = validateNo;
	}
	public java.util.Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(java.util.Date expireDate) {
		this.expireDate = expireDate;
	}
}
