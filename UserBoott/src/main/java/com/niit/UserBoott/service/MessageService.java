package com.niit.UserBoott.service;

import java.util.List;

import com.niit.UserBoott.model.Message;
import com.niit.UserBoott.model.UserMessage;

public interface MessageService {
boolean sendMessage(Message message);
	
	List<UserMessage> getMyMessages(String emailId);

	boolean sendMessage(UserMessage usermessage);
}
