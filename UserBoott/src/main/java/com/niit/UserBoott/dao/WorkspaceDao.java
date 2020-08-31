package com.niit.UserBoott.dao;

import java.util.List;

import com.niit.UserBoott.model.Workspace;

public interface WorkspaceDao {

	List<Workspace> getWorkspaceByAdminEmailId(String emailId);

}
