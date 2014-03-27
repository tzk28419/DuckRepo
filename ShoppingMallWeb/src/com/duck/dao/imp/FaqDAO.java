package com.duck.dao.imp;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.duck.dao.IFaqDAO;
import com.duck.domain.FAQ;
import com.duck.domain.Question;
import com.duck.domain.Reply;

public class FaqDAO implements IFaqDAO{

	private SessionFactory sessionFactory;
	
	public FaqDAO(){}
	
	public FaqDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addFaq(FAQ faq) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try{
			session.save(faq);
			tx.commit();
		}catch(HibernateException e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@Override
	public void updateFaq(FAQ faq) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try{
			session.saveOrUpdate(faq);
			tx.commit();
		}catch(HibernateException e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@Override
	public void deleteFaq(FAQ faq) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try{
			session.delete(faq);
			tx.commit();
		}catch(HibernateException e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@Override
	public FAQ getFaqById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		FAQ faq=(FAQ) session.get(FAQ.class, id);
		return faq;
	}

	@Override
	public List<FaqDAO> getFaqByHql(String hql) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		return query.list();
	}

	@Override
	public List<FaqDAO> getAllFaq() {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		return session.createCriteria(FAQ.class).list();	
	}

}
