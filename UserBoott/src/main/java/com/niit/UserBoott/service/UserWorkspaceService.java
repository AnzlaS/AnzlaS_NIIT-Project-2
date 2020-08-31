package com.niit.UserBoott.service;

public interface UserWorkspaceService {
	public interface UserWorkspaceDao {
		boolean sendInvitation(String companyName,String userEmailId);
		boolean acceptInvitation(String companyName,String userEmailId);
		boolean rejectInvitation(String companyName,String userEmailId);
		boolean removeUserFromWorkspace(String companyName,String userEmailId);
}

	
}