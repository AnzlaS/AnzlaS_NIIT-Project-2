package com.niit.UserBoott.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Entity
@Component
public class UserWorkspace {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int userWorkspaceId;
private String companyName;
private String userEmailId;
private char status;
public UserWorkspace() {
	
}
public UserWorkspace(String companyName, String userEmailId, char status) {
	super();
	this.companyName = companyName;
	this.userEmailId = userEmailId;
	this.status = status;
}
public int getUserWorkspaceId() {
	return userWorkspaceId;
}
public void setUserWorkspaceId(int userWorkspaceId) {
	this.userWorkspaceId = userWorkspaceId;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getUserEmailId() {
	return userEmailId;
}
public void setUserEmailId(String userEmailId) {
	this.userEmailId = userEmailId;
}
public char getStatus() {
	return status;
}
public void setStatus(char status) {
	this.status = status;
}
@Override
public String toString() {
	return "UserWorkspace [userWorkspaceId=" + userWorkspaceId + ", companyName=" + companyName + ", userEmailId="
			+ userEmailId + ", status=" + status + "]";
}

}
