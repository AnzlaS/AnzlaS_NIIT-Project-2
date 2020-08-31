package com.niit.UserBoott.service;

import java.util.List;

import com.niit.UserBoott.dao.UserDao;
import com.niit.UserBoott.model.Circle;



public interface CircleService {
	public boolean save(Circle circle);
	public boolean update(Circle circle);
	public boolean delete(Circle circle);
	public List<Circle> getAllCircles();
	public List<Circle> list();
	public Circle validate(String id,String password);
	public boolean deleteCircle(String emailId, String circleName);
	public UserDao getCircleByUSer(String emailId);
	public boolean addCircle(Circle circle);

}
