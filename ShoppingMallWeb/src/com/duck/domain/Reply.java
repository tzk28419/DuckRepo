package com.duck.domain;

import java.util.Date;

public class Reply {

	private Integer replyId;
	private int questionId;
	private String account;
	private java.util.Date pubDate;
	private String content;
	private String ipAddr;
	private Question question;

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Reply() {}

	public Integer getReplyId() {
		return replyId;
	}
	public void setReplyId(Integer replyId) {
		this.replyId = replyId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIpAddr() {
		return ipAddr;
	}
	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
}
