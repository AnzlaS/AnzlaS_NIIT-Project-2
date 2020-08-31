package com.niit.UserBoott.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.niit.UserBoott.dao.UserDao;
import com.niit.UserBoott.model.User;
import com.niit.UserBoott.service.UserService;

public class UserServiceImpl implements UserService {

    @Autowired  
    private UserDao userdao;  
      
  
      
      @Override
    public boolean saveUser(User user) {  
        return userdao.saveUser(user);  
    }  
  
      @Override
    public List<User> getUser() {  
        return userdao.getUser();  
    }  
  
      @Override
    public boolean deleteUser(User user) {  
        return userdao.deleteUser(user);  
    }  
  
      @Override
    public List<User> getUserByID(User user) {  
        return userdao.getUserByID(user);  
    }  
  
      @Override
    public boolean updateUser(User user) {  
        return userdao.updateUser(user);  
    }

	@Override
	public List<User> list1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}


}