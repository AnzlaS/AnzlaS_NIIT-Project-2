package com.niit.UserBoott.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.UserBoott.dao.UserCircleDao;
import com.niit.UserBoott.model.UserCircle;

public class UserCircledaoImpl implements UserCircleDao {
  @Autowired
  private SessionFactory sessionFactory;
	@Override
	public boolean addUserToCircle(String emailId, String circleName) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(emailId,circleName);
			status=true;
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean deleteUserFromCircle(String emailId, String circleName) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(emailId,circleName);
			status=true;
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	

	@Override
	public List<String> getUsersOfCircle(String circleName) {
		// TODO Auto-generated method stub
		return (List<String>)sessionFactory.getCurrentSession().get(UserCircle.class, circleName);
	}

}
