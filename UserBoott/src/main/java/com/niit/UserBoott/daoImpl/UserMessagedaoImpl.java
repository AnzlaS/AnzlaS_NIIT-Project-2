package com.niit.UserBoott.daoImpl;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.UserBoott.dao.UserMessageDao;
import com.niit.UserBoott.model.Circle;
import com.niit.UserBoott.model.UserCircle;
import com.niit.UserBoott.model.UserMessage;
@Repository("UserMessgaeDao")
public class UserMessagedaoImpl implements UserMessageDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean sendMessage(UserMessage usermessage) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(usermessage);
			status=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean deleteMessage(int messageId) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(messageId);
			status=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<UserMessage> getMyMessages(String emailId) {
		Session session = null;
		try {
			session=sessionFactory.getCurrentSession();
			Query<UserMessage> query =session.createQuery("From Message");
			List<UserMessage> list=query.getResultList();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public List<UserMessage> getAllMessageByCircleName(String circleName) {
		// TODO Auto-generated method stub
		return (List<UserMessage>)sessionFactory.getCurrentSession().get(UserMessage.class, circleName);
	}

	@Override
	public boolean isReceiverExists(String receiverEmailId) {
		Session session=null;
		session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("#");
		query.setParameter("#",receiverEmailId);
		if(!query.getResultList().isEmpty()) {
			return false;
		}
	return true;
	}
	

	@Override
	public boolean isCircleExists(String circleName) {
		Session session=null;
		session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("#");
		query.setParameter("#",circleName);
		if(!query.getResultList().isEmpty()) {
			return false;
		}
	return true;
	}

	@Override
	public List<UserMessage> getAllMessageByUsers(String senderEmailId, String receiverEmailId) {
		// TODO Auto-generated method stub
		return (List<UserMessage>)sessionFactory.getCurrentSession().get(senderEmailId,receiverEmailId);
	}

}
