package com.duck.domain;

import java.util.Date;
import java.util.Set;

public class Question{

	private Integer questionId;
	private String account;
	private java.util.Date pubDate;
	private String title;
	private String content;
	private String processingState;
	private Set<Reply> reply;

	public Set<Reply> getReply() {
		return reply;
	}

	public void setReply(Set<Reply> reply) {
		this.reply = reply;
	}

	public Question(){
	}
	
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public java.util.Date getPubDate() {
		return pubDate;
	}
	public void setPubDate(java.util.Date pubDate) {
		this.pubDate = pubDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getProcessingState() {
		return processingState;
	}
	public void setProcessingState(String processingState) {
		this.processingState = processingState;
	}
	
	
}
