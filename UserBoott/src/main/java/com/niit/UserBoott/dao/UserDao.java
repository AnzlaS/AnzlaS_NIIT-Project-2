package com.niit.UserBoott.dao;

import java.util.List;

import com.niit.UserBoott.model.User;

public interface UserDao {
	public boolean saveUser(User user);  
    public List<User> getUser();  
    public boolean deleteUser(User user);  
    public List<User> getUserByID(User user);  
    public boolean updateUser(User user);
	
	}  


