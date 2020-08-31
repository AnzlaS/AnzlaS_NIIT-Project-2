package com.niit.UserBoott.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.niit.UserBoott.dao.CircleDao;
import com.niit.UserBoott.dao.UserDao;
import com.niit.UserBoott.model.Circle;
import com.niit.UserBoott.service.CircleService;

public class CircleServicedaoImpl implements CircleService {
	 @Autowired  
	    private CircleDao circledao;  
	      
	  
	      
	      @Override
	    public boolean save(Circle circle) {  
	        return circledao.save(circle);  
	    }  
	  
	      @Override
	    public List<Circle> getAllCircles() {  
	        return circledao.getAllCircles();  
	    }  
	  
	      @Override
	    public boolean delete(Circle circle) {  
	        return circledao.delete(circle);  
	    }  
	  
	      @Override
	    public List<Circle> list() {  
	        return circledao.list();  
	    }  
	  
	      @Override
	    public boolean update(Circle circle) {  
	        return circledao.update(circle);  
	    }

		@Override
		public Circle validate(String id, String password) {
			
			return circledao.validate(id, password);
		}

		@Override
		public boolean deleteCircle(String emailId, String circleName) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public UserDao getCircleByUSer(String emailId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean addCircle(Circle circle) {
			// TODO Auto-generated method stub
			return false;
		}

}
