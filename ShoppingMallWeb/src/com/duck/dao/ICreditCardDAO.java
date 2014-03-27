package com.duck.dao;

import java.util.List;

import com.duck.domain.CreditCard;

public interface ICreditCardDAO {

	public void addCreditCard(CreditCard creditcard);
	public void updateCreditCard(CreditCard creditcard);
	public void deleteCreditCard(CreditCard creditcard);
	public CreditCard getCreditCardById(Integer id);
	public List<CreditCard> getCreditCardByHql(String hql);
	public List<CreditCard> getAllCreditCard();
}
