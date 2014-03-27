package com.duck.dao.imp;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.duck.dao.IReplyDAO;
import com.duck.domain.Question;
import com.duck.domain.Reply;

public class ReplyDAO implements IReplyDAO{

	private SessionFactory sessionFactory;
	
	public ReplyDAO(){}
	
	public ReplyDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void addReply(Reply reply) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try{
			session.save(reply);
			tx.commit();
		}catch(HibernateException ex){
			tx.rollback();
			throw ex;
		}finally{
			session.close();
		}
	}

	@Override
	public void updateReply(Reply reply) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try{
			session.saveOrUpdate(reply);
			tx.commit();
		}catch(HibernateException ex){
			tx.rollback();
			throw ex;
		}finally{
			session.close();
		}
	}

	@Override
	public void deleteReply(Reply reply) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try{
			session.delete(reply);
			tx.commit();
		}catch(HibernateException ex){
			tx.rollback();
			throw ex;
		}finally{
			session.close();
		}
	}

	@Override
	public Reply getReplyById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Reply reply=(Reply) session.get(Reply.class, id);
		return reply;
	}

	@Override
	public List<ReplyDAO> getReplyByHql(String hql) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		return query.list();
	}

	@Override
	public List<ReplyDAO> getAllReply() {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		return session.createCriteria(Reply.class).list();	
	}
	

}
