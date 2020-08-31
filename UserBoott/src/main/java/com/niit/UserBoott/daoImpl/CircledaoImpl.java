package com.niit.UserBoott.daoImpl;

import java.util.List;


import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;

import com.niit.UserBoott.dao.CircleDao;
import com.niit.UserBoott.model.Circle;
import com.niit.UserBoott.model.User;

public class CircledaoImpl implements CircleDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean save(Circle circle) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(circle);
			status=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean update(Circle circle) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(circle);
			status=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Circle> getAllCircles() {
		
	Session currentSession=	(Session) sessionFactory.getCurrentSession();
			Query<Circle>query=((org.hibernate.Session) currentSession).createQuery("#",Circle.class);
		List<Circle> list=query.getResultList();
		return list;
	}

	@Override
	public boolean delete(Circle circle) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(circle);
			status=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	@Override
	public Circle validate(String id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Circle> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
