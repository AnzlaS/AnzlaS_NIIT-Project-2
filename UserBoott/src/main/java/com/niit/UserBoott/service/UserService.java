package com.niit.UserBoott.service;

import java.util.List;

import com.niit.UserBoott.model.User;

public interface UserService {

	 public boolean saveUser(User user);  
	    public List<User> getUser();  
	    public boolean deleteUser(User user);  
	    public List<User> getUserByID(User user);  
	    public boolean updateUser(User user);
		public List<User> list1();
		public List<User> list();
		  

}
