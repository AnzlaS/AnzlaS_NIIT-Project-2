package com.niit.UserBoott.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.UserBoott.dao.WorkspaceDao;
import com.niit.UserBoott.model.Workspace;

public class WorkspacedaoImpl implements WorkspaceDao{
@Autowired
private SessionFactory sessionFactory;
public boolean createWorkspace(Workspace workspace) {
	boolean status=false;

try {
	sessionFactory.getCurrentSession().save(workspace);
}
catch(Exception e) {
	e.printStackTrace();
}
return status;
}
@Override
public List<Workspace> getWorkspaceByAdminEmailId(String emailId){
	return (List<Workspace>)sessionFactory.getCurrentSession().get(Workspace.class, emailId);
}
}