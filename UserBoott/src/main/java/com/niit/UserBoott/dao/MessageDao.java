package com.niit.UserBoott.dao;

import java.util.List;

import com.niit.UserBoott.model.UserMessage;

public interface MessageDao {
	boolean sendMessage(UserMessage usermessage);
	
	List<UserMessage> getMyMessages(String emailId);
	
}
