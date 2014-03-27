package com.duck.domain;

public class FAQ {

	private Integer faqId;
	private String question;
	private String answer;
	
	public Integer getFaqId() {
		return faqId;
	}
	public void setFaqId(Integer faqId) {
		this.faqId = faqId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public FAQ(){}
	
}
