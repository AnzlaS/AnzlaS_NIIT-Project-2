package com.niit.UserBoott.dao;

public interface UserWorkspaceDao {
boolean sendInvitation(String companyName,String userEmailId);
boolean acceptInvitation(String companyName,String userEmailId);
boolean rejectInvitation(String companyName,String userEmailId);
boolean removeUserFromWorkspace(String companyName,String userEmailId);
}
