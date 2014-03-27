package com.duck.domain;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.duck.dao.*;
import com.duck.dao.imp.*;

public class test {

	public static void main(String[] args) {

		        Configuration config = new Configuration().configure();
		        SessionFactory sessionFactory = config.buildSessionFactory();
		        
		        IQuestionDAO questionDAO = new QuestionDAO(sessionFactory);
		        Question question = new Question();
		        /*
		        //Question測試新增
		        question.setAccount("duck10");
		        question.setPubDate(new Date());
		        question.setTitle("hello10");
		        question.setContent("heeeeeellooooooooo10");
		        question.setProcessingState("未完成");
		        questionDAO.addQuestion(question);
		         
		        //Question測試修改
		        question = questionDAO.getQuestionById(8);
		        question.setContent("woooooorld");
		        questionDAO.updateQuestion(question);
		        
		        //Question測試刪除
		        question=questionDAO.getQuestionById(9);
		        questionDAO.deleteQuestion(question);
		        
		        //Question測試查詢
		        question = questionDAO.getQuestionById(8);
		        System.out.println(question.getReply().iterator().next().getPubDate());
		        
		        Iterator list=questionDAO.getAllQuestion().iterator();
		        while(list.hasNext()){
		        	Question ques= (Question) list.next();
		        	System.out.println(ques.getQuestionId());
		        }
		        */
                
		        IReplyDAO replyDAO=new ReplyDAO(sessionFactory);
		        Reply reply=new Reply();  
		        /*
		        //Reply測試新增
		        reply.setQuestionId(9);
		        reply.setAccount("duck5");
		        reply.setPubDate(new Date());
		        reply.setContent("hello");
		        reply.setIpAddr("1.1.1.1");
		        replyDAO.addReply(reply);
		        
		        //Reply測試修改
		        reply=replyDAO.getReplyById(4);
		        reply.setPubDate(new Date());
		        replyDAO.updateReply(reply);
		        
		        //Reply測試刪除
		        reply=replyDAO.getReplyById(1);
		        replyDAO.deleteReply(reply);
		        */
		        //Reply測試查詢
		        reply=replyDAO.getReplyById(4);
		        System.out.println(reply.getQuestion().getQuestionId());
		        
		        
		        /*	        
		        IFaqDAO faqDAO=new FaqDAO(sessionFactory);
		        FAQ faq=new FAQ();
		        
		        //FAQ測試新增
		        faq.setQuestion("問題1");
		        faq.setAnswer("回答1");
		        faqDAO.addFaq(faq);
		        
		        //FAQ測試修改
		        faq=faqDAO.getFaqById(5);
		        faq.setQuestion("問題3333333333333");
		        faqDAO.updateFaq(faq);
		        
		        //FAQ測試刪除
		        faq=faqDAO.getFaqById(1);
		        faqDAO.deleteFaq(faq);
		        */
		        /*
		        ICreditCardDAO ccDAO=new CreditCardDAO(sessionFactory);
		        CreditCard cc=new CreditCard();
		        
		        //CreditCard測試新增
		        cc.setCreditCardId(123);
		        cc.setType("visa");
		        cc.setCardholder("duck");
		        cc.setCardNo("123");
		        cc.setValidateNo("789");
		        cc.setExpireDate(new Date());
		        ccDAO.addCreditCard(cc);
		        
		        //CreditCard測試修改
		        cc=ccDAO.getCreditCardById(123456);
		        cc.setType("Master");
		        ccDAO.updateCreditCard(cc);
		        
		        //CreditCard測試刪除
		        cc=ccDAO.getCreditCardById(123458);
		        ccDAO.deleteCreditCard(cc);
		        */
	}

}
