package com.niit.UserBoott.daoImpl;

import java.util.List;  


import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.query.Query;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;

import com.niit.UserBoott.dao.UserDao;
import com.niit.UserBoott.model.User;

public class UserdaoImpl implements UserDao {

    @Autowired  
    private SessionFactory sessionFactory;  
      
     
    public boolean saveUser (User user) {  
        boolean status=false;  
        try {  
            sessionFactory.getCurrentSession().save(user);  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
    }  
  
    
    public List<User> getUser() {  
        Session currentSession = sessionFactory.getCurrentSession();  
        Query<User> query=currentSession.createQuery("from User", User.class);  
        List<User> list=query.getResultList();  
        return list;  
    }  
  
   
    public boolean deleteUser(User user) {  
        boolean status=false;  
        try {  
            sessionFactory.getCurrentSession().delete(user);  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
    }  
  
    public List<User> getUserByID (User user) {  
        Session currentSession = sessionFactory.getCurrentSession();  
        Query<User> query=currentSession.createQuery("from User where User_id=:User_id", User.class);  
        query.setParameter("User_id", user.getUser_id());  
        List<User> list=query.getResultList();  
        return list;  
    }  
  
    
    public boolean updateUser(User user) {  
        boolean status=false;  
        try {  
            sessionFactory.getCurrentSession().update(user);  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
    }


}