package com.duck.dao;

import java.util.List;

import com.duck.dao.imp.ReplyDAO;
import com.duck.domain.Reply;

public interface IReplyDAO {

	public void addReply(Reply reply);
	public void updateReply(Reply reply);
	public void deleteReply(Reply reply);
	public Reply getReplyById(Integer id);
	public List<ReplyDAO> getReplyByHql(String hql);
	public List<ReplyDAO> getAllReply();
}
