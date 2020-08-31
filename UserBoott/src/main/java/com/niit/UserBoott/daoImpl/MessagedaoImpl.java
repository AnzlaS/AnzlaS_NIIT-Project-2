package com.niit.UserBoott.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.UserBoott.dao.MessageDao;
import com.niit.UserBoott.model.UserMessage;

public class MessagedaoImpl implements MessageDao  {

	  @Autowired  
	    private SessionFactory sessionFactory;  
	@Override
	public boolean sendMessage(UserMessage usermessage) {
		  boolean status=false;  
	        try {  
	            sessionFactory.getCurrentSession().save(usermessage);  
	            status=true;  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        return status; 
	}


	

	@Override
	public List<UserMessage> getMyMessages(String emailId) {
		  return (List<UserMessage>)sessionFactory.getCurrentSession().get(UserMessage.class,emailId);
		
	}

}