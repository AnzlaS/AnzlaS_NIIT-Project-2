package com.niit.UserBoott.dao;

import java.util.List;

import com.niit.UserBoott.model.Circle;
import com.niit.UserBoott.model.User;



public interface CircleDao {

	public boolean save(Circle circle);
	public boolean update(Circle circle);
	public boolean delete(Circle circle);
	public List<Circle> getAllCircles();
	public List<Circle> list();
	public Circle validate(String id,String password);

}
