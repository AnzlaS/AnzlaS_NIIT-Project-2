package com.niit.UserBoott.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.niit.UserBoott.dao.UserCircleDao;
import com.niit.UserBoott.service.UserCircleService;

public class UserCircleServicedaoImpl implements UserCircleService {
	 @Autowired  
	    private UserCircleDao usercircledao;  
	      
	  
	      
	     @Override
	    public boolean addUserToCircle(String emailId,String circleName) {  
	        return usercircledao.addUserToCircle(emailId,circleName);  
	    }  
	  
	     @Override
	    public boolean deleteUserFromCircle(String emailId,String circleName) {  
	        return usercircledao.deleteUserFromCircle(emailId,circleName);  
	    }  
	     @Override
	    public List<String> getUsersOfCircle(String circleName) {  
	        return usercircledao.getUsersOfCircle(circleName); 
}
}