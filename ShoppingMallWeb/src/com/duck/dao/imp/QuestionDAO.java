package com.duck.dao.imp;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.duck.dao.IQuestionDAO;
import com.duck.domain.Question;
import com.duck.domain.Reply;

public class QuestionDAO implements IQuestionDAO{

	private SessionFactory sessionFactory;
	
	public QuestionDAO(){}
	
	public QuestionDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addQuestion(Question question) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try{
			session.save(question);
			tx.commit();
		}catch(HibernateException e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@Override
	public void updateQuestion(Question question) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try{		
			session.saveOrUpdate(question);
			tx.commit();
		}catch(HibernateException e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@Override
	public void deleteQuestion(Question question) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try{
			session.delete(question);
			tx.commit();
		}catch(HibernateException e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@Override
	public Question getQuestionById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		Question question=(Question) session.get(Question.class, id);
		return question;
	}

	@Override
	public List<QuestionDAO> getQuestionByHql(String hql) {
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		Query query = session.createQuery(hql);
		return query.list();
	}

	@Override
	public List<QuestionDAO> getAllQuestion() {
		Session session=sessionFactory.getCurrentSession();
		//session.beginTransaction().begin();
		return session.createCriteria(Question.class).list();	
	}
}
