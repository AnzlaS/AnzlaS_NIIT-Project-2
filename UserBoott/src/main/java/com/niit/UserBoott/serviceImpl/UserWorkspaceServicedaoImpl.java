package com.niit.UserBoott.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.niit.UserBoott.service.UserWorkspaceService;

public class UserWorkspaceServicedaoImpl implements UserWorkspaceService {
	@Autowired
	private UserWorkspaceDao userworkspacedao;

public boolean sendInvitation(String companyName,String userEmailId) {
		return userworkspacedao.sendInvitation(companyName, userEmailId);
	}

	public boolean acceptInvitation(String companyName,String userEmailId) {
	return userworkspacedao.acceptInvitation(companyName, userEmailId);
}
	public boolean rejectInvitation(String companyName,String userEmailId) {
		return userworkspacedao.rejectInvitation(companyName, userEmailId);
	}
	public boolean removeUserFromWorkspace(String companyName,String userEmailId) {
		return userworkspacedao.removeUserFromWorkspace(companyName, userEmailId);
	}

}
