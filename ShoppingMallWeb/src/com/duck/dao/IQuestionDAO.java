package com.duck.dao;

import java.util.List;

import com.duck.dao.imp.QuestionDAO;
import com.duck.domain.Question;

public interface IQuestionDAO {

	public void addQuestion(Question question);
	public void updateQuestion(Question question);
	public void deleteQuestion(Question question);
	public Question getQuestionById(Integer id);
	public List<QuestionDAO> getQuestionByHql(String hql);
	public List<QuestionDAO> getAllQuestion();

}
