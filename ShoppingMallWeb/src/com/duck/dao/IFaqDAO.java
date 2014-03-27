package com.duck.dao;

import java.util.List;

import com.duck.dao.imp.FaqDAO;
import com.duck.domain.FAQ;


public interface IFaqDAO {

	public void addFaq(FAQ faq);
	public void updateFaq(FAQ faq);
	public void deleteFaq(FAQ faq);
	public FAQ getFaqById(Integer id);
	public List<FaqDAO> getFaqByHql(String hql);
	public List<FaqDAO> getAllFaq();
}
