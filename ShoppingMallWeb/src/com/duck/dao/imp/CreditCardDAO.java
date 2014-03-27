package com.duck.dao.imp;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.duck.dao.ICreditCardDAO;
import com.duck.domain.CreditCard;
import com.duck.domain.FAQ;

public class CreditCardDAO implements ICreditCardDAO{

private SessionFactory sessionFactory;
	
	public CreditCardDAO(){}
	
	public CreditCardDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addCreditCard(CreditCard creditcard) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try{
			session.save(creditcard);
			tx.commit();
		}catch(HibernateException e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@Override
	public void updateCreditCard(CreditCard creditcard) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try{
			session.saveOrUpdate(creditcard);
			tx.commit();
		}catch(HibernateException e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@Override
	public void deleteCreditCard(CreditCard creditcard) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try{
			session.delete(creditcard);
			tx.commit();
		}catch(HibernateException e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@Override
	public CreditCard getCreditCardById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		CreditCard creditcard=(CreditCard) session.get(CreditCard.class, id);
		return creditcard;
	}

	@Override
	public List<CreditCard> getCreditCardByHql(String hql) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		return query.list();
	}

	@Override
	public List<CreditCard> getAllCreditCard() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		return session.createCriteria(FAQ.class).list();	
	}
	

}
