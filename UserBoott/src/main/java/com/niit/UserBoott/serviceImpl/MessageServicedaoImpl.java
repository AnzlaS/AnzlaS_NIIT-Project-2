package com.niit.UserBoott.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.niit.UserBoott.dao.MessageDao;
import com.niit.UserBoott.model.Message;
import com.niit.UserBoott.model.UserMessage;
import com.niit.UserBoott.service.MessageService;



public class MessageServicedaoImpl implements MessageService {
	 @Autowired  
	    private MessageDao messagedao;  
	
	 @Override
	 public boolean sendMessage(UserMessage usermessage) {
	 return messagedao.sendMessage(usermessage);
	 }
	 @Override
	 public List<UserMessage> getMyMessages(String emailId){
		 return messagedao.getMyMessages(emailId);
	 }
	@Override
	public boolean sendMessage(Message message) {
		// TODO Auto-generated method stub
		return false;
	}
}
