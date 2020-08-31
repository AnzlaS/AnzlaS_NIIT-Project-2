package com.niit.UserBoott.service;

import java.util.List;

import com.niit.UserBoott.model.Workspace;

public interface WorkspaceService {
	List<Workspace> getWorkspaceByAdminEmailId(String emailId);

	boolean createWorkspace(Workspace workspace);
}
