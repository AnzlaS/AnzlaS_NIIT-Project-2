package com.niit.UserBoott.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.niit.UserBoott.dao.WorkspaceDao;
import com.niit.UserBoott.model.Workspace;
import com.niit.UserBoott.service.WorkspaceService;

public class WorkspaceServicedaoImpl implements WorkspaceService{
@Autowired
private WorkspaceDao workspacedao;
@Override
public List<Workspace> getWorkspaceByAdminEmailId(String emailId){
	return workspacedao.getWorkspaceByAdminEmailId(emailId);
}
@Override
public boolean createWorkspace(Workspace workspace) {
	// TODO Auto-generated method stub
	return false;
}
}
